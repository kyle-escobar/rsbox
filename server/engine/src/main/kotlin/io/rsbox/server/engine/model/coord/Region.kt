package io.rsbox.server.engine.model.coord

@JvmInline
value class Region(val id: Int) {

    val x get() = id shr 8

    val y get() = id and 0xFF

    constructor(x: Int, y: Int) : this(
        (x shl 8) or y
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

    override fun toString(): String {
        return "Region(id=$id)[$x,$y]"
    }

    companion object {
        const val SIZE = 64
    }
}