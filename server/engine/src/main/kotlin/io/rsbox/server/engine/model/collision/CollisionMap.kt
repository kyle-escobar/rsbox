package io.rsbox.server.engine.model.collision

import io.rsbox.server.cache.GameCache
import io.rsbox.server.cache.map.MapRegionEntry
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.GameObject
import io.rsbox.server.engine.model.coord.Region
import io.rsbox.server.engine.model.coord.Tile
import org.rsmod.pathfinder.ZoneFlags
import org.rsmod.pathfinder.flag.CollisionFlag.BLOCK_NPCS
import org.rsmod.pathfinder.flag.CollisionFlag.FLOOR
import org.rsmod.pathfinder.flag.CollisionFlag.FLOOR_DECORATION

class CollisionMap(private val flags: ZoneFlags = ZoneFlags()) {

    private val cache: GameCache by inject()

    fun flags() = flags.flags

    fun applyCollision(entry: MapRegionEntry) {
        for(level in 0 until 4) {
            for(x in 0 until Region.SIZE) {
                for(y in 0 until Region.SIZE) {
                    if((entry.terrain[entry.pack(x, y, level)]!!.collision and 0x1) != 0x1) continue
                    val newLevel = if((entry.terrain[entry.pack(x, y, 1)]!!.collision and 0x2) == 0x2) level - 1 else level
                    if(newLevel < 0) continue
                    val baseX = entry.regionX shl 6
                    val baseY = entry.regionY shl 6
                    val tile = Tile(baseX + x, baseY + y, level)
                    addFloorCollision(tile)
                }
            }
        }

        for(level in 0 until 4) {
            for(x in 0 until Region.SIZE) {
                for(y in 0 until Region.SIZE) {
                    val baseX = entry.regionX shl 6
                    val baseY = entry.regionY shl 6
                    entry.locations[entry.pack(x, y, level)]?.forEach { loc ->
                        if(loc == null) return@forEach
                        val tile = Tile(baseX + loc.x, baseY + loc.y, loc.level)
                        if(!cache.configArchive.objects.containsKey(loc.id)) return@forEach
                        val gameObject = GameObject(loc.id, tile, loc.shape, loc.rotation)

                    }
                }
            }
        }
    }

    fun addEntityCollision(tile: Tile) = addCollisionFlag(tile, BLOCK_NPCS)
    fun removeEntityCollision(tile: Tile) = removeCollisionFlag(tile, BLOCK_NPCS)

    fun getCollisionFlag(tile: Tile) = flags[tile.x, tile.y, tile.level]


    fun addCollisionFlag(tile: Tile, mask: Int) = flags.add(tile.x, tile.y, tile.level, mask)
    fun removeCollisionFlag(tile: Tile, mask: Int) = flags.remove(tile.x, tile.y, tile.level, mask)

    fun addFloorCollision(tile: Tile) = addCollisionFlag(tile, FLOOR)
    fun addFloorDecorCollision(tile: Tile) = addCollisionFlag(tile, FLOOR_DECORATION)
}