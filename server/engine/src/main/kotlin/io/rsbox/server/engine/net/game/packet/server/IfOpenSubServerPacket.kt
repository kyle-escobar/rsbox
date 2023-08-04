package io.rsbox.server.engine.net.game.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ServerPacket(opcode = 59, type = PacketType.FIXED)
data class IfOpenSubServerPacket(
    val component: Int,
    val interfaceId: Int,
    val type: Int
) : Packet {
    companion object : Codec<IfOpenSubServerPacket> {
        override fun encode(session: Session, packet: IfOpenSubServerPacket, out: JagByteBuf) {
            out.writeInt(packet.component)
            out.writeByte(packet.type)
            out.writeShort(packet.interfaceId, endian = LITTLE, transform = ADD)
        }
    }
}