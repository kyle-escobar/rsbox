package io.rsbox.toolbox.updater

import io.rsbox.toolbox.updater.asm.ClassEnv
import io.rsbox.toolbox.updater.log.Logger
import java.io.File
import java.util.concurrent.Executors

object Matcher {

    val env = ClassEnv()
    val threadPool = Executors.newCachedThreadPool()

    fun init(jarA: File, jarB: File) {
        Logger.info("Initializing classes from input jar files.")

        env.init(jarA, jarB)
        Logger.info("Successfully initialized classes in environment.")
    }
}