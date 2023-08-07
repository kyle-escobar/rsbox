package io.rsbox.toolbox.updater.ui.view

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.Matchable
import io.rsbox.toolbox.updater.ui.Events
import io.rsbox.toolbox.updater.ui.controller.AppController
import io.rsbox.toolbox.updater.ui.view.tab.src.SrcInfoTab
import io.rsbox.toolbox.updater.ui.view.tab.src.SrcSourceTab
import javafx.geometry.Orientation
import javafx.scene.control.TabPane
import javafx.scene.control.TreeCell
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView
import javafx.scene.layout.Priority
import tornadofx.*

class MatchSrcView : View() {

    private val controller: AppController by inject()

    lateinit var nodeListView: TreeView<Matchable<*>>
    lateinit var contentTabPane: TabPane

    init {
        controller.selectedSrcNode.addListener { observable, oldValue, newValue ->
            Events.selectedSrcChange.push(newValue)
        }
    }

    override val root = splitpane(Orientation.HORIZONTAL) {
        setDividerPosition(0, 0.25)

        add(createNodeListView())
        add(createContentTabPane())
    }

    private fun createNodeListView() = treeview {
        nodeListView = this
        vgrow = Priority.ALWAYS
        minWidth = 100.0
        root = TreeItem<Matchable<*>>()
        isShowRoot = false
        cellFormat { node: Matchable<*> ->
            text = node.name
        }
        root.children.bind(controller.srcNodes) {
            TreeItem(it).also { ci ->
                it as ClassEntry
                it.methods.forEach { m ->
                    ci.children.add(TreeItem(m))
                }
                it.fields.forEach { f ->
                    ci.children.add(TreeItem(f))
                }
            }
        }
        selectionModel.selectedItemProperty().addListener { observable, oldValue, newValue ->
           controller.selectedSrcNode.set(newValue.value)
       }
    }

    private fun createContentTabPane() = tabpane {
        contentTabPane = this
        tabClosingPolicy = TabPane.TabClosingPolicy.UNAVAILABLE
        tabs.add(SrcSourceTab())
        tabs.add(SrcInfoTab())
    }
}