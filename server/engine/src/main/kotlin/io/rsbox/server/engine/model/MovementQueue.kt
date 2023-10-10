@file:Suppress("KotlinConstantConditions")

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

class MovementQueue(val entity: Entity, private val steps: LinkedList<Tile> = LinkedList()) : Deque<Tile> by steps {

    private val routeSteps = LinkedList<RouteCoordinates>()

    fun cycle() {
        processRouteSteps()

        when {
            entity.teleportTile != null -> {
                cancelRoute()
                entity.movementType = MovementType.TELEPORT
                entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                entity.tile = entity.teleportTile!!
                return
            }

            steps.isNotEmpty() -> {
                when {
                    entity.running -> when {
                        steps.size == 1 -> {
                            entity.movementType = MovementType.WALK
                            entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                            entity.tile = steps.poll()
                            entity.direction = Direction.between(entity.prevTile, entity.tile)
                        }
                        steps.size  > 1 && entity.tile.isWithinRadius(steps[1], 1) -> {
                            entity.movementType = MovementType.WALK
                            entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                            entity.direction = Direction.between(entity.prevTile, entity.tile)
                            entity.tile = entity.movementQueue.poll()
                        }
                        else -> {
                            entity.movementType = MovementType.RUN
                            entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                            entity.direction = Direction.between(entity.tile, steps.poll())
                            entity.tile = entity.movementQueue.poll()
                        }
                    } else -> {
                        entity.movementType = MovementType.WALK
                        entity.let { it as? Player }?.updateFlags?.add(PlayerUpdateFlag.MOVEMENT)
                        entity.direction = Direction.between(entity.prevTile, entity.tile)
                        entity.tile = entity.movementQueue.poll()
                    }
                }

                entity.direction = Direction.between(entity.prevTile, entity.tile)
            }
        }
    }

    private fun processRouteSteps(tile: Tile = entity.tile) {
        if(isNotEmpty()|| routeSteps.isEmpty()) return
        clear()

        var turnCount = 0
        var curX = tile.x
        var curY = tile.y

        while(routeSteps.isNotEmpty()) {
            val step = routeSteps.poll()
            val destX = step.x
            val destY = step.y
            val dx = (destX - curX).sign
            val dy = (destY - curY).sign
            while(curX != destX || curY != destY) {
                curX += dx
                curY += dy
                add(Tile(curX, curY, tile.level))
            }
            if(++turnCount > if(entity is Player) 420 else 420 shr 1) break
        }
    }

    fun addRoute(route: Route) {
        routeSteps.clear()
        clear()
        routeSteps.addAll(route)
    }

    fun cancelRoute() {
        routeSteps.clear()
        steps.clear()
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