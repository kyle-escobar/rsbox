package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.Updater
import tornadofx.App
import tornadofx.UIComponent
import tornadofx.runAsync

class MainApp : App(MainView::class) {

    override fun init() {
        runAsync { Updater.init() }
    }

}