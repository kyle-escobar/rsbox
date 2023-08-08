package io.rsbox.toolbox.updater.classifier

interface Ranker<T> {
    fun rank(src: T, dsts: Array<T>, level: ClassifierLevel, maxMismatch: Double): List<RankResult<T>>
}