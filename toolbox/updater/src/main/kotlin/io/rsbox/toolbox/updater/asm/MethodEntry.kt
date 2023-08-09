package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.asm.util.AsmUtil.obfuscated
import io.rsbox.toolbox.updater.util.identityHashSetOf
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

    override val access = node.access
    val desc = node.desc

    val tryCatchBlocks = node.tryCatchBlocks
    val instructions = node.instructions

    val type = Type.getMethodType(desc)

    lateinit var returnType: ClassEntry
    val argumentTypes = mutableListOf<ClassEntry>()

    lateinit var args: Array<MethodVarEntry>
    var vars: Array<MethodVarEntry> = emptyArray()

    val strings = mutableListOf<String>()
    val numbers = mutableListOf<Number>()

    val refsIn = identityHashSetOf<MethodEntry>()
    val refsOut = identityHashSetOf<MethodEntry>()
    val fieldReadRefs = identityHashSetOf<FieldEntry>()
    val fieldWriteRefs = identityHashSetOf<FieldEntry>()
    val classRefs = identityHashSetOf<ClassEntry>()

    val id = "$name$desc"
    var phantom = false

    fun isPrivate() = (access and ACC_PRIVATE) != 0
    fun isPublic() = (access and ACC_PUBLIC) != 0
    fun isAbstract() = (access and ACC_ABSTRACT) != 0
    fun isStatic() = (access and ACC_STATIC) != 0
    fun isSynthetic() = (access and ACC_SYNTHETIC) != 0

    fun isConstructor() = name == "<init>"
    fun isInitializer() = name == "<clinit>"
    
    fun init() {
        if(isShared()) {
            match = this
        }

        nameObfuscated = name.obfuscated()

        returnType = group.getOrCreateClass(type.returnType.internalName)
        classRefs.add(returnType)
        returnType.methodTypeRefs.add(this)

        argumentTypes.addAll(type.argumentTypes.map { group.getOrCreateClass(it.internalName) })
        argumentTypes.forEach { argType ->
            classRefs.add(argType)
            argType.methodTypeRefs.add(this)
        }

        args = extractArguments()
    }

    private fun extractArguments(): Array<MethodVarEntry> {
        val argTypes = Type.getArgumentTypes(desc)
        if(argTypes.isEmpty()) return emptyArray()

        val args = arrayOfNulls<MethodVarEntry>(argTypes.size)
        var locals = node.localVariables
        var insns = node.instructions
        var firstInsn = insns.first

        var lvIdx = if(isStatic()) 0 else 1

        for(i in argTypes.indices) {
            val asmType = argTypes[i]
            val type = cls.group.getOrCreateClass(asmType.descriptor)
            var asmIdx = -1
            var startInsn = -1
            var endInsn = -1
            var name: String? = null

            if(locals != null) {
                for(j in 0 until locals.size) {
                    val n = locals.get(j)

                    if(n.index == lvIdx && n.start == firstInsn) {
                        asmIdx = j
                        startInsn = insns.indexOf(n.start)
                        endInsn = insns.indexOf(n.end)
                        name = n.name
                        break
                    }
                }
            }

            val arg = MethodVarEntry(this, true, i, lvIdx, asmIdx, type, startInsn, endInsn, 0, name)
            args[i] = arg

            classRefs.add(type)
            type.methodTypeRefs.add(this)

            lvIdx += type.slotSize()
        }

        return args.requireNoNulls()
    }

    private fun ClassEntry.slotSize(): Int {
        val start = id[0]
        return if(start == 'D' || start == 'J') 2 else 1
    }

    override fun toString(): String {
        return "$cls.$id"
    }
    
    companion object {
        fun create(cls: ClassEntry, name: String, desc: String): MethodEntry {
            val node = MethodNode()
            node.access = ACC_PUBLIC
            node.name = name
            node.desc = desc
            val method = MethodEntry(cls, node)
            method.init()
            method.phantom = true
            cls.addMethod(method)
            return method
        }
    }
}