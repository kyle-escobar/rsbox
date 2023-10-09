package io.rsbox.server.engine.model.entity

import io.rsbox.server.common.inject
import io.rsbox.server.engine.Engine
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.movement.MovementDirection
import io.rsbox.server.engine.model.movement.MovementType
import io.rsbox.server.engine.sync.update.UpdateFlag
import java.util.SortedSet

abstract class Entity {

    val engine: Engine by inject()
    val world: World by inject()

    abstract val sizeX: Int
    abstract val sizeY: Int

    abstract var tile: Tile
    abstract var prevTile: Tile

    var index: Int = -1
    var invisible = false

    abstract val updateFlags: SortedSet<out UpdateFlag>

    var teleportTile: Tile? = null
    var movementType = MovementType.NONE

    abstract suspend fun cycle()

}