package io.rsbox.server.engine.net.login

import io.netty.buffer.ByteBuf
import io.rsbox.server.common.inject
import io.rsbox.server.engine.model.World
import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.net.Message
import io.rsbox.server.engine.net.Protocol
import io.rsbox.server.engine.net.Session

class LoginProtocol(session: Session) : Protocol(session) {

    private val world: World by inject()

    private val encoder = LoginEncoder(session)
    private val decoder = LoginDecoder(session)

    override fun encode(msg: Message, out: ByteBuf) = encoder.encode(msg, out)
    override fun decode(buf: ByteBuf, out: MutableList<Any>) = decoder.decode(buf, out)

    override fun handle(msg: Message) {
        if(msg !is LoginRequest) return

        val player = Player.create(msg)

        world.players.add(player)
        player.login()
    }
}