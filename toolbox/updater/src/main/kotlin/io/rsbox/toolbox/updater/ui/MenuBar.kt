package io.rsbox.toolbox.updater.ui

import javafx.scene.control.MenuBar
import javafx.scene.control.SeparatorMenuItem
import tornadofx.item
import tornadofx.menu
import tornadofx.separator
import java.awt.event.InputEvent
import java.awt.event.KeyEvent
import javax.swing.*
import kotlin.system.exitProcess

class MenuBar {

    private val menuBar = MenuBar().apply {
        menu("File") {
            item("Exit") {
                setOnAction {
                    exitProcess(0)
                }
            }
        }

        menu("Edit") {
        }

        menu("Match") {
            item("Auto-Match All")
            separator()
            item("Auto-Match Classes")
            item("Auto-Match Methods")
            item("Auto-Match Fields")
            separator()
            item("Auto-Match Static-Methods")
            item("Auto-Match Static-Fields")
            separator()
            item("Matching Statistics")
        }
    }

    fun apply(frame: JFrame) {
        val swingMenuBar = JMenuBar()
        menuBar.menus.forEach { menu ->
            JMenu(menu.text).also {
                menu.items.forEach { item ->
                    if(item is SeparatorMenuItem) {
                        JSeparator().apply {
                            it.add(this)
                        }
                    } else {
                        JMenuItem(item.text).also {
                            if(item.onAction != null) {
                                it.addActionListener { item.onAction.handle(null) }
                            }
                            if(item.accelerator != null) {
                                var keyModifier: String = ""
                                val keyCode: String

                                if(item.accelerator.displayText.contains('+')) {
                                    keyModifier = item.accelerator.displayText.split("+")[0].uppercase()
                                    keyCode = item.accelerator.displayText.split("+")[1].uppercase()
                                } else {
                                    keyCode = item.accelerator.displayText.uppercase()
                                }

                                val keyEvent = KeyEvent::class.java
                                    .getField("VK_".plus(keyCode))
                                    .getInt(null)

                                val modifierMask = when(keyModifier) {
                                    "CTRL" -> InputEvent.CTRL_DOWN_MASK
                                    "ALT" -> InputEvent.ALT_DOWN_MASK
                                    else -> 0
                                }

                                it.accelerator = KeyStroke.getKeyStroke(keyEvent, modifierMask)
                            }
                        }.apply { it.add(this) }
                    }
                }
            }.apply {
                swingMenuBar.add(this)
            }
        }
        frame.jMenuBar = swingMenuBar
    }
}