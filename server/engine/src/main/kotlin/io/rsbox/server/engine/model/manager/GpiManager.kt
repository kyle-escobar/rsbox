package io.rsbox.server.engine.model.manager

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player

class GpiManager(private val player: Player) {

    private val world: World by inject()

    var localPlayerCount = 0
    val localPlayerIndexes = IntArray(World.MAX_PLAYERS)
    val localPlayers = arrayOfNulls<Player>(World.MAX_PLAYERS)

    var externalPlayerCount = 0
    val externalPlayerIndexes = IntArray(World.MAX_PLAYERS)

    val tileUpdates = IntArray(World.MAX_PLAYERS)
    val skipFlags = IntArray(World.MAX_PLAYERS)

    fun init() {
        localPlayers[player.index] = player
        localPlayerIndexes[localPlayerCount++] = player.index

        for(index in 1 until World.MAX_PLAYERS) {
            if(index == player.index) continue
            externalPlayerIndexes[externalPlayerCount++] = index
            tileUpdates[index] = world.players[index]?.tile?.regionPacked ?: 0
        }
    }

    fun reset() {
        localPlayerCount = 0
        externalPlayerCount = 0

        for(i in 1 until World.MAX_PLAYERS) {
            skipFlags[i] = skipFlags[i] shr 0x1
            if(localPlayers[i]?.tile ?: error("") != null) {
                localPlayerIndexes[localPlayerCount++] = i
            } else {
                externalPlayerIndexes[externalPlayerCount++] = i
            }
        }
    }
}