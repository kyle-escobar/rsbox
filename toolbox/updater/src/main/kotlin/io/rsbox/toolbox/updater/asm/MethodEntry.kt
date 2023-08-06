package io.rsbox.toolbox.updater.asm

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodNode

class MethodEntry(override val cls: ClassEntry, val node: MethodNode) : MemberEntry<MethodEntry>() {

    override val name = node.name

    init {
        if(isShared()) {
            match = this
        }
    }

    val access = node.access
    val desc = node.desc

    val tryCatchBlocks = node.tryCatchBlocks
    val instructions = node.instructions

    val type = Type.getMethodType(desc)

    lateinit var returnType: ClassEntry
    val argumentTypes = mutableListOf<ClassEntry>()

    fun isPrivate() = (access and ACC_PRIVATE) != 0
    fun isPublic() = (access and ACC_PUBLIC) != 0
    fun isAbstract() = (access and ACC_ABSTRACT) != 0
    fun isStatic() = (access and ACC_STATIC) != 0

    fun isConstructor() = name == "<init>"
    fun isInitializer() = name == "<clinit>"

    val id = "$name$desc"

    override fun toString(): String {
        return "$cls.$id"
    }
}