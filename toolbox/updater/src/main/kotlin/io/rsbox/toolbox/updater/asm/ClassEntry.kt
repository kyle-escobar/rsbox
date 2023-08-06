package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.util.identityHashSetOf
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.util.ArrayDeque

class ClassEntry(val node: ClassNode) : Matchable<ClassEntry>() {

    lateinit var group: ClassGroup

    val env get() = group.env
    fun isShared() = group.shared

    override val name = node.name

    var elementClass: ClassEntry? = null
    val arrayClasses = identityHashSetOf<ClassEntry>()

    val access = node.access

    var superClass: ClassEntry? = null
    val childClasses = identityHashSetOf<ClassEntry>()
    val interfaces = identityHashSetOf<ClassEntry>()
    val implementers = identityHashSetOf<ClassEntry>()

    var outerClass: ClassEntry? = null
    val innerClasses = identityHashSetOf<ClassEntry>()

    private val methodMap = hashMapOf<String, MethodEntry>()
    val methods get() = methodMap.values

    private val fieldMap = hashMapOf<String, FieldEntry>()
    val fields get() = fieldMap.values

    fun init(group: ClassGroup) {
        this.group = group

        if(name[0] == '[') {
            val type = Type.getType(name)
            elementClass = group.getOrCreateClass(type.elementType.internalName)
            elementClass!!.arrayClasses.add(this)
        }

        if(isShared()) {
            match = this
        }
    }

    fun addMethod(method: MethodEntry) {
        if(methodMap.containsKey(method.id)) return
        methodMap[method.id] = method
    }

    fun addField(field: FieldEntry) {
        if(fieldMap.containsKey(field.id)) return
        fieldMap[field.id] = field
    }

    fun getMethod(name: String, desc: String) = methodMap["$name$desc"]
    fun getField(name: String, desc: String) = fieldMap["$name:$desc"]

    fun resolveMethod(name: String, desc: String, toInterface: Boolean): MethodEntry? {
        if(!toInterface) {
            var ret = getMethod(name, desc)
            if(ret != null) return ret

            var cls = this
            while(cls.superClass?.also { cls = it } != null)  {
                ret = cls.getMethod(name, desc)
                if(ret != null) return ret
            }

            return resolveInterfaceMethod(name, desc)
        } else {
            var ret = getMethod(name, desc)
            if(ret != null) return ret

            if(superClass != null) {
                ret = superClass!!.getMethod(name, desc)
                if(ret != null && (ret.access and (ACC_PUBLIC or ACC_STATIC)) == ACC_PUBLIC) return ret
            }

            return resolveInterfaceMethod(name, desc)
        }
    }

    private fun resolveInterfaceMethod(name: String, desc: String): MethodEntry? {
        val queue = ArrayDeque<ClassEntry>()
        val visited = identityHashSetOf<ClassEntry>()

        var cls = this
        do {
            cls.interfaces.forEach { itf ->
                if(visited.add(itf)) queue.add(itf)
            }
        } while(cls.superClass?.also { cls = it } != null)

        if(queue.isEmpty()) return null

        val matches = identityHashSetOf<MethodEntry>()
        var foundNonAbstract = false

        while(queue.poll()?.also { cls = it } != null) {
            val ret = cls.getMethod(name, desc)
            if(ret != null && (ret.access and (ACC_PRIVATE or ACC_STATIC)) == 0) {
                matches.add(ret)
                if((ret.access and ACC_ABSTRACT) == 0) {
                    foundNonAbstract = true
                }
            }

            cls.interfaces.forEach { itf ->
                if(visited.add(itf)) queue.add(itf)
            }
        }

        if(matches.isEmpty()) return null
        if(matches.size == 1) return matches.iterator().next()

        if(foundNonAbstract) {
            val itr = matches.iterator()
            for(m in itr) {
                if((m.access and ACC_ABSTRACT) != 0) {
                    itr.remove()
                }
            }
            if(matches.size == 1) return matches.iterator().next()
        }

        val itr = matches.iterator()
        for(m in itr) {
            cmpLoop@ for(m2 in matches) {
                if(m2 == m) continue
                if(m2.cls.interfaces.contains(m.cls)) {
                    itr.remove()
                    break
                }

                queue.addAll(m2.cls.interfaces)

                while(queue.poll()?.also { cls = it } != null) {
                    if(cls.interfaces.contains(m.cls)) {
                        itr.remove()
                        queue.clear()
                        break@cmpLoop
                    }
                    queue.addAll(cls.interfaces)
                }
            }
        }

        return matches.iterator().next()
    }

    fun resolveField(name: String, desc: String): FieldEntry? {
        var ret = getField(name, desc)
        if(ret != null) return ret

        if(interfaces.isNotEmpty()) {
            val queue = ArrayDeque<ClassEntry>()
            queue.addAll(interfaces)

            var cls = this
            while(queue.pollFirst()?.also { cls = it } != null) {
                ret = cls.getField(name, desc)
                if(ret != null) return ret

                cls.interfaces.forEach { itf ->
                    queue.addFirst(itf)
                }
            }
        }

        var cls = superClass
        while(cls != null) {
            ret = cls!!.getField(name, desc)
            if(ret != null) return ret
            cls = cls!!.superClass
        }

        return null
    }

    fun toBytes(flags: Int = ClassWriter.COMPUTE_FRAMES): ByteArray {
        val writer = ClassWriter(flags)
        node.accept(writer)
        return writer.toByteArray()
    }

    fun isArray() = name[0] == '['
    fun arrayDims() = name.lastIndexOf('[') + 1

    override fun toString(): String {
        return name
    }
}