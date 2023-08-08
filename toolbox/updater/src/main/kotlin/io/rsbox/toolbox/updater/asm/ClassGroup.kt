package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.asm.util.AsmUtil
import io.rsbox.toolbox.updater.util.identityHashSetOf
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.TypeInsnNode
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayDeque
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import java.util.jar.JarFile


class ClassGroup(val env: ClassEnv, val shared: Boolean) {

    lateinit var file: File private set

    val otherGroup get() = if(env.groupA == this) env.groupB else env.groupA

    fun isGroupA() = this == env.groupA
    fun isGroupB() = this == env.groupB

    private val classMap = ConcurrentHashMap<String, ClassEntry>()
    val classes get() = classMap.values

    private val arrayClassMap = ConcurrentHashMap<String, ClassEntry>()
    val arrayClasses get() = arrayClassMap.values

    fun addClass(cls: ClassEntry): Boolean {
        if(classMap.containsKey(cls.name)) return false
        cls.init(this)
        classMap[cls.name] = cls
        return true
    }

    fun addArrayClass(cls: ClassEntry): Boolean {
        if(arrayClassMap.containsKey(cls.name)) return false
        cls.init(this)
        arrayClassMap[cls.name] = cls
        return true
    }

    fun getClass(name: String) = classMap[name] ?: arrayClassMap[name]
    fun getClassById(id: String) = getClass(if(id[0] == '[') id else if(id[0] == 'L') id.substring(1, id.length - 1) else id)

    fun getOrCreateClass(className: String): ClassEntry {
        val name = if(className[0] == '[') className else if(className[0] == 'L') className.substring(1, className.length - 1) else className

        var ret = getClass(name)
        if(ret != null) return ret

        ret = env.sharedGroup.getClass(name)
        if(ret != null) return ret

        var path: Path? = null

        val url = ClassGroup::class.java.getResource("/$name.class") ?: ClassLoader.getSystemResource("$name.class")
        if(url != null) {
            try {
                val uri = url.toURI()
                path = Paths.get(uri)
                if(uri.scheme == "jrt" && !Files.exists(path)) {
                    path = Paths.get(URI(uri.scheme, uri.userInfo, uri.host, uri.port, "/modules${uri.path}", uri.query, uri.fragment))
                }
            } catch(e: Exception) {
                /* Do Nothing */
            }
        }

        if(path != null) {
            val node = AsmUtil.readClass(Files.readAllBytes(path), ClassReader.SKIP_CODE)
            val cls = ClassEntry(node)
            if(env.sharedGroup.addClass(cls)) {
                processA(cls)
            }
            return cls
        }

        val node = ClassNode()
        node.visit(
            V1_8,
            ACC_PUBLIC or ACC_SUPER,
            name,
            null,
            "java/lang/Object",
            emptyArray()
        )

        val cls = ClassEntry(node).apply {
            if(name[0] == '[') {
                val type = Type.getType(name)
                elementClass = getOrCreateClass(type.elementType.internalName)
                elementClass!!.arrayClasses.add(this)
            }
        }

        if(cls.isArray()) {
            cls.elementClass!!.group.addArrayClass(cls)
        } else {
            env.sharedGroup.addClass(cls)
        }

        return cls
    }

    fun init(file: File) {
        this.file = file
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    val node = AsmUtil.readClass(bytes)
                    val cls = ClassEntry(node)
                    addClass(cls)
                }
            }
        }
    }

    /**
     * ===== CLASS GROUP INFO PROCESSING =====
     */

    private var processStep = 0

    fun process() {
        /*
         * Make sure we load the base jvm object class first.
         * This way we know for sure it's the most common ancestor of our
         * class group hierarchy.
         */
        getOrCreateClass("java/lang/Object")

        processStep++
        val initClasses = mutableListOf<ClassEntry>().also { it.addAll(classes) }

        initClasses.forEach { cls ->
            processA(cls)
        }

        repeat(3) { step ->
            processStep++
            initClasses.clear()
            initClasses.addAll(classes)

            initClasses.forEach { cls ->
                when(step) {
                    0 -> processB(cls)
                    1 -> processC(cls)
                    2 -> processD(cls)
                }
            }
        }

        processStep++

        var classIndex = 0
        val virtualMethodIndex = AtomicInteger()

        initClasses.forEach { cls ->
            val curClassIndex = if(cls.isNameObfuscated()) classIndex++ else -1
            processE(cls, curClassIndex, virtualMethodIndex)
        }

        processStep++
    }

    private fun processA(cls: ClassEntry) {
        val cn = cls.node
        cn.methods.forEach { mn ->
            val method = MethodEntry(cls, mn)
            method.init()
            cls.addMethod(method)
        }
        cn.fields.forEach { fn ->
            val field = FieldEntry(cls, fn)
            field.init()
            cls.addField(field)
        }

        run {
            if(cls.outerClass == null) {
                if(cn.outerClass != null) {
                    addOuterClass(cls, cn.outerClass)
                } else {
                    cn.innerClasses.forEach { ic ->
                        if(ic.name == cn.name) {
                            if(ic.outerName == null) {
                                return@forEach
                            } else {
                                addOuterClass(cls, ic.outerName)
                                return@run
                            }
                        }
                    }

                    val pos = cn.name.lastIndexOf('$')
                    if(pos > 0 && pos < cn.name.length - 1) {
                        addOuterClass(cls, cn.name.substring(0, pos))
                    }
                }
            }
        }

        if(cls.superClass == null && cls.node.superName != null) {
            cls.superClass = getOrCreateClass(cls.node.superName)
            cls.superClass?.childClasses?.add(cls)
            cls.node.interfaces.map { getOrCreateClass(it) }.forEach { itf ->
                cls.interfaces.add(itf)
                itf.implementers.add(cls)
            }
        }
    }

    private fun addOuterClass(cls: ClassEntry, name: String) {
        var outerCls = cls.group.getClass(name)
        if(outerCls == null) {
            outerCls = cls.group.getOrCreateClass(name)
        }
        cls.outerClass = outerCls
        outerCls.innerClasses.add(cls)
    }

    private fun processB(cls: ClassEntry) {
        cls.methods.forEach { method ->
            if(method.phantom) return
            method.instructions.forEach insnLoop@ { insn ->
                when(insn) {
                    // Process method instruction
                    is MethodInsnNode -> {
                        val owner = getOrCreateClass(insn.owner)
                        val dst = owner.resolveMethod(insn.name, insn.desc, insn.itf || insn.opcode == INVOKEINTERFACE) ?: return@insnLoop

                        dst.refsIn.add(method)
                        method.refsOut.add(dst)
                        dst.cls.methodTypeRefs.add(method)
                        method.classRefs.add(dst.cls)
                    }

                    // Process field instruction
                    is FieldInsnNode -> {
                        val owner = getOrCreateClass(insn.owner)
                        val dst = owner.resolveField(insn.name, insn.desc) ?: return@insnLoop

                        if(insn.opcode == GETSTATIC || insn.opcode == GETFIELD) {
                            dst.readsRefs.add(method)
                            method.fieldReadRefs.add(dst)
                        } else {
                            dst.writesRefs.add(method)
                            method.fieldWriteRefs.add(dst)
                        }

                        dst.cls.methodTypeRefs.add(method)
                        method.classRefs.add(dst.cls)
                    }

                    // Process type instruction
                    is TypeInsnNode -> {
                        val dst = getOrCreateClass(insn.desc)

                        dst.methodTypeRefs.add(method)
                        method.classRefs.add(dst)
                    }
                }
            }
        }
    }

    private fun processC(cls: ClassEntry) {
        val queue = ArrayDeque<ClassEntry>()
        val visited = identityHashSetOf<ClassEntry>()

        cls.methods.forEach method@ { method ->
            queue.clear()
            visited.clear()

            if(method.isConstructor() || method.isInitializer()) return@method
            if(method.isHierarchyBarrier()) return@method

            if(method.cls.superClass != null) queue.add(method.cls.superClass!!)
            queue.addAll(method.cls.interfaces)

            var c = method.cls
            while(queue.poll()?.also { c = it } != null) {
                if(!visited.add(c)) continue

                val m = c.getMethod(method.name, method.desc)

                if(m != null && !m.isHierarchyBarrier()) {
                    method.parents.add(m)
                    m.children.add(method)
                } else {
                    if(c.superClass != null) queue.add(c.superClass!!)
                    queue.addAll(c.interfaces)
                }
            }
        }

        cls.fields.forEach field@ { field ->
            queue.clear()
            visited.clear()

            if(field.isHierarchyBarrier()) return@field

            if(field.cls.superClass != null) queue.add(field.cls.superClass!!)
            queue.addAll(field.cls.interfaces)

            var c = field.cls
            while(queue.poll()?.also { c = it } != null) {
                if(!visited.add(c)) continue

                val f = c.getField(field.name, field.desc)

                if(f != null && !f.isHierarchyBarrier()) {
                    field.parents.add(f)
                    f.children.add(field)
                } else {
                    if(c.superClass != null) queue.add(c.superClass!!)
                    queue.addAll(c.interfaces)
                }
            }
        }
    }

    private fun processD(cls: ClassEntry) {
        cls.methods.forEach method@ { method ->
            val queue = ArrayDeque<MethodEntry>()
            val visited = identityHashSetOf<MethodEntry>()

            if(method.hierarchy != null) return@method

            queue.add(method)
            visited.add(method)

            var nameObf = true

            var m = method
            while(queue.poll()?.also { m = it } != null) {
                if (m.hierarchy != null) {
                    visited.addAll(m.hierarchy!!)
                } else {
                    m.parents.forEach { if (visited.add(it)) queue.add(it) }
                    m.children.forEach { if (visited.add(it)) queue.add(it) }
                }
                nameObf = nameObf and m.nameObfuscated
            }

            visited.forEach {
                it.hierarchy = identityHashSetOf(visited)
                it.nameObfuscated = it.nameObfuscated and nameObf
            }
        }

        cls.fields.forEach field@ { field ->
            val queue = ArrayDeque<FieldEntry>()
            val visited = identityHashSetOf<FieldEntry>()

            if(field.hierarchy != null) return@field

            queue.add(field)
            visited.add(field)

            var nameObf = true

            var f = field
            while(queue.poll()?.also { f = it } != null) {
                if (f.hierarchy != null) {
                    visited.addAll(f.hierarchy!!)
                } else {
                    f.parents.forEach { if (visited.add(it)) queue.add(it) }
                    f.children.forEach { if (visited.add(it)) queue.add(it) }
                }
                nameObf = nameObf and f.nameObfuscated
            }

            visited.forEach {
                it.hierarchy = identityHashSetOf(visited)
                it.nameObfuscated = it.nameObfuscated and nameObf
            }
        }
    }

    private fun processE(cls: ClassEntry, currentClassIndex: Int, virtualMethodIndex: AtomicInteger) {
        val groupName = if(isGroupA()) "a" else "b"

        if(cls.isNameObfuscated()) {
            cls.tempName = "c$groupName$currentClassIndex"
        }

        var memberIndex = 0

        for(method in cls.methods) {
            if(!method.isNameObfuscated()) continue

            if(method.hierarchy!!.isEmpty()) {
                method.tempName = "m$groupName$memberIndex"
                memberIndex++
            } else if(!method.hasTempName()) {
                val name = "vm$groupName${virtualMethodIndex.getAndIncrement()}"
                method.tempName = name
            }
        }

        memberIndex = 0

        for(field in cls.fields) {
            if(!field.isNameObfuscated()) continue

            field.tempName = "f$groupName$memberIndex"
            memberIndex++
        }
    }

    private fun MemberEntry<*>.isHierarchyBarrier(): Boolean {
        return (access and (ACC_PRIVATE or ACC_STATIC)) != 0
    }
}