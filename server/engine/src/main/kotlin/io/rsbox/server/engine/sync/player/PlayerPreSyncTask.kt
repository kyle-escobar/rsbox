package io.rsbox.server.engine.sync.player

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.movement.MovementType
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag

class PlayerPreSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
            world.players.forEachEntry { player ->
                player.updateMovement()
                player.scene.cycle()
            }
    }

    private fun Player.updateMovement() {
        prevTile = tile
        when {
            teleportTile != null -> doTeleport()
        }
    }

    private fun Player.doTeleport() {
        movementType = MovementType.TELEPORT
        updateFlags.add(PlayerUpdateFlag.MOVEMENT)
        tile = teleportTile!!
    }

    private fun Player.doStep() {

    }
}