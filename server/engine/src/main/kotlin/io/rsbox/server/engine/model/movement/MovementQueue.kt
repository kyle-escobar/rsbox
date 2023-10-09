package io.rsbox.server.engine.model.movement

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.entity.Entity
import java.util.Deque
import java.util.LinkedList

class MovementQueue(private val entity: Entity, private val steps: Deque<Tile> = LinkedList()) : Deque<Tile> by steps {

    fun cycle() {

    }
}