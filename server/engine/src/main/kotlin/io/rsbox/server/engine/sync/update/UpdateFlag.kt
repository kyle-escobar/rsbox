package io.rsbox.server.engine.sync.update

abstract class UpdateFlag(val mask: Int, val order: Int) : Comparable<UpdateFlag> {
    override fun compareTo(other: UpdateFlag): Int = when {
        order < other.order -> -1
        order > other.order -> 1
        else -> 0
    }
}