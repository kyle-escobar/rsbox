package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.ui.view.MainView
import javafx.application.Application
import javafx.stage.Stage
import tornadofx.*

class MainApp : App(MainView::class) {

    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
    }

    override fun shouldShowPrimaryStage(): Boolean {
        return false
    }
}