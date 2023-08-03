package io.rsbox.server.engine.model.coord

@JvmInline
value class Scene(val packed: Int) {

    val x get() = packed and 0xFFFF

    val y get() = (packed shr 16) and 0xFFFF

    constructor(x: Int, y: Int) : this(
        (x and 0xFFFF) or ((y and 0xFFFF) shl 16)
    )

    fun toTile(level: Int = 0) = Tile(
        x * SIZE,
        y * SIZE,
        level
    )

    fun toChunk(level: Int = 0) = Chunk(
        x * (SIZE / Chunk.SIZE),
        y * (SIZE / Chunk.SIZE),
        level
    )

    fun toRegion() = Region(
        x * (SIZE / Region.SIZE),
        y * (SIZE / Region.SIZE)
    )

    override fun toString(): String {
        return "Scene(x=$x, y=$y)"
    }

    companion object {
        const val SIZE = 104
    }
}