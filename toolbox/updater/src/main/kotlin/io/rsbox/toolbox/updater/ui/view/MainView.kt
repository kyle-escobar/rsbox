package io.rsbox.toolbox.updater.ui.view

import tornadofx.*

class MainView : View("Test") {

    override val root = borderpane {
        setPrefSize(1000.0, 1000.0)
        setMinSize(500.0, 500.0)
        center {
            text("hello world")
        }
        bottom {
            prefHeight = 200.0
            add(find<ConsoleView>())
        }
    }
}