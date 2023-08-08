package io.rsbox.toolbox.updater.util

import java.util.*

fun <T> identityHashSetOf() = Collections.newSetFromMap<T>(IdentityHashMap())

fun <T> identityHashSetOf(vararg entries: T) = identityHashSetOf<T>().also { it.addAll(entries) }

fun <T> identityHashSetOf(other: Set<T>) = identityHashSetOf<T>().also { it.addAll(other) }