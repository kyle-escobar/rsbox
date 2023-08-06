package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.ui.view.MainView
import tornadofx.App
import tornadofx.reloadStylesheetsOnFocus
import tornadofx.reloadViewsOnFocus

class MainApp : App(MainView::class) {

    init {
        reloadViewsOnFocus()
        reloadStylesheetsOnFocus()
    }

    override fun shouldShowPrimaryStage(): Boolean {
        return false
    }
}