package io.rsbox.toolbox

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.types.file
import io.rsbox.toolbox.updater.Updater

class UpdaterCommand : CliktCommand(
    name = "updater",
    help = "Run the bytecode updater application",
    printHelpOnEmptyArgs = false
) {

    private val jarFileA by argument(name = "Jar File A").file(mustExist = true, canBeDir = false)
    private val jarFileB by argument(name = "Jar File B").file(mustExist = true, canBeDir = false)

    override fun run() {
        Updater.main(arrayOf(jarFileA.absolutePath, jarFileB.absolutePath))
    }
}