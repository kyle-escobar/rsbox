package io.rsbox.toolbox.updater.asm.util

import io.rsbox.toolbox.updater.asm.ClassGroup

class CommonClasses(val group: ClassGroup) {
    val INT = group.getOrCreateClass("I")
    val LONG = group.getOrCreateClass("J")
    val BOOLEAN = group.getOrCreateClass("Z")
    val BYTE = group.getOrCreateClass("B")
    val CHAR = group.getOrCreateClass("C")
    val SHORT = group.getOrCreateClass("S")
    val FLOAT = group.getOrCreateClass("F")
    val DOUBLE = group.getOrCreateClass("D")
    val VOID = group.getOrCreateClass("V")
    val STRING = group.getOrCreateClass("java/lang/String")
}