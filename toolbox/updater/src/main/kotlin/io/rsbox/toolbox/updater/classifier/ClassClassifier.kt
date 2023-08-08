package io.rsbox.toolbox.updater.classifier

import io.rsbox.toolbox.updater.asm.ClassEntry
import org.objectweb.asm.Opcodes.*

object ClassClassifier : AbstractClassifier<ClassEntry>() {

    override fun init() {
        addAnalyzer(classType, weight = 20.0)
    }

    /**
     * ========== CLASS ANALYZERS ==========
     */

    private val classType = analyzer("class type") { a, b ->
        val mask = ACC_ENUM or ACC_INTERFACE or ACC_ANNOTATION or ACC_RECORD or ACC_ABSTRACT
        val resultA = a.access and mask
        val resultB = b.access and mask
        return@analyzer 1 - Integer.bitCount(resultA.xor(resultB)) / 5.0
    }
}