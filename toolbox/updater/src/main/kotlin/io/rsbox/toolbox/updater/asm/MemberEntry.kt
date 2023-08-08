package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.util.identityHashSetOf

abstract class MemberEntry<T : Matchable<T>> : Matchable<T>() {

    abstract val cls: ClassEntry

    val group get() = cls.group
    val env get() = cls.env

    fun isShared() = cls.isShared()

    val parents = identityHashSetOf<T>()
    val children = identityHashSetOf<T>()

    var hierarchy = identityHashSetOf<T>()
}