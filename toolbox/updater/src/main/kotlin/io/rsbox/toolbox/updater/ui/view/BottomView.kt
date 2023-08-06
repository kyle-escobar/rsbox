package io.rsbox.toolbox.updater.ui.view

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import tornadofx.*
import tornadofx.Stylesheet.Companion.button

class BottomView : View() {

    lateinit var matchButton: Button
    lateinit var unmatchButton: Button

    override val root = hbox {
        paddingAll = 4
        spacing = 16.0
        alignment = Pos.CENTER

        hbox {
            alignment = Pos.CENTER
            matchButton = button("Match")
        }

        hbox {
            alignment = Pos.CENTER
            unmatchButton = button("Unmatch")
        }
    }
}