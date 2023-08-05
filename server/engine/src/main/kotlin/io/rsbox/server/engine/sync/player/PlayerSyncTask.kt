package io.rsbox.server.engine.sync.player

import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.sync.SyncTask
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.toJagBuf

class PlayerSyncTask : SyncTask {

    private val world: World by inject()

    override suspend fun execute() {
        world.players.forEachEntry { player ->
            val buf = player.encodeSync()
        }
    }

    private fun Player.encodeSync() {
        val mainBuf = session.channel.alloc().buffer().toJagBuf()
        val maskBuf = session.channel.alloc().buffer().toJagBuf()

        /*
         * Sync players in both local and external resolutions
         */
        syncLocalPlayers(mainBuf, maskBuf)
        syncExternalPlayers(mainBuf, maskBuf)
    }

    private tailrec fun Player.syncLocalPlayers(
        buf: JagByteBuf,
        maskBuf: JagByteBuf,
        active: Boolean = true,
        index: Int = 0,
        skip: Int = -1
    ) {

    }

    private tailrec fun Player.syncExternalPlayers(
        buf: JagByteBuf,
        maskBuf: JagByteBuf,
        active: Boolean = true,
        index: Int = 0,
        skip: Int = -1
    ) {

    }

    private fun JagByteBuf.writeSkipCount(count: Int): Int {
        if(count == -1) return count
        writeBits(1, 0)
        when {
            count == 0 -> writeBits(2, 0)
            count < 32 -> {
                writeBits(2, 1)
                writeBits(5, count)
            }
        }
        return count
    }
}