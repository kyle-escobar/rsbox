package io.rsbox.server.engine.model

import kotlin.math.abs
import kotlin.math.max

@JvmInline
value class Tile(val packed: Int) {

    constructor(x: Int, y: Int, level: Int = 0) : this(
        (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)
    )

    val x get() = packed shr 14 and 0x3FFF
    val y get() = packed and 0x3FFF
    val level get() = packed shr 28 and 0x3

    val chunkX get() = (x shr 3)
    val chunkY get() = (y shr 3)
    val chunkId get() = chunkX or (chunkY shl 11) or (level shl 22)

    val regionX get() = (x shr 6)
    val regionY get() = (y shr 6)
    val regionId get() = (regionX shl 8) or regionY
    val regionPacked get() = y shr 13 or (x shr 13 shl 8) or (level shl 16)

    val packedOffset get() = ((x and 0x7) shl 4) or (y and 0x7)

    fun clone() = Tile(packed)

    fun transform(dx: Int = 0, dy: Int = 0, dlevel: Int = 0) = Tile(
        x + dx,
        y + dy,
        level + dlevel
    )

    fun distanceTo(other: Tile): Int {
        val dx = abs(other.x - x)
        val dy = abs(other.y - y)
        return max(dx, dy)
    }

    fun withinDistance(other: Tile, distance: Int = 15): Boolean {
        if(other.level != level) return false
        val dx = other.x - x
        val dy = other.y - y
        return dx <= distance && dx >= -distance && dy <= distance && dy >= -distance
    }

    override fun toString(): String {
        return "Tile(x=$x, y=$y, level=$level)"
    }


}