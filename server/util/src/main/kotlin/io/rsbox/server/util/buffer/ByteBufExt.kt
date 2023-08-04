@file:Suppress("NO_TAIL_CALLS_FOUND")

package io.rsbox.server.util.buffer

import io.netty.buffer.ByteBuf
import io.netty.util.ByteProcessor
import java.io.IOException
import java.nio.charset.Charset

fun ByteBuf.discard(amount: Int, writeMode: Boolean = false, readMode: Boolean = false) {
    if(writeMode) {
        val offset = writerIndex()
        writerIndex(offset + amount)
    }

    if(readMode) {
        val offset = readerIndex()
        readerIndex(offset + amount)
    }
}

val Charsets.CP_1252: Charset get() = WINDOWS_1252
val Charsets.WINDOWS_1252: Charset by lazy { Charset.forName("windows-1252") }
val Charsets.CESU_8: Charset by lazy { Charset.forName("CESU-8") }

fun ByteBuf.readString(charset: Charset = Charsets.CP_1252): String {
    val end = forEachByte(ByteProcessor.FIND_NUL)
    if(end == -1) throw IOException("String does not terminate.")
    val value = toString(readerIndex(), end - readerIndex(), charset)
    readerIndex(end + 1)
    return value
}

fun ByteBuf.readJagString(charset: Charset = Charsets.CP_1252): String {
    val version = readUnsignedByte().toInt()
    if(version != 0) throw IOException("String does not have 0 version.")
    return readString(charset)
}

fun ByteBuf.writeString(value: String, charset: Charset = Charsets.CP_1252): ByteBuf {
    writeCharSequence(value, charset)
    writeByte(0)
    return this
}

fun ByteBuf.writeJagString(value: String, charset: Charset = Charsets.CP_1252): ByteBuf {
    writeByte(0)
    writeString(value, charset)
    return this
}

tailrec fun ByteBuf.readIncrSmallSmart(increment: Int = readUnsignedShortSmart(), offset: Int = 0): Int {
    if(increment != Short.MAX_VALUE.toInt()) return offset + increment
    return readIncrSmallSmart(offset = offset + Short.MAX_VALUE)
}

fun ByteBuf.readIncrUnsignedShortSmart(): Int {
    var value = 0
    var curr = readUnsignedShortSmart()
    while (curr == 0x7FFF) {
        value += curr
        curr = readUnsignedShortSmart()
    }
    value += curr
    return value
}

fun ByteBuf.readUnsignedShortSmart(): Int {
    val peek = getUnsignedByte(readerIndex()).toInt()
    return if ((peek and 0x80) == 0) {
        readUnsignedByte().toInt()
    } else {
        readUnsignedShort() and 0x7FFF
    }
}

fun ByteBuf.writeUnsignedShortSmart(v: Int): ByteBuf {
    when (v) {
        in 0..0x7F -> writeByte(v)
        in 0..0x7FFF -> writeShort(0x8000 or v)
        else -> throw IllegalArgumentException()
    }

    return this
}