package io.rsbox.server.engine.net

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.rsbox.server.engine.net.handshake.HandshakeProtocol
import org.tinylog.kotlin.Logger
import java.util.concurrent.atomic.AtomicReference
import kotlin.random.Random
import kotlin.random.nextLong

class Session(val ctx: ChannelHandlerContext) {

    val channel get() = ctx.channel()

    val protocol = AtomicReference<Protocol>(null)

    var seed = Random.nextLong(0..Long.MAX_VALUE)
    var xteas = IntArray(4) { 0 }
    var reconnectXteas: IntArray? = null

    internal fun onConnect() {
        protocol.set(HandshakeProtocol(this))
    }

    internal fun onDisconnect() {}

    internal fun onMessage(msg: Message) {
        protocol.get().handle(msg)
    }

    internal fun onError(cause: Throwable) {
        if(cause.stackTrace.isEmpty() || (cause.stackTrace[0].methodName !in arrayOf("read0", "callDecode"))) {
            Logger.error(cause) { "An error occurred in session network thread. [Method: ${cause.stackTrace[0].methodName}]." }
            disconnect()
        }
    }

    fun disconnect() {
        if(channel.isActive) {
            ctx.close()
        }
    }

    fun write(buf: ByteBuf) = ctx.write(buf)
    fun write(msg: Message) = ctx.write(msg)
    fun writeAndFlush(buf: ByteBuf) = ctx.writeAndFlush(buf)
    fun writeAndFlush(msg: Message) = ctx.writeAndFlush(msg)

    fun flush() = ctx.flush()

    fun writeAndClose(msg: Message) {
        ctx.writeAndFlush(msg).addListener {
            if(it.isSuccess) {
                disconnect()
            }
        }
    }
}