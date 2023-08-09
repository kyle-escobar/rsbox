package io.rsbox.toolbox.updater.asm

class MemberHierarchy<T>(val members: MutableSet<T>, var nameObfuscated: Boolean) {

    var isUnset = false
        private set

    constructor() : this(mutableSetOf(), true) {
        isUnset = true
    }

    var matchedHierarchy: MemberHierarchy<T>? = null
    fun hasMatchedHierarchy() = matchedHierarchy != null

    fun addMember(member: T) {
        members.add(member)
    }
}