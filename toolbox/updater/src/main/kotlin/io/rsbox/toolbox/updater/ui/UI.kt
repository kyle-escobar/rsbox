package io.rsbox.toolbox.updater.ui

import io.rsbox.toolbox.updater.log.Logger
import javafx.application.Platform
import javafx.embed.swing.JFXPanel
import javafx.stage.Modality
import javafx.stage.Stage
import tornadofx.App
import tornadofx.FX
import tornadofx.View
import tornadofx.runAsync
import java.awt.Dimension
import javax.swing.*
import kotlin.reflect.KClass
import kotlin.system.exitProcess

object UI : JFrame("RSBox Updater") {

    private lateinit var app: App
    private lateinit var stage: Stage

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        preferredSize = Dimension(1500, 900)
        size = preferredSize
        setLocationRelativeTo(null)
        iconImage = UI::class.java.getResource("/images/rsbox.png")!!.let { ImageIcon(it).image }

        UIManager.put("TitlePane.unifiedBackground", false)

        val font = UIManager.getFont("defaultFont")
        val newFont = font.deriveFont(12f)
        UIManager.put("defaultFont", newFont)
    }

    fun open() {
        val wrapper = JFXPanel()
        add(wrapper)

        MenuBar().apply(this)

        Platform.runLater {
            stage = Stage()
            app = MainApp()

            app.start(stage)

            //stage.scene.stylesheets.add(UI::class.java.getResource("/styles/one-dark.css")!!.toExternalForm())
            wrapper.scene = stage.scene

            SwingUtilities.invokeLater {
                minimumSize = Dimension(1280, 720)
                isVisible = true
                requestFocusInWindow()
            }

            runAsync {
                init()
            }
        }

        Platform.setImplicitExit(true)
    }

    fun close() {
        isVisible = false
        exitProcess(0)
    }

    fun openDialog(viewClass: KClass<out View>) {
        val dialog = JDialog(this)
        dialog.preferredSize = Dimension(500, 500)
        dialog.size = dialog.preferredSize
        dialog.setLocationRelativeTo(this)

        val wrapper = JFXPanel()
        dialog.add(wrapper)

        Platform.runLater {
            val view = FX.find(viewClass.java)

            val stage = view.openModal(modality = Modality.APPLICATION_MODAL, owner = this.stage.owner)!!
            view.modalStage?.hide()

            wrapper.scene = stage.scene

            dialog.title = view.title
            dialog.isVisible = true
        }
    }

    private fun init() {
        Logger.info("Successfully started Updater application.")
    }
}