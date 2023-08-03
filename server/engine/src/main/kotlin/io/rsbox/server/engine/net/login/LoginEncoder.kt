package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Session

class LoginEncoder(private val session: Session) {

    fun encode(msg: Message, out: ByteBuf) {

    }

}