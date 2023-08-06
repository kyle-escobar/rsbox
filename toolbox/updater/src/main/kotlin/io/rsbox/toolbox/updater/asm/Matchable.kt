package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.asm.AsmUtil.isNameObfuscated

abstract class Matchable<T : Matchable<T>> {

    abstract val name: String

    fun isNameObfuscated() = name.isNameObfuscated()

    var match: T? = null

    fun hasMatch() = match != null
    fun unmatch() { match = null }
    fun match(value: T) { match = value }

}