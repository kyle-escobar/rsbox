package io.rsbox.server.cache

import org.openrs2.cache.Cache
import org.openrs2.cache.Js5MasterIndex
import org.openrs2.cache.Store
import java.io.File

class GameCache {

    lateinit var store: Store private set
    lateinit var cache: Cache private set
    lateinit var masterIndex: Js5MasterIndex

    fun load() {
        store = Store.open(CACHE_DIR.toPath())
        cache = Cache.open(store)
        masterIndex = Js5MasterIndex.create(store)
    }


    companion object {
        private val CACHE_DIR = File("data/cache/")
    }
}