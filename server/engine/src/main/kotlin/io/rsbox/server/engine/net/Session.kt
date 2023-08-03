package io.rsbox.server.engine.net

import io.netty.channel.ChannelHandlerContext

class Session(val ctx: ChannelHandlerContext) {

    val channel get() = ctx.channel()

}