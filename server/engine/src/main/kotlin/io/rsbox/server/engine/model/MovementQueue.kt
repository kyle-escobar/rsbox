package io.rsbox.server.engine.model

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Entity
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import org.rsmod.pathfinder.Route
import org.rsmod.pathfinder.RouteCoordinates
import java.util.Deque
import java.util.LinkedList
import kotlin.math.sign

class MovementQueue(val entity: Entity, private val steps: Deque<Tile> = LinkedList()) : Deque<Tile> by steps {

    private val routeSteps = LinkedList<RouteCoordinates>()

    fun cycle() {
        calculateRouteStep()

        var step = poll() ?: return

        val walkDir = Direction.between(entity.tile, step)
        var runDir: Direction? = null

        if(walkDir == Direction.NONE) return

        var tile = step
        if(entity.running) {
            calculateRouteStep(tile)

            step = poll() ?: return run {
                entity.move(tile, walkDir, MovementType.WALK)
            }

            runDir = Direction.between(tile, step)
            if(false) {
                clear()
                runDir = null
            } else {
                tile = step
            }
        }

        if(runDir != null) {
            entity.move(tile, runDir, MovementType.RUN)
        } else {
            entity.move(tile, walkDir, null)
        }
    }

    private fun calculateRouteStep(tile: Tile = entity.tile) {
        if(isNotEmpty()|| routeSteps.isEmpty()) return
        clear()

        val step = routeSteps.poll()

        var curX = tile.x
        var curY = tile.y

        val destX = step.x
        val destY = step.y

        val dx = (destX - curX).sign
        val dy = (destY - curY).sign
        while(curX != destX || curY != destY) {
            curX += dx
            curY += dy
            add(Tile(curX, curY, tile.level))
        }
    }

    fun addRoute(route: Route) {
        routeSteps.clear()
        clear()
        routeSteps.addAll(route)
    }

    private fun Entity.move(tile: Tile, direction: Direction, type: MovementType?) {
        if(this is Player) {
            this.direction = direction
            this.tile = tile
            if(type != null) {
                movementType = type
                updateFlags.add(PlayerUpdateFlag.MOVEMENT)
            }
        }
    }
}