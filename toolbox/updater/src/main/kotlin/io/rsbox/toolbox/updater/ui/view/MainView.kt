package io.rsbox.toolbox.updater.ui.view

import io.rsbox.toolbox.updater.ui.MenuBar
import io.rsbox.toolbox.updater.ui.UI
import javafx.scene.layout.Priority
import javafx.scene.layout.RowConstraints
import tornadofx.*

class MainView : View("Updater") {

    val matchViewSrc = MatchViewSrc()
    val matchViewDst = MatchViewDst()

    init {
        MenuBar().apply(UI)
    }

    override val root = gridpane {
        constraintsForColumn(0).percentWidth = 50.0
        constraintsForColumn(1).percentWidth = 50.0

        constraintsForRow(0).vgrow = Priority.ALWAYS

        add(matchViewSrc.root, 0, 0, 1, 1)
        add(matchViewDst.root, 1, 0, 1, 1)
        add(find<BottomView>().root, 0, 1, 2, 1)
    }
}