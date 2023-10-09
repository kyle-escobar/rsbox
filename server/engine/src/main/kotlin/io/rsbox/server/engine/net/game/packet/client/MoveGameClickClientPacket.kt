package io.rsbox.server.engine.net.game.packet.client

import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.ClientPacket
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.sync.update.PlayerUpdateFlag
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ClientPacket(opcode = 93, type = PacketType.VARIABLE_BYTE)
class MoveGameClickClientPacket(val tile: Tile, val clickType: Int) : Packet {

    override fun handle(session: Session) {
        val player = session.player
        player.moveTo(tile)
    }

    companion object : Codec<MoveGameClickClientPacket> {
        override fun decode(session: Session, buf: JagByteBuf): MoveGameClickClientPacket {
            val tileX = buf.readUnsignedShort()
            val clickType = buf.readByte(transform = ADD).toInt()
            val tileY = buf.readUnsignedShort(endian = LITTLE)
            val tile = Tile(tileX, tileY, session.player.tile.level)
            return MoveGameClickClientPacket(tile, clickType)
        }
    }
}