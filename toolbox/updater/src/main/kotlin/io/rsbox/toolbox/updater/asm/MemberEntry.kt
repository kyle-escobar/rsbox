package io.rsbox.toolbox.updater.asm

import io.rsbox.toolbox.updater.util.identityHashSetOf

abstract class MemberEntry<T :MemberEntry<T>> : Matchable<T>() {

    abstract val cls: ClassEntry
    abstract val access: Int

    val group get() = cls.group
    val env get() = cls.env

    fun isShared() = cls.isShared()

    override var match: T? = null

    val parents = identityHashSetOf<T>()
    val children= identityHashSetOf<T>()

    var hierarchy: MemberHierarchy<T>? = null
    fun isHierarchyUnset() = hierarchy == null
}