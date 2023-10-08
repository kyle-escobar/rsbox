@file:Suppress("NO_TAIL_CALLS_FOUND")

package io.rsbox.server.cache

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.rsbox.server.cache.map.MapRegionEntry
import io.rsbox.server.cache.map.MapRegionLocation
import io.rsbox.server.cache.map.MapRegionTerrain
import io.rsbox.server.config.XteaConfig
import io.rsbox.server.util.buffer.discard
import io.rsbox.server.util.buffer.readIncrSmallSmart
import io.rsbox.server.util.buffer.readUnsignedShortSmart
import org.openrs2.crypto.SymmetricKey

class MapArchive(private val entryMap: MutableMap<Int, MapRegionEntry> = mutableMapOf()) : Map<Int, MapRegionEntry> by entryMap {

    override operator fun get(key: Int): MapRegionEntry {
        if(!entryMap.containsKey(key)) {
            load(key)
        }
        return entryMap[key] ?: error("Failed to get map from cahce for region: $key.")
    }

    fun load(regionId: Int) {
        if(!entryMap.containsKey(regionId)) {
            val xtea = XteaConfig.getRegionKey(regionId)
            val entry = loadMapRegionEntry(regionId, xtea)
            entryMap[entry.id] = entry
        }
    }

    companion object {

        const val id = 5

        private fun loadMapRegionEntry(regionId: Int, xteas: IntArray): MapRegionEntry {
            val entry = MapRegionEntry(regionId)

            if(xteas.isEmpty()) {
                return entry
            }

            /*
             * Load region map terrain
             */
            for(level in 0 until 4) {
                for(x in 0 until 64) {
                    for(y in 0 until 64) {
                        val data = GameCache.cache.read(id, "m${entry.regionX}_${entry.regionY}", 0)
                        entry.terrain[entry.pack(x, y, level)] = data.loadTerrain()
                        data.release()
                    }
                }
            }

            /*
             * Load region map locations (objects)
             */

            var data: ByteBuf = Unpooled.buffer()
            try {
                data = GameCache.cache.read(id, "l${entry.regionX}_${entry.regionY}", 0, xteas.toXteaKey())
            } catch(e: Exception) {
                /*
                 * Do nothing.
                 */
            } finally {
                data.release()
            }

            return entry
        }

        private tailrec fun ByteBuf.loadTerrain(
            height: Int = 0,
            overlayId: Int = 0,
            overlayPath: Int = 0,
            overlayRotation: Int = 0,
            collision: Int = 0,
            underlayId: Int = 0
        ): MapRegionTerrain {
            this.retain()
            return when(val opcode = readUnsignedShort()) {
                0 -> MapRegionTerrain(collision)
                1 -> {
                    discard(1)
                    MapRegionTerrain(collision)
                }
                else -> loadTerrain(
                    height = height,
                    overlayId = if(opcode in 2..49) readShort().toInt() else overlayId,
                    overlayPath = if(opcode in 2..49) (opcode - 2) / 4 else overlayPath,
                    overlayRotation = if(opcode in 2..49) opcode - 2 and 3 else overlayRotation,
                    collision = if(opcode in 50..81) opcode - 49 else collision,
                    underlayId = if(opcode > 81) opcode - 81 else underlayId
                )
            }
        }

        private tailrec fun ByteBuf.loadLocs(entry: MapRegionEntry, locId: Int = -1) {
            this.retain()
            val offset = readIncrSmallSmart()
            if(offset == 0) return
            loadLocationCollision(entry, locId + offset, 0)
            return loadLocs(entry, locId + offset)
        }

        private tailrec fun ByteBuf.loadLocationCollision(entry: MapRegionEntry, locId: Int, packedLocation: Int) {
            this.retain()
            val offset = readUnsignedShortSmart()
            if(offset == 0) return
            val attributes = readUnsignedByte().toInt()
            val shape = attributes shr 2
            val rotation = attributes and 0x3

            val packed = packedLocation + offset - 1
            val x = packed shr 6 and 0x3F
            val y = packed and 0x3F
            val level = (packed shr 12).let {
                if(entry.terrain[entry.pack(x, y, 1)]!!.collision and 0x2 == 2) it - 1 else it
            }

            val adjusted = entry.pack(x, y, level)

            if(level >= 0) {
                entry.locations[adjusted] = when(val size = entry.locations[adjusted]?.size ?: 0) {
                    0 -> Array(1) { MapRegionLocation(locId, x, y, level, shape, rotation) }
                    in 1 until 5 -> {
                        entry.locations[adjusted]!!.copyOf(size + 1).also {
                            it[size] = MapRegionLocation(locId, x, y, level, shape, rotation)
                        }
                    }
                    else -> throw IllegalStateException("Size is too large. Max capacity of 5.")
                }
            }
            return loadLocationCollision(entry, locId, packedLocation)
        }

        private fun IntArray.toXteaKey() = SymmetricKey(this[0], this[1], this[2], this[3])
    }

}