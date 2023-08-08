package io.rsbox.toolbox.updater.classifier

interface Analyzer<T> {
    val name: String
    var weight: Double
    fun getScore(a: T, b: T): Double
}