package io.rsbox.server.engine

import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.collision.CollisionMap
import io.rsbox.server.engine.net.NetworkServer
import io.rsbox.server.engine.sync.SyncTaskList
import org.koin.dsl.module

val ENGINE_MODULE = module {
    single { Engine() }
    single { NetworkServer() }
    single { World() }
    single { SyncTaskList() }
}