package io.rsbox.server.engine.model.manager

import io.rsbox.server.engine.model.coord.Chunk
import io.rsbox.server.engine.model.coord.Region
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.game.packet.server.RebuildNormalServerPacket

class SceneManager(private val player: Player) {

    var baseTile: Tile = player.tile

    val loadedRegions: List<Region> get() {
        val ret = mutableListOf<Region>()
        val baseChunk = baseTile.toChunk()

        val lx = (baseChunk.x - 6) / Chunk.SIZE
        val ly = (baseChunk.y - 6) / Chunk.SIZE
        val rx = (baseChunk.x + 6) / Chunk.SIZE
        val ry = (baseChunk.y + 6) / Chunk.SIZE

        for(x in lx..rx) {
            for(y in ly .. ry) {
                ret.add(Region(x, y))
            }
        }

        return ret
    }

    fun init() {
        baseTile = player.tile
        player.session.write(RebuildNormalServerPacket(player, gpi = true))
    }
}