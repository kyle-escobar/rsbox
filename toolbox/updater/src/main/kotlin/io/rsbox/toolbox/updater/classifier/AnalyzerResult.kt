package io.rsbox.toolbox.updater.classifier

data class AnalyzerResult<T>(
    val analyzer: Analyzer<T>,
    val score: Double
)