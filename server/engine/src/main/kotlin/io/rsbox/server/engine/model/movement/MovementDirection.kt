package io.rsbox.server.engine.model.movement

import io.rsbox.server.engine.model.Direction

data class MovementDirection(val walkDirection: Direction?, val runDirection: Direction?) {
    companion object {
        val None = MovementDirection(null, null)
    }
}