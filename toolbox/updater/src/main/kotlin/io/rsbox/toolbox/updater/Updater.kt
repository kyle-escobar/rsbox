package io.rsbox.toolbox.updater

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme
import io.rsbox.toolbox.updater.asm.ClassEnv
import io.rsbox.toolbox.updater.log.Logger
import io.rsbox.toolbox.updater.ui.MainApp
import javafx.application.Platform
import javafx.stage.Stage
import tornadofx.App
import tornadofx.launch
import java.io.File
import javax.swing.JDialog
import javax.swing.JFrame

object Updater {

    private lateinit var jarA: File
    private lateinit var jarB: File

    val env = ClassEnv()

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size < 2) error("Usage: updater.jar <old-jar> <new-jar>")
        jarA = File(args[0])
        jarB = File(args[1])
        init()
    }

    fun init() {
        Logger.info("Initializing...")

        /*
         * Load and process classes from both the src and dst input jars.
         */
        env.init(jarA, jarB)

        Logger.info("Completed loading and processing of class from input jar files.")
    }
}