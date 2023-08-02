package io.rsbox.server

import io.rsbox.server.cache.CACHE_MODULE
import io.rsbox.server.config.CONFIG_MODULE
import io.rsbox.server.util.UTIL_MODULE

val DI_MODULES = listOf(
    CONFIG_MODULE,
    UTIL_MODULE,
    CACHE_MODULE
)