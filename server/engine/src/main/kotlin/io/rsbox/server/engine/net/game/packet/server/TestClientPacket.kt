package io.rsbox.server.engine.net.game.packet.server

import io.rsbox.server.engine.net.game.Codec
import io.rsbox.server.engine.net.game.Packet
import io.rsbox.server.engine.net.game.PacketType
import io.rsbox.server.engine.net.game.ServerPacket

@ServerPacket(opcode = 10, type = PacketType.FIXED)
class TestClientPacket : Packet {
    companion object : Codec<TestClientPacket> {

    }
}