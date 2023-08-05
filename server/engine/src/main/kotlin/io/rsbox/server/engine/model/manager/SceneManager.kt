package io.rsbox.server.engine.model.manager

import io.rsbox.server.engine.model.Tile
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.game.packet.server.RebuildNormalServerPacket

class SceneManager(private val player: Player) {

    var baseTile: Tile = player.tile

    val regionIds: List<Int> get() {
        val list = mutableListOf<Int>()

        val lx = (baseTile.chunkX - 6) / 8
        val ly = (baseTile.chunkY - 6) / 8
        val rx = (baseTile.chunkX + 6) / 8
        val ry = (baseTile.chunkY + 6) / 8

        for(chunkX in lx..rx) {
            for(chunkY in ly .. ry) {
                list.add((chunkX shl 8) + chunkY)
            }
        }

        return list
    }

    fun init() {
        baseTile = player.tile
        player.session.write(RebuildNormalServerPacket(player, gpi = true))
    }
}