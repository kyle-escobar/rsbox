package io.rsbox.toolbox.updater.ui.view

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.Matchable
import io.rsbox.toolbox.updater.ui.Events
import io.rsbox.toolbox.updater.ui.controller.AppController
import io.rsbox.toolbox.updater.ui.view.tab.src.SrcInfoTab
import io.rsbox.toolbox.updater.ui.view.tab.src.SrcSourceTab
import javafx.geometry.Orientation
import javafx.scene.control.ListView
import javafx.scene.control.TabPane
import javafx.scene.control.TreeCell
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView
import javafx.scene.layout.Priority
import tornadofx.*

class MatchDstView : View() {

    private val controller: AppController by inject()

    lateinit var nodeListView: ListView<Matchable<*>>
    lateinit var contentTabPane: TabPane

    init {
        controller.selectedDstNode.addListener { observable, oldValue, newValue ->
            Events.selectedDstChange.push(newValue)
        }
    }

    override val root = splitpane(Orientation.HORIZONTAL) {
        setDividerPosition(0, 0.75)
        add(createContentTabPane())
        add(createNodeListView())
    }

    private fun createNodeListView() = listview(controller.dstNodes) {
        nodeListView = this
        vgrow = Priority.ALWAYS
        minWidth = 100.0
        cellFormat { node: Matchable<*> ->
            text = node.name
        }
        selectionModel.selectedItemProperty().addListener { observable, oldValue, newValue ->
            controller.selectedDstNode.set(newValue)
        }
    }

    private fun createContentTabPane() = tabpane {
        contentTabPane = this
        tabClosingPolicy = TabPane.TabClosingPolicy.UNAVAILABLE
    }
}