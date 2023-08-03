package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session

class LoginProtocol(session: Session) : Protocol(session) {

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        println("Login")
    }
}