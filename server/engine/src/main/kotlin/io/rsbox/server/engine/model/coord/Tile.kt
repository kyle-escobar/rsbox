package io.rsbox.server.engine.model.coord

@JvmInline
value class     Tile(val packed: Int) {

    val x get() = packed and 0x7FFF

    val y get() = (packed shr 15) and 0x7FFF

    val level get() = (packed shr 30) and 0x3

    constructor(x: Int, y: Int, level: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (level shl 30)
    )

    fun to18BitInteger() = (y shr 13) or ((x shr 13) shl 8) or ((level and 0x3) shl 16)

    fun to30BitInteger() = (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)

    fun toChunk() = Chunk(
        x / Chunk.SIZE,
        y / Chunk.SIZE,
        level
    )

    fun toRegion() = Region(
        x / Region.SIZE,
        y / Region.SIZE
    )

    fun toScene() = Scene(
        x / Scene.SIZE,
        y / Scene.SIZE
    )

    override fun toString(): String {
        return "Tile(x=$x, y=$y, level=$level)"
    }

    companion object {
        const val SIZE = 1
    }
}