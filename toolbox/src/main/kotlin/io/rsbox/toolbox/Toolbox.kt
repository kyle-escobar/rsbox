package io.rsbox.toolbox

import com.github.ajalt.clikt.core.NoOpCliktCommand
import com.github.ajalt.clikt.core.subcommands

object Toolbox {

    @JvmStatic
    fun main(args: Array<String>) = ToolboxCommand()
        .main(args)

    class ToolboxCommand : NoOpCliktCommand(
        name = "toolbox",
        help = "A command line to launch various helper tools for use in the RSBox projects.",
        printHelpOnEmptyArgs = true,
        invokeWithoutSubcommand = true,
    ) {
        init {
            subcommands(
                UpdaterCommand()
            )
        }
    }
}