package io.rsbox.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.toValue
import io.rsbox.server.common.inject
import java.io.File
import java.io.FileNotFoundException

class XteaConfig {

    private var config = Config()
    private val file = File("data/cache/xteas.json")

    val xteas = mutableMapOf<Int, IntArray>()

    fun load() {
        if(!file.exists()) {
            throw FileNotFoundException("Failed to load '/data/cache/xteas.json' config file.")
        }

        val entries = config.from.json.file(file).toValue<Array<XteaEntry>>()
        entries.forEach {
            xteas[it.region] = it.key
        }
    }

    operator fun get(region: Int): IntArray = xteas[region] ?: EMPTY_KEYS

    data class XteaEntry(val region: Int, val key: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as XteaEntry

            if (region != other.region) return false
            if (!key.contentEquals(other.key)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = region
            result = 31 * result + key.contentHashCode()
            return result
        }
    }

    companion object {

        val EMPTY_KEYS = IntArray(4) { 0 }

        private val config: XteaConfig by inject()

        init {
            config.load()
        }

        val xteas = config.xteas

        fun getRegionKey(region: Int): IntArray = config[region]

    }
}