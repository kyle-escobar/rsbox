package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.log.Logger
import javafx.application.Platform
import javafx.embed.swing.JFXPanel
import javafx.stage.Stage
import java.awt.Dimension
import java.awt.Toolkit
import java.util.concurrent.Executors
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.UIManager
import kotlin.system.exitProcess

object UI : JFrame("RSBox Updater") {

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        preferredSize = Dimension(1500, 900)
        size = preferredSize
        setLocationRelativeTo(null)
        iconImage = UI::class.java.getResource("/images/rsbox.png")!!.let { ImageIcon(it).image }

        UIManager.put("TitlePane.unifiedBackground", false)

        val font = UIManager.getFont("defaultFont")
        val newFont = font.deriveFont(14f)
        UIManager.put("defaultFont", newFont)
    }

    fun open() {
        val wrapper = JFXPanel()
        add(wrapper)

        MenuBar().apply(this)

        Platform.runLater {
            val stage = Stage()
            val app = MainApp()
            app.start(stage)

            stage.scene.stylesheets.add(UI::class.java.getResource("/styles/one-dark.css")!!.toExternalForm())
            wrapper.scene = stage.scene

            SwingUtilities.invokeLater {
                minimumSize = Dimension(1280, 720)
                isVisible = true
                requestFocusInWindow()
            }

            Executors.newSingleThreadExecutor().execute {
                init()
            }
        }

        Platform.setImplicitExit(true)
    }

    fun close() {
        isVisible = false
        exitProcess(0)
    }

    private fun init() {
        Logger.info("Successfully started Updater application.")

        while(true) {
            Thread.sleep(1000)
            Logger.info("Message test")
        }
    }
}