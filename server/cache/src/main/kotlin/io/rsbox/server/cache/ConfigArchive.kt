package io.rsbox.server.cache

import io.rsbox.server.cache.config.EnumConfig
import io.rsbox.server.cache.config.VarClientConfig
import io.rsbox.server.cache.model.Archive

class ConfigArchive(
    val enums: Map<Int, EnumConfig<Any, Any>>,
    val varClients: Map<Int, VarClientConfig>
) {

    companion object {

        const val id = 2

        fun load(archive: Archive) = ConfigArchive(
            EnumConfig.load(archive.readGroup(EnumConfig.id)),
            VarClientConfig.load(archive.readGroup(VarClientConfig.id))
        )
    }
}