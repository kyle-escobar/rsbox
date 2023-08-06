package io.rsbox.toolbox.updater.log

object Logger {

    private val subscribers = mutableListOf<(String) -> Unit>()

    fun subscribe(block: (String) -> Unit) {
        subscribers.add(block)
    }

    private fun print(message: String) {
        println(message)
        subscribers.forEach { it(message) }
    }

    fun info(message: String) = print("[INFO] $message")
    fun warn(message: String) = print("[WARN] $message")
    fun error(e: Throwable, message: String) {
        print("[ERROR] $message")
        throw(e)
    }
}