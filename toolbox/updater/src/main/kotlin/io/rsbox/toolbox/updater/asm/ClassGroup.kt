package io.rsbox.toolbox.updater.asm

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.jar.JarFile

class ClassGroup(val env: ClassEnv, val shared: Boolean) {

    lateinit var file: File private set

    val otherGroup get() = if(env.groupA == this) env.groupB else env.groupA

    fun isGroupA() = this == env.groupA
    fun isGroupB() = this == env.groupB

    private val classMap = hashMapOf<String, ClassEntry>()
    val classes get() = classMap.values

    private val arrayClassMap = hashMapOf<String, ClassEntry>()
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
            val node = AsmUtil.readClass(Files.readAllBytes(path))
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
            null,
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

    fun process() {
        classes.forEach { processA(it) }
    }

    private fun processA(cls: ClassEntry) {
        val cn = cls.node
        cn.methods.forEach { mn ->
            val method = MethodEntry(cls, mn)
            method.returnType = getOrCreateClass(method.type.returnType.internalName)
            method.argumentTypes.addAll(method.type.argumentTypes.map { getOrCreateClass(it.internalName) })
            cls.addMethod(method)
        }
        cn.fields.forEach { fn ->
            val field = FieldEntry(cls, fn)
            field.typeClass = getOrCreateClass(field.desc)
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
}