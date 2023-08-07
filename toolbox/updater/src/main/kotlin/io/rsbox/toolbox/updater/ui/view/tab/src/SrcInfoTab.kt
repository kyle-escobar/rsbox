package io.rsbox.toolbox.updater.ui.view.tab.src

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.Matchable
import javafx.scene.control.Tab
import javafx.scene.layout.Priority
import tornadofx.*

class SrcInfoTab : Tab("Info") {

    init {
        content = pane {
            vgrow = Priority.ALWAYS
            hgrow = Priority.ALWAYS
            text("No Class Selected")
        }
    }

    private fun updateContent(node: Matchable<*>?) {
        content = gridpane {
            paddingAll = 5.0
            hgap = 5.0
            vgap = 5.0

        }
        when(node) {
            is ClassEntry -> {
                content = gridpane {
                    paddingAll = 5.0
                    hgap = 5.0
                    vgap = 5.0

                }
            }
        }
    }
}