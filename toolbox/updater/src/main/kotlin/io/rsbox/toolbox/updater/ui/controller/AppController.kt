package io.rsbox.toolbox.updater.ui.controller

import io.rsbox.toolbox.updater.Updater
import io.rsbox.toolbox.updater.asm.Matchable
import io.rsbox.toolbox.updater.util.CompareUtil
import javafx.beans.property.SimpleObjectProperty
import tornadofx.Controller
import tornadofx.asObservable

class AppController : Controller() {

    private val env get() = Updater.env
    private val srcGroup get() = env.groupA
    private val dstGroup get() = env.groupB

    val srcNodes = mutableListOf<Matchable<*>>().asObservable()
    val dstNodes = mutableListOf<Matchable<*>>().asObservable()

    val selectedSrcNode = SimpleObjectProperty<Matchable<*>?>()
    val selectedDstNode = SimpleObjectProperty<Matchable<*>?>()

    fun init() {
        srcNodes.clear()
        srcNodes.addAll(srcGroup.classes.sortedWith { a, b -> CompareUtil.compareNatural(a.name, b.name) })
        dstNodes.clear()
    }
}