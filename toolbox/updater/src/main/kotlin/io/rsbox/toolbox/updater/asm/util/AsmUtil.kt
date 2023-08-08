package io.rsbox.toolbox.updater.asm.util

import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode

object AsmUtil {

    fun readClass(bytes: ByteArray, flags: Int = ClassReader.EXPAND_FRAMES): ClassNode {
        val reader = ClassReader(bytes)
        val node = ClassNode()
        reader.accept(node, flags)
        return node
    }

    fun String.isNameObfuscated(): Boolean {
        return arrayOf("class", "method", "field").any { this.startsWith(it) }
    }
}