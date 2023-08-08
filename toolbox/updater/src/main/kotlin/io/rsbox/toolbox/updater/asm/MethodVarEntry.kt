package io.rsbox.toolbox.updater.asm

data class MethodVarEntry(
    val method: MethodEntry,
    val isArg: Boolean,
    val idx: Int,
    val lvtIdx: Int,
    val asmIdx: Int,
    val type: ClassEntry,
    val startInsn: Int,
    val endInsn: Int,
    val startOpIndex: Int,
    val name: String? = null
)