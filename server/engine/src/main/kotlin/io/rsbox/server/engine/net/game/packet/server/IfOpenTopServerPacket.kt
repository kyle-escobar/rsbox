package io.rsbox.server.engine.net.game.packet.server

import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket
import io.rsbox.server.util.buffer.ADD
import io.rsbox.server.util.buffer.JagByteBuf
import io.rsbox.server.util.buffer.LITTLE

@ServerPacket(opcode = 49, type = PacketType.FIXED)
data class IfOpenTopServerPacket(val interfaceId: Int) : Packet {
    companion object : Codec<IfOpenTopServerPacket> {
        override fun encode(session: Session, packet: IfOpenTopServerPacket, out: JagByteBuf) {
            out.writeShort(packet.interfaceId, transform = ADD)
        }
    }
}