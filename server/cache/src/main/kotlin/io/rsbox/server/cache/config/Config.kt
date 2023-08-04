package io.rsbox.server.cache.config

import io.netty.buffer.ByteBuf
import io.rsbox.server.cache.GameCache
import io.rsbox.server.cache.model.Group

abstract class Config(open val id: Int) {

    abstract class ConfigCompanion<out T : Config> {

        abstract val id: Int

        abstract fun decode(id: Int, data: ByteBuf): T

        fun load(group: Group): Map<Int, T> {
            val configs = mutableMapOf<Int, T>()
            GameCache.cache.list(group.archive.id, group.id).asSequence().forEach { file ->
                val data = group.readFile(file.id).data
                configs[file.id] = decode(file.id, data)
            }
            return configs
        }
    }
}