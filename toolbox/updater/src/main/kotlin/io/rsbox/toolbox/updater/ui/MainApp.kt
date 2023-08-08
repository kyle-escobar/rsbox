package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.Updater
import io.rsbox.toolbox.updater.ui.controller.AppController
import io.rsbox.toolbox.updater.ui.view.MainView
import tornadofx.App
import tornadofx.runAsync
import tornadofx.ui

class MainApp : App(MainView::class) {
}