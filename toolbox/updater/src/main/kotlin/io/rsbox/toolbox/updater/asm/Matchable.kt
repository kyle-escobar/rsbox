package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.asm.util.AsmUtil.isNameObfuscated

abstract class Matchable<T : Matchable<T>> {

    abstract val name: String

    var tempName = ""
    fun hasTempName() = tempName != ""

    var uid = -1

    var nameObfuscated = true
    fun isNameObfuscated() = nameObfuscated

    var match: T? = null

    fun hasMatch() = match != null

    fun unmatch() { match = null }
    fun match(value: T) { match = value }

    var matchable: Boolean = true
}