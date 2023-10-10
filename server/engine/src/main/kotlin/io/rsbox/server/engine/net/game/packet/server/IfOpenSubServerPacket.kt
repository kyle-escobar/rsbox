package io.rsbox.server.engine.net.game.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE
import io.rsbox.server.util.buffer.NEG

@ServerPacket(opcode = 94, type = PacketType.FIXED)
data class IfOpenSubServerPacket(
    val component: Int,
    val interfaceId: Int,
    val type: Int
) : Packet {
    companion object : Codec<IfOpenSubServerPacket> {
        override fun encode(session: Session, packet: IfOpenSubServerPacket, out: JagByteBuf) {
            out.writeShort(packet.interfaceId, transform = ADD)
            out.writeByte(packet.type, transform = NEG)
            out.writeInt(packet.component, endian = LITTLE)
        }
    }
}