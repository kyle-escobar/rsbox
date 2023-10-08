package io.rsbox.server.engine.model

import io.rsbox.server.common.inject
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.chunk.ChunkSet
import io.rsbox.server.engine.model.entity.EntityList
import io.rsbox.server.engine.model.entity.Player
import org.tinylog.kotlin.Logger

class World {

    val engine: Engine by inject()

    val players: EntityList<Player> = EntityList(MAX_PLAYERS)
    val chunks = ChunkSet()

    internal fun load() {
        Logger.info("Loading game world.")
    }

    fun cycle() {

    }

    fun addPlayer(player: Player) {
        players.add(player)
        val chunk = chunks.getOrCreate(player.tile)
        chunk.entities.add(player)
    }

    fun removePlayer(player: Player) {
        players.remove(player)
        val chunk = chunks.getOrCreate(player.tile)
        chunk.entities.remove(player)
    }

    companion object {
        const val MAX_PLAYERS = 2048
        const val MAX_NPCS = 65535
    }
}