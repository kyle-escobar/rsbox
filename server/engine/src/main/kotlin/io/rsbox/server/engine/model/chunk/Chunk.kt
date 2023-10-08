package io.rsbox.server.engine.model.chunk

import io.rsbox.server.engine.model.Tile
import io.rsbox.server.engine.model.entity.Entity

class Chunk(val x: Int, val y: Int, val heights: Int) {

    val entities = mutableListOf<Entity>()

    inline fun <reified T : Entity> findEntities(tile: Tile): List<T> = entities.filterIsInstance<T>().filter { it.tile == tile }
    inline fun <reified T : Entity> findEntities(): List<T> = entities.filterIsInstance<T>()

    companion object {
        private const val CHUNK_VIEW_RADIUS = 3
    }
}