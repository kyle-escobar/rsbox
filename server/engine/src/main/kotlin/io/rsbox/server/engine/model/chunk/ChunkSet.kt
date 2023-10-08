package io.rsbox.server.engine.model.chunk

import io.rsbox.server.cache.GameCache
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.Tile

class ChunkSet {

    private val cache: GameCache by inject()

    private val chunks = hashMapOf<Tile, Chunk>()
    private val regions = hashSetOf<Int>()

    fun get(x: Int, y: Int, level: Int, create: Boolean = false): Chunk? {
        val tile = Tile((x shl 3), (y shl 3), level)
        val chunk = chunks[tile]
        if(chunk != null) return chunk
        else if(!create) return null

        val newChunk = Chunk(x, y, 4)
        chunks[tile] = newChunk

        val regionId = tile.regionId
        if(regions.add(regionId)) {
            cache.mapArchive.load(regionId)
        }

        return newChunk
    }

    fun get(tile: Tile, create: Boolean = false) = get((tile.x shr 3), (tile.y shr 3), tile.level, create)

    fun getOrCreate(tile: Tile): Chunk = get(tile, true)!!
}