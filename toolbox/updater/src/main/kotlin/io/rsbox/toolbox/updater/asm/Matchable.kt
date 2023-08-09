package io.rsbox.toolbox.updater.asm

abstract class Matchable<T : Matchable<T>> {

    abstract val name: String

    var tempName = ""
    fun hasTempName() = tempName != ""

    var uid = -1

    var nameObfuscated = true

    open var match: T? = null

    fun hasMatch() = match != null

    fun unmatch() { match = null }
    fun match(value: T) { match = value }

    open var matchable: Boolean = true

}