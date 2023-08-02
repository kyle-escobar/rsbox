package io.rsbox.server.cache

import org.koin.dsl.module

val CACHE_MODULE = module {
    single { GameCache() }
}