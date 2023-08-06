package io.rsbox.toolbox.updater.ui.view

import javafx.geometry.Orientation
import javafx.scene.control.ListView
import javafx.scene.control.TabPane
import javafx.scene.control.TreeView
import tornadofx.*

class MatchViewDst : View() {

    lateinit var nodeList: ListView<Any>
    lateinit var contentTabPane: TabPane

    override val root = splitpane(Orientation.HORIZONTAL) {
        contentTabPane = tabpane {
            tab("Source") {
                isClosable = false
            }
        }

        nodeList = listview {
            maxWidth = 250.0
        }
    }
}