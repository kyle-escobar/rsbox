package io.rsbox.toolbox.updater

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.ClassEnv
import io.rsbox.toolbox.updater.asm.FieldEntry
import io.rsbox.toolbox.updater.asm.MethodEntry
import io.rsbox.toolbox.updater.classifier.ClassifierLevel
import io.rsbox.toolbox.updater.classifier.ClassClassifier
import io.rsbox.toolbox.updater.classifier.ClassifierUtil
import io.rsbox.toolbox.updater.classifier.RankResult
import io.rsbox.toolbox.updater.log.Logger
import io.rsbox.toolbox.updater.ui.MainApp
import io.rsbox.toolbox.updater.util.identityHashSetOf
import tornadofx.launch
import java.io.File
import java.util.Collections
import java.util.IdentityHashMap
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.sqrt

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

        launch<MainApp>()
        //start()
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


        /*
         * Start the initial automatch. We first go ahead and match non-obfuscated
         * classes and their member hierarchy since their names will exist in both groups.
         */
        matchUnobfuscated()
        autoMatchAll()
    }

    private fun matchUnobfuscated() {
        env.groupA.classes.forEach { clsA ->
            if(clsA.nameObfuscated) return@forEach
            val clsB = env.groupB.getClass(clsA.name)
            if(clsB != null &&  !clsB.nameObfuscated) {
                match(clsA, clsB)
            }
        }
    }

    fun match(a: ClassEntry, b: ClassEntry) {
        if(a.match == b) return
        if(a.hasMatch()) { unmatchMembers(a) }
        if(b.hasMatch()) { unmatchMembers(b) }
        a.match(b)
        b.match(a)
        if(a.isArray()) {
            if(!a.elementClass!!.hasMatch()) match(a.elementClass!!, b.elementClass!!)
        } else {
            a.arrayClasses.forEach { arrayA ->
                for(arrayB in b.arrayClasses) {
                    if(arrayB.hasMatch() || arrayA.arrayDims() != arrayB.arrayDims()) continue
                    match(arrayA, arrayB)
                    break
                }
            }
        }

        a.methods.forEach { methodA ->
            if(methodA.nameObfuscated) return@forEach
            val methodB = b.getMethod(methodA.name, methodA.desc)
            if(methodB != null && !methodB.nameObfuscated) {
                match(methodA, methodB)
            }
        }

        a.fields.forEach { fieldA ->
            if(fieldA.nameObfuscated) return@forEach
            val fieldB = b.getField(fieldA.name, fieldA.desc)
            if(fieldB != null && !fieldB.nameObfuscated) {
                match(fieldA, fieldB)
            }
        }

        Logger.info("Identified Class: $a -> $b")
    }

    fun match(a: MethodEntry, b: MethodEntry) {
        if(a.match == b) return
        if(!a.isStatic() && !b.isStatic()) {
            if(a.cls.match != b.cls) throw IllegalStateException()
        }

        a.match(b)
        b.match(a)

        Logger.info("Identified Method: $a -> $b")
    }

    fun match(a: FieldEntry, b: FieldEntry) {
        if(a.match == b) return
        if(!a.isStatic() && !b.isStatic()) {
            if(a.cls.match != b.cls) throw IllegalStateException()
        }

        a.match(b)
        b.match(a)

        Logger.info("Identified Field: $a -> $b")
    }

    fun unmatchMembers(cls: ClassEntry) {
        cls.memberMethods.forEach { m ->
            if(m.hasMatch()) {
                m.match!!.unmatch()
                m.unmatch()
            }
        }
        cls.memberFields.forEach { f ->
            if(f.hasMatch()) {
                f.match!!.unmatch()
                f.unmatch()
            }
        }
    }

    fun autoMatchAll() {
        return
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
        val filter = { cls: ClassEntry -> !cls.hasMatch() && cls.matchable }

        val srcClasses = env.groupA.classes.filter(filter)
        val dstClasses = env.groupB.classes.filter(filter)

        val maxScore = ClassClassifier.getMaxScore(level)
        val maxMismatch = maxScore - getRawScore(absThreshold * (1 - relThreshold), maxScore)
        val matches = ConcurrentHashMap<ClassEntry, ClassEntry>()

        for(srcCls in srcClasses)  {
            val ranking = ClassifierUtil.rank(srcCls, dstClasses.toTypedArray(), ClassClassifier.getAnalyzers(level), ClassifierUtil::isMaybeEqual, maxMismatch)
            if(checkRank(ranking, maxScore)) {
                val match = ranking[0].subject
            }
        }

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

    fun checkRank(ranking: List<RankResult<*>>, maxScore: Double): Boolean {
        if(ranking.isEmpty()) return false

        val score = getScore(ranking[0].score, maxScore)
        if(score < absAutoMatchThreshold) return false

        return if(ranking.size == 1) {
            true
        } else {
            val nextScore = getScore(ranking[1].score, maxScore)
            nextScore < score * (1 - relAutoMatchThreshold)
        }
    }

    fun getScore(rawScore: Double, maxScore: Double): Double {
        val ret = rawScore / maxScore
        return ret * ret
    }

    private fun getRawScore(score: Double, maxScore: Double): Double {
        return sqrt(score) * maxScore
    }

    fun <T> reduceMatches(matches: MutableMap<T, T>) {
        val matched = Collections.newSetFromMap<T>(IdentityHashMap(matches.size))
        val conflicts = identityHashSetOf<T>()

        matches.values.forEach { match ->
            if(!matched.add(match)) {
                conflicts.add(match)
            }
        }

        if(conflicts.isNotEmpty()) {
            matches.values.removeAll(conflicts)
        }
    }
}