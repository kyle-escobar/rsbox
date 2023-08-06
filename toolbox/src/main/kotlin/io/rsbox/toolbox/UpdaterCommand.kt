package io.rsbox.toolbox

import com.github.ajalt.clikt.core.CliktCommand
import io.rsbox.toolbox.updater.Updater

class UpdaterCommand : CliktCommand(
    name = "updater",
    help = "Run the bytecode updater application",
    printHelpOnEmptyArgs = false
) {

    override fun run() {
        Updater.main(emptyArray())
    }
}