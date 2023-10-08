package io.rsbox.server.engine.model

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.sqrt

@JvmInline
value class Tile(val packed: Int) {

    constructor(x: Int, y: Int, level: Int = 0) : this(
        ((x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (level shl 30))
    )

    val x get() = packed and 0x7FFF
    val y get() = (packed shr 15) and 0x7FFF
    val level get() = (packed ushr 30) and 0x3

    val chunkX get() = x shr 3
    val chunkY get() = y shr 3

    val regionBaseX get() = (x shr 3) - 6
    val regionBaseY get() = (y shr 3) - 6
    val regionX get() = x shr 6
    val regionY get() = y shr 6
    val regionId get() = (regionX shl 8) or regionY

    val packed18Bit get() = (y shr 13) or ((x shr 13) shl 8) or ((level and 0x3) shl 16)
    val packed30Bit get() = (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)

    val chunkBase get() = Tile(chunkX, chunkY, level)
    val regionBase get() = Tile(regionBaseX, regionBaseY, level)

    fun clone() = Tile(packed)

    fun transform(dx: Int = 0, dy: Int = 0, dlevel: Int = 0) = Tile(
        x + dx,
        y + dy,
        level + dlevel
    )

    fun isWithinRadius(other: Tile, radius: Int): Boolean {
        if(other.level != level) return false
        val dx = abs(x - other.x)
        val dy = abs(y - other.y)
        return dx <= radius && dy <= radius
    }

    fun distanceTo(other: Tile): Int {
        val dx = x - other.x
        val dy = y - other.y
        return ceil(sqrt(((dx * dx + dy * dy).toDouble()))).toInt()
    }

    fun deltaTo(other: Tile) = abs(x - other.x) + abs(y - other.y)

    override fun toString(): String {
        return "Tile(x=$x, y=$y, level=$level)"
    }


}