package io.rsbox.toolbox.updater.ui

import tornadofx.View
import tornadofx.gridpane
import java.awt.Toolkit

class MainView : View("Updater") {

    override val root = gridpane {
        val screenSize = Toolkit.getDefaultToolkit().screenSize
        setPrefSize(screenSize.width.toDouble() * 0.66, screenSize.height.toDouble() * 0.66)
    }
}