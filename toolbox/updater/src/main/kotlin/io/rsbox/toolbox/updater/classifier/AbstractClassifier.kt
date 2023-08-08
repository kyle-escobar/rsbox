package io.rsbox.toolbox.updater.classifier

import io.rsbox.toolbox.updater.asm.Matchable
import java.util.EnumMap

abstract class AbstractClassifier<T : Matchable<T>> {

    private val analyzers = EnumMap<ClassifierLevel, MutableList<Analyzer<T>>>(ClassifierLevel::class.java)
    private val maxScores = EnumMap<ClassifierLevel, Double>(ClassifierLevel::class.java)

    abstract fun init()

    fun addAnalyzer(analyzer: Analyzer<T>, weight: Double, vararg levels: ClassifierLevel) {
        val targetLevel = if(levels.isEmpty()) ClassifierLevel.ALL else levels

        analyzer.weight = weight

        targetLevel.forEach { level ->
            analyzers.computeIfAbsent(level) { mutableListOf() }.add(analyzer)
            maxScores[level] = getMaxScore(level) + weight
        }
    }

    fun getAnalyzers(level: ClassifierLevel) = analyzers.getOrDefault(level, mutableListOf())
    fun getMaxScore(level: ClassifierLevel): Double = maxScores.getOrDefault(level, 0.0)

    @DslMarker
    annotation class AnalyzerDslMarker

    @AnalyzerDslMarker
    fun analyzer(name: String, block: (a: T, b: T) -> Double): Analyzer<T> {
        return object : Analyzer<T> {
            override val name = name
            override var weight = 0.0
            override fun getScore(a: T, b: T): Double { return block(a, b) }
        }
    }
}