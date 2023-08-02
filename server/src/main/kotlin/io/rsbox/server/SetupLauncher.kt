package io.rsbox.server

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.get
import io.rsbox.server.config.ServerConfig
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.util.security.RSA
import org.koin.core.context.startKoin
import org.tinylog.kotlin.Logger
import java.io.File
import java.util.zip.ZipFile
import kotlin.system.exitProcess

object SetupLauncher {

    private val DATA_DIR = File("data/")

    @JvmStatic
    fun main(args: Array<String>) {
        Logger.info("Setting up RSBox Server...")

        if(DATA_DIR.exists()) {
            Logger.info("The data/ directory already exists. Please delete it and re-run the setup gradle task.")
            exitProcess(0)
        }

        startKoin { modules(DI_MODULES) }

        /*
         * Setup Steps
         */
        createDirs()
        extractCacheZipFile()
        createConfigs()
        createRsa()
        checkCache()

        Logger.info("""
            The RSBox server setup has completed successfully. You may now start the server using the 'start server' gradle task.
        """.trimIndent())
    }

    private fun createDirs() {
        Logger.info("Creating default directories.")

        listOf(
            "cache/",
            "logs/",
            "saves/",
            "rsa/",
            "configs/",
        ).map { DATA_DIR.resolve(it) }.forEach { dir ->
            Logger.info("Creating missing directory: ${dir.path}.")
            dir.mkdirs()
        }
    }

    private fun extractCacheZipFile() {
        Logger.info("Extracting RSBox cache.zip files.")
        val file = File("cache.zip")
        ZipFile(file).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                if(!entry.isDirectory) {
                    zip.getInputStream(entry).use { input ->
                        File("data/cache/${entry.name}").outputStream().use { output ->
                            Logger.info("Extracting file: ${entry.name}.")
                            input.copyTo(output)
                        }
                    }
                }
            }
        }
    }

    private fun createConfigs() {
        Logger.info("Creating default server.toml config file.")
        ServerConfig.SERVER_NAME

        Logger.info("Checking region XTEA keys config file.")
        XteaConfig.xteas.size
    }

    private fun checkCache() {
        Logger.info("Checking game cache files.")
        val cache = get<GameCache>()
        cache.load()
        Logger.info("Found ${cache.masterIndex.entries.size} cache archives.")
    }

    private fun createRsa() {
        Logger.info("Creating RSA encryption keys.")
        RSA.generateNewKeyPair()
    }
}