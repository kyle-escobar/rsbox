package io.rsbox.toolbox.updater.ui.view

import io.rsbox.toolbox.updater.log.Logger
import javafx.application.Platform
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class ConsoleView : View() {

    private val consoleTextProp = SimpleStringProperty()

    init {
        Logger.subscribe { msg ->
            consoleTextProp.set(consoleTextProp.get()?.plus("\n")?.plus(msg) ?: msg)
            Platform.runLater {
                root.scrollTop = Double.MAX_VALUE
            }
        }
    }

    override val root = textarea(consoleTextProp) {
        useMaxSize = true
        isEditable = false
        style {
            fontFamily = "Courier New"
            fontSize = 12.pt
        }
    }
}