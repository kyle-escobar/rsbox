package io.rsbox.server.engine.net.game.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.INVERSE_MIDDLE
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ServerPacket(opcode = 11, type = PacketType.FIXED)
data class IfMoveSubServerPacket(
    val fromParent: Int,
    val fromChild: Int,
    val toParent: Int,
    val toChild: Int
) : Packet {
    companion object : Codec<IfMoveSubServerPacket> {
        override fun encode(session: Session, packet: IfMoveSubServerPacket, out: JagByteBuf) {
            val fromComponent = (packet.fromParent shl 16) or packet.fromChild
            val toComponent = (packet.toParent shl 16) or packet.toChild
            out.writeInt(toComponent, endian = INVERSE_MIDDLE)
            out.writeInt(fromComponent, endian = LITTLE)
        }
    }
}