package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.Matchable
import org.reactfx.EventSource

object Events {
    val selectedSrcChange = EventSource<Matchable<*>>()
    val selectedDstChange = EventSource<Matchable<*>>()
}