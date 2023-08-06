package io.rsbox.toolbox.updater

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme
import io.rsbox.toolbox.updater.ui.UI
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.UIManager

object Updater {

    @JvmStatic
    fun main(args: Array<String>) {
        startUI()
    }

    private fun startUI() {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        FlatOneDarkIJTheme.setup()
        UI.open()
    }
}