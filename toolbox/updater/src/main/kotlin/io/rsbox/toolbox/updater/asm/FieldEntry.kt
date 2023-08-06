package io.rsbox.toolbox.updater.asm

import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.FieldNode

class FieldEntry(override val cls: ClassEntry, val node: FieldNode) : MemberEntry<FieldEntry>() {

    override val name = node.name

    init {
        if(isShared()) {
            match = this
        }
    }

    val access = node.access
    val desc = node.desc
    val value = node.value

    val id = "$name:$desc"

    lateinit var typeClass: ClassEntry

    fun isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
    fun isPublic() = (access and Opcodes.ACC_PUBLIC) != 0
    fun isStatic() = (access and Opcodes.ACC_STATIC) != 0

    override fun toString(): String {
        return "$cls.$id"
    }
}