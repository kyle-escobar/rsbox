package io.rsbox.server.engine.sync.player

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.game.packet.server.PlayerInfoServerPacket
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import io.rsbox.server.util.buffer.BIT_MODE
import io.rsbox.server.util.buffer.BYTE_MODE
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.toJagBuf
import kotlin.math.abs

class PlayerSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            player.writePlayerInfo()
        }
    }

    private fun Player.writePlayerInfo() {
        val mainBuf = session.channel.alloc().buffer().toJagBuf()
        val maskBuf = session.channel.alloc().buffer().toJagBuf()

        var local = 0
        var added = 0

        local += writeLocalPlayerUpdates(mainBuf, maskBuf, local, true)
        local += writeLocalPlayerUpdates(mainBuf, maskBuf, local,  false)
        added += writeExternalPlayerUpdates(mainBuf, maskBuf, added, true)
        added += writeExternalPlayerUpdates(mainBuf, maskBuf, added, false)

        gpi.localPlayerCount = 0
        gpi.externalPlayerCount = 0

        for(i in 1 until World.MAX_PLAYERS) {
            gpi.skipFlags[i] = gpi.skipFlags[i] shr 1
            if(gpi.localPlayers[i] != null) {
                gpi.localPlayerIndexes[gpi.localPlayerCount++] = i
            } else {
                gpi.externalPlayerIndexes[gpi.externalPlayerCount++] = i
            }
        }

        val buf = session.channel.alloc().buffer()

        mainBuf.writeBytes(maskBuf.toByteBuf())
        maskBuf.release()

        buf.writeBytes(mainBuf.toByteBuf())
        val packet = PlayerInfoServerPacket(buf)
        session.write(packet)
    }

    private fun Player.writeLocalPlayerUpdates(buf: JagByteBuf, maskBuf: JagByteBuf, added: Int, active: Boolean): Int {
        buf.switchWriteAccess(BIT_MODE)

        var skipCount = 0
        for(i in 0 until gpi.localPlayerCount) {
            val localIndex = gpi.localPlayerIndexes[i]
            val localPlayer = gpi.localPlayers[localIndex]

            if(when(active) {
                true -> (gpi.skipFlags[localIndex] and 0x1) != 0
                false -> (gpi.skipFlags[localIndex] and 0x1) == 0
            }) {
                continue
            }

            if(skipCount > 0) {
                skipCount--
                gpi.skipFlags[localIndex] = gpi.skipFlags[localIndex] or 0x2
                continue
            }

            if(this != localPlayer && (localPlayer == null || shouldRemove(localPlayer))) {
                val lastTile = gpi.tileUpdates[localIndex]
                val curTile = localPlayer?.tile?.packed18Bit ?: 0

                buf.writeRemoveLocalPlayer(lastTile != curTile)
                if(lastTile != curTile) {
                    buf.writeTileChange(lastTile, curTile)
                }

                gpi.localPlayers[localIndex] = null
                gpi.tileUpdates[localIndex] = curTile
                continue
            }

            if(localPlayer.updateFlags.isNotEmpty()) {
                maskBuf.writePlayerUpdate(localPlayer, false)
            }

            if(false) {
                // Write player Move Teleport
            } else if(false) {
                // Write player Move Walk/Run
            } else if(localPlayer.updateFlags.isNotEmpty()) {
                buf.writeRequireUpdate()
            } else {
                for(j in i + 1 until gpi.localPlayerCount) {
                    val nextIndex = gpi.localPlayerIndexes[j]
                    val nextPlayer = gpi.localPlayers[nextIndex]
                    if(when(active) {
                        true -> (gpi.skipFlags[nextIndex] and 0x1) != 0
                        false -> (gpi.skipFlags[nextIndex] and 0x1) == 0
                    }) continue
                    if(nextPlayer == null || nextPlayer.updateFlags.isNotEmpty() || nextPlayer != this && shouldRemove(nextPlayer)) break
                    skipCount++
                }

                buf.writeSkipCount(skipCount)
                gpi.skipFlags[localIndex] = gpi.skipFlags[localIndex] or 0x2
            }
        }

        if(skipCount > 0) {
            throw RuntimeException()
        }

        buf.switchWriteAccess(BYTE_MODE)
        return added
    }

    private fun Player.writeExternalPlayerUpdates(buf: JagByteBuf, maskBuf: JagByteBuf, added: Int, active: Boolean): Int {
        buf.switchWriteAccess(BIT_MODE)

        var skipCount = 0
        var newAdded = added

        for(i in 0 until gpi.externalPlayerCount) {
            val externalIndex = gpi.externalPlayerIndexes[i]

            if(when(active) {
                true -> (gpi.skipFlags[externalIndex] and 0x1) == 0
                false -> (gpi.skipFlags[externalIndex] and 0x1) != 0
            }) {
                continue
            }

            if(skipCount > 0) {
                skipCount--
                gpi.skipFlags[externalIndex] = gpi.skipFlags[externalIndex] or 0x2
                continue
            }

            val externalPlayer = if(externalIndex < World.MAX_PLAYERS) world.players[externalIndex] else null
            if(externalPlayer != null && shouldAdd(externalPlayer) && newAdded < MAX_NEW_PLAYERS_TO_DRAW && gpi.localPlayerCount + newAdded < MAX_PLAYERS_TO_DRAW) {
                val lastTile = gpi.tileUpdates[externalIndex]
                val curTile = externalPlayer.tile.packed18Bit

                if(curTile == lastTile) buf.writeAddLocalPlayer(externalPlayer) else buf.writeAddLocalPlayer(externalPlayer, lastTile, curTile)
                maskBuf.writePlayerUpdate(externalPlayer, true)

                gpi.skipFlags[externalIndex] = gpi.skipFlags[externalIndex] or 0x2
                gpi.tileUpdates[externalIndex] = curTile
                gpi.localPlayers[externalIndex] = externalPlayer

                newAdded++
                continue
            }

            for(j in i + 1 until gpi.externalPlayerCount) {
                val nextIndex = gpi.externalPlayerIndexes[j]

                if(when(active) {
                    true -> (gpi.skipFlags[nextIndex] and 0x1) == 0
                    false -> (gpi.skipFlags[nextIndex] and 0x1) != 0
                }) {
                    continue
                }

                val nextPlayer = if(nextIndex < World.MAX_PLAYERS) world.players[nextIndex] else null
                if(nextPlayer != null && (shouldAdd(nextPlayer) || gpi.tileUpdates[nextIndex] != nextPlayer.tile.packed18Bit)) {
                    break
                }

                skipCount++
            }

            buf.writeSkipCount(skipCount)
            gpi.skipFlags[externalIndex] = gpi.skipFlags[externalIndex] or 0x2
        }

        if(skipCount > 0) {
            throw RuntimeException()
        }

        buf.switchWriteAccess(BYTE_MODE)
        return newAdded
    }

    private fun JagByteBuf.writeRemoveLocalPlayer(requireUpdate: Boolean) {
        writeBits(1, 1)
        writeBits(0, 1)
        writeBits(0, 2)
        writeBits(if(requireUpdate) 1 else 0, 1)
    }

    private fun JagByteBuf.writeTileChange(last: Int, cur: Int) {
        val lastX = (last shr 8) and 0xFF
        val lastY = last and 0xFF
        val lastLevel = last shr 16

        val curX = (cur shr 8) and 0xFF
        val curY = cur and 0xFF
        val curLevel = cur shr 16

        val dx = curX - lastX
        val dy = curY - lastY
        val dlevel = (curLevel - lastLevel) and 0x3

        if(curX == lastX && curY == lastY) {
            writeBits(1, 2)
            writeBits(dlevel, 2)
        } else if(abs(dx) <= 1 && abs(dy) <= 1) {
            val direction = when {
                dx == -1 && dy == -1 -> 0
                dx == 1 && dy == -1 -> 2
                dx == -1 && dy == 1 -> 5
                dx == 1 && dy == 1 -> 7
                dy == -1 -> 1
                dx == -1 -> 3
                dx == 1 -> 4
                else -> 6
            }
            writeBits(2, 2)
            writeBits(dlevel, 2)
            writeBits(direction, 3)
        } else {
            writeBits(3, 2)
            writeBits(dlevel, 2)
            writeBits(dx and 0xFF, 8)
            writeBits(dy and 0xFF, 8)
        }
    }

    private fun JagByteBuf.writeRequireUpdate() {
        writeBits(1, 1)
        writeBits(1, 1)
        writeBits(0, 2)
    }

    private fun JagByteBuf.writeSkipCount(count: Int) {
        writeBits(0, 1)
        when {
            count == 0 -> {
                writeBits(0, 2)
            }
            count < 32 -> {
                writeBits(1, 2)
                writeBits(count, 5)
            }
            count < 256 -> {
                writeBits(2, 2)
                writeBits(count, 8)
            }
            count < 2048 -> {
                writeBits(3, 2)
                writeBits(count, 11)
            }
        }
    }

    private fun JagByteBuf.writeAddLocalPlayer(player: Player, lastTile: Int = -1, curTile: Int = -1) {
        writeBits(1, 1)
        writeBits(0, 2)
        writeBits(if(lastTile != -1) 1 else 0, 1)
        if(lastTile != -1) {
            writeTileChange(lastTile, curTile)
        }
        writeBits(player.tile.x and 0x1FFF, 13)
        writeBits(player.tile.y and 0x1FFF, 13)
        writeBits(1, 1)
    }

    private fun JagByteBuf.writePlayerUpdate(player: Player, isNewPlayer: Boolean) {
        var mask = 0

        val updateFlags = sortedSetOf<PlayerUpdateFlag>()
        updateFlags.addAll(player.updateFlags)

        if(isNewPlayer) {
            updateFlags.add(PlayerUpdateFlag.APPEARANCE)
        }

        updateFlags.forEach { update ->
            mask = mask or update.mask
        }

        val excessFlag1 = 0x4
        val excessFlag2 = 0x4000

        if((mask and 0xFF.inv()) != 0) {
            mask = mask or excessFlag1
        }

        if((mask and 0xFFFF.inv()) != 0) {
            mask = mask or excessFlag2
        }

        writeByte(mask and 0xFF)
        if((mask and excessFlag1) != 0) writeByte(mask ushr 8)
        if((mask and excessFlag2) != 0) writeByte(mask ushr 16)

        updateFlags.forEach { updateFlag ->
            updateFlag.encode(this, player)
        }
    }

    private fun Player.shouldRemove(other: Player): Boolean {
        return other.invisible || !other.isOnline() || !tile.isWithinRadius(other.tile, Player.RENDER_DISTANCE)
    }

    private fun Player.shouldAdd(other: Player): Boolean {
        return this != other && !other.invisible && tile.isWithinRadius(other.tile, Player.RENDER_DISTANCE)
    }

    companion object {
        private const val MAX_NEW_PLAYERS_TO_DRAW = 50
        private const val MAX_PLAYERS_TO_DRAW = 200
    }
}