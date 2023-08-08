package io.rsbox.toolbox.updater.ui.view

import io.rsbox.toolbox.updater.Updater
import io.rsbox.toolbox.updater.ui.controller.AppController
import tornadofx.*

class MainView : View("Updater") {

    private val controller: AppController by inject()

    override val root = gridpane {
        setPrefSize(1280.0, 900.0)

        constraintsForColumn(0).percentWidth = 50.0
        constraintsForColumn(1).percentWidth = 50.0
        constraintsForRow(0).percentHeight = 100.0

        row {
            add(find<MatchSrcView>().root)
            add(find<MatchDstView>().root)
        }
    }

    override fun onDock() {
        currentStage?.requestFocus()

        runAsync {
            Updater.init()
        } ui {
            controller.init()
        }
    }
}