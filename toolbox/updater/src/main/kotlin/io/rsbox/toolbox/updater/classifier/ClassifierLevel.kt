package io.rsbox.toolbox.updater.classifier

enum class ClassifierLevel {
    INITIAL,
    INTERMEDIATE,
    FULL,
    EXTRA;

    companion object {
        val ALL = values()
    }
}