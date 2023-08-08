package io.rsbox.toolbox.updater.classifier

data class RankResult<T>(val subject: T, val score: Double, val results: List<AnalyzerResult<T>>)