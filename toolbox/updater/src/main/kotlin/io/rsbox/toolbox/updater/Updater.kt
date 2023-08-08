package io.rsbox.toolbox.updater

import io.rsbox.toolbox.updater.asm.ClassEnv
import io.rsbox.toolbox.updater.classifier.ClassifierLevel
import io.rsbox.toolbox.updater.classifier.ClassClassifier
import io.rsbox.toolbox.updater.log.Logger
import java.io.File

object Updater {

    /**
     * === MATCHING WEIGHTS ===
     *
     * Abs Threshold:
     * Sets the minimum required percentage a match's
     * score must be compared to the maximum match score before
     * marking them as matched.
     *
     * Rel Threshold:
     * Sets the minimum required difference in percentage of the first-place and
     * second-place matches marking them as matched.
     */
    private const val absAutoMatchThreshold = 0.8
    private const val relAutoMatchThreshold = 0.08


    private lateinit var jarA: File
    private lateinit var jarB: File

    val env = ClassEnv()

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size < 2) error("Usage: updater.jar <old-jar> <new-jar>")

        jarA = File(args[0])
        jarB = File(args[1])

        start()
    }

    private fun init() {
        Logger.info("Initializing...")

        env.init(jarA, jarB)

        /*
         * Ensure we initialize all type classifier objects before we try calling them.
         */
        ClassClassifier.init()
    }

    fun start() {
        init()

        Logger.info("Starting updating of class environment.")

        autoMatchAll()
    }

    fun autoMatchAll() {
        if(autoMatchClasses(ClassifierLevel.INITIAL, absAutoMatchThreshold, relAutoMatchThreshold)) {
            autoMatchClasses(ClassifierLevel.INITIAL, absAutoMatchThreshold, relAutoMatchThreshold)
        }

        autoMatchLevel(ClassifierLevel.INITIAL)
        autoMatchLevel(ClassifierLevel.INITIAL)
        autoMatchLevel(ClassifierLevel.INITIAL)
        autoMatchLevel(ClassifierLevel.INITIAL)

        var matchedAny: Boolean

        do {
            matchedAny = autoMatchStaticMethods(ClassifierLevel.INITIAL, absAutoMatchThreshold, relAutoMatchThreshold)
            matchedAny = matchedAny or autoMatchMemberFields(ClassifierLevel.INITIAL, absAutoMatchThreshold, relAutoMatchThreshold)
        } while(matchedAny)
    }

    fun autoMatchLevel(level: ClassifierLevel) {
        var matchedAny: Boolean
        var matchedStatic: Boolean
        var matchedClassesBefore = true

        do {
            matchedAny = autoMatchMemberMethods(level, absAutoMatchThreshold, relAutoMatchThreshold)
            matchedAny = matchedAny or autoMatchMemberFields(level, absAutoMatchThreshold, relAutoMatchThreshold)

            if(!matchedAny && !matchedClassesBefore) {
                matchedStatic = autoMatchStaticMethods(level, absAutoMatchThreshold, relAutoMatchThreshold)
                matchedStatic = matchedStatic or autoMatchStaticFields(level, absAutoMatchThreshold, relAutoMatchThreshold)
                if(!matchedStatic) break
            }

            matchedClassesBefore = autoMatchClasses(level, absAutoMatchThreshold, relAutoMatchThreshold)
            matchedAny = matchedAny or matchedClassesBefore
        } while(matchedAny)
    }

    fun autoMatchClasses(level: ClassifierLevel, absThreshold: Double, relThreshold: Double): Boolean {
        return true
    }

    fun autoMatchMemberMethods(level: ClassifierLevel, absThreshold: Double, relThreshold: Double): Boolean {
        return true
    }

    fun autoMatchMemberFields(level: ClassifierLevel, absThreshold: Double, relThreshold: Double): Boolean {
        return true
    }

    fun autoMatchStaticMethods(level: ClassifierLevel, absThreshold: Double, relThreshold: Double): Boolean {
        return true
    }

    fun autoMatchStaticFields(level: ClassifierLevel, absThreshold: Double, relThreshold: Double): Boolean {
        return true
    }
}