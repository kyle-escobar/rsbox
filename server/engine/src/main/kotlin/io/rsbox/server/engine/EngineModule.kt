package io.rsbox.server.engine

import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.net.NetworkServer
import org.koin.dsl.module

val ENGINE_MODULE = module {
    single { Engine() }
    single { NetworkServer() }
    single { World() }
}