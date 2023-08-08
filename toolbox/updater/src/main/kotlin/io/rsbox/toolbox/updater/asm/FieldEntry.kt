package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.asm.util.AsmUtil.isNameObfuscated
import io.rsbox.toolbox.updater.util.identityHashSetOf
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.FieldNode

class FieldEntry(override val cls: ClassEntry, val node: FieldNode) : MemberEntry<FieldEntry>() {

    override val name = node.name

    init {
        if(isShared()) {
            match = this
        }
    }

    override val access = node.access
    val desc = node.desc
    val value = node.value

    val id = "$name.$desc"
    var phantom = false

    val type = Type.getType(desc)
    lateinit var typeClass: ClassEntry

    val readsRefs = identityHashSetOf<MethodEntry>()
    val writesRefs = identityHashSetOf<MethodEntry>()
    val classRefs = identityHashSetOf<ClassEntry>()

    val initializer = mutableListOf<AbstractInsnNode>()

    fun isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
    fun isPublic() = (access and Opcodes.ACC_PUBLIC) != 0
    fun isStatic() = (access and Opcodes.ACC_STATIC) != 0

    fun init() {
        nameObfuscated = name.isNameObfuscated()

        typeClass = group.getOrCreateClass(desc)
        typeClass.fieldTypeRefs.add(this)
        classRefs.add(typeClass)
    }

    override fun toString(): String {
        return "$cls.$id"
    }

    companion object {
        fun create(cls: ClassEntry, name: String, desc: String): FieldEntry {
            val node = FieldNode(ACC_PUBLIC, name, desc, null, null)
            val field = FieldEntry(cls, node)
            field.init()
            cls.addField(field)
            return field
        }
    }
}