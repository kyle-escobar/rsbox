package io.rsbox.server.engine.net.handshake

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session

class HandshakeProtocol(session: Session) : Protocol(session) {

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        when(HandshakeType.fromOpcode(buf.readUnsignedByte().toInt())) {
            HandshakeType.JS5 -> { println("js5") }
            else -> throw IllegalStateException("Invalid handshake type.")
        }
    }
}