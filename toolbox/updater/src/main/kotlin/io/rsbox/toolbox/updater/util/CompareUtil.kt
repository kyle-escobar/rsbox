package io.rsbox.toolbox.updater.util

object CompareUtil {

    fun compareNatural(a: String, b: String): Int {
        val lenA = a.length
        val lenB = b.length
        var posA = 0
        var lastSize = 0
        val max = Math.min(lenA, lenB)
        while (posA < max) {
            val cA = Character.codePointAt(a, posA)
            val cB = Character.codePointAt(b, posA)
            if (cA != cB) break
            lastSize = Character.charCount(cA)
            posA += lastSize
        }
        if (posA == lenA && lenA == lenB) return 0
        posA = posA - lastSize
        var posB = posA
        var endA = -1
        var endB = -1
        while (true) {
            var startA = posA
            var isNumA = false
            while (posA < lenA) {
                var c = Character.codePointAt(a, posA)
                if ((c >= '0'.code && c <= '9'.code) != isNumA) {
                    if (posA == startA) {
                        isNumA = !isNumA // isNum had the wrong initial value
                    } else {
                        if (endA < posA) {
                            endA = posA
                            do {
                                endA += Character.charCount(c)
                            } while (endA < lenA && Character.codePointAt(a, endA)
                                    .also { c = it } != '.'.code && c != '/'.code
                            )
                        }
                        break
                    }
                } else if (c == '.'.code || c == '/'.code) {
                    endA = posA // unconditionally mark end to handle 0-length segments (those won't be re-visited)
                    if (posA == startA) posA++ // consume only if first to avoid polluting comparisons within segments, otherwise trigger revisit
                    break
                } else if (c == '$'.code) {
                    if (posA == startA) posA++
                    break
                }
                posA += Character.charCount(c)
            }
            var startB = posB
            var isNumB = false
            while (posB < lenB) {
                var c = Character.codePointAt(b, posB)
                if ((c >= '0'.code && c <= '9'.code) != isNumB) {
                    if (posB == startB) {
                        isNumB = !isNumB
                    } else {
                        if (endB < posB) {
                            endB = posB
                            do {
                                endB += Character.charCount(c)
                            } while (endB < lenB && Character.codePointAt(b, endB)
                                    .also { c = it } != '.'.code && c != '/'.code
                            )
                        }
                        break
                    }
                } else if (c == '.'.code || c == '/'.code) {
                    endB = posB
                    if (posB == startB) posB++
                    break
                } else if (c == '$'.code) {
                    if (posB == startB) posB++
                    break
                }
                posB += Character.charCount(c)
            }
            val hasEndA = endA >= startA && endA < lenA // segment separator exists after current region
            val hasEndB = endB >= startB && endB < lenB
            if (hasEndA != hasEndB) {
                return if (hasEndA) 1 else -1
            }
            if (isNumA && isNumB) {
                val segLenA = posA - startA
                val segLenB = posB - startB
                if (segLenA != segLenB) {
                    return if (segLenA < segLenB) -1 else 1
                }
            }
            while (startA < posA) {
                if (startB == posB) return 1
                val cA = Character.codePointAt(a, startA)
                val cB = Character.codePointAt(b, startB)
                if (cA != cB) {
                    return if (cA < cB) -1 else 1
                }
                startA += Character.charCount(cA)
                startB += Character.charCount(cB)
            }
            if (startB != posB) return -1
        }
    }
}