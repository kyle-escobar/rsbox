package io.rsbox.toolbox.updater.ui.view

import javafx.geometry.Orientation
import javafx.scene.control.SplitPane
import javafx.scene.control.TabPane
import javafx.scene.control.TreeView
import javafx.scene.layout.Border
import tornadofx.*

class MatchViewSrc : View() {

    lateinit var nodeList: TreeView<Any>
    lateinit var contentTabPane: TabPane

    override val root = splitpane(Orientation.HORIZONTAL) {

        nodeList = treeview {
            maxWidth = 250.0
        }

        contentTabPane = tabpane {
            tab("Source") {
                isClosable = false
            }
        }
    }
}