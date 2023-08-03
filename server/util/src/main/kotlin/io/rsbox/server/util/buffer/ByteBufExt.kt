package io.rsbox.server.util.buffer

import io.netty.buffer.ByteBuf
import io.netty.util.ByteProcessor
import java.io.IOException
import java.nio.charset.Charset

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
