@file:Suppress("UNCHECKED_CAST")

package io.rsbox.server.engine.net.game

import io.github.classgraph.ClassGraph
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass
import kotlin.reflect.full.companionObjectInstance

object GamePackets {

    val clientPackets = PacketRegistry()
    val serverPackets = PacketRegistry()

    fun load() {
        Logger.info("Loading game engine packets.")
        loadClientPackets()
        loadServerPackets()
    }

    private fun loadClientPackets() {
        ClassGraph()
            .enableAnnotationInfo()
            .acceptPackagesNonRecursive("io.rsbox.server.engine.net.game.packet.client")
            .scan().also { res ->
                res.getClassesImplementing(Packet::class.qualifiedName).forEach { cls ->
                    val annotation = cls.annotationInfo.firstOrNull { it.name == ClientPacket::class.qualifiedName }?.let { it.loadClassAndInstantiate() as ClientPacket } ?: return@forEach
                    val opcode = annotation.opcode
                    val length = annotation.length
                    val packet = cls.loadClass().kotlin as KClass<Packet>
                    val codec = packet.companionObjectInstance as Codec<Packet>
                    clientPackets.register(packet, opcode, codec, length)
                }
            }

        Logger.info("Registered ${clientPackets.size} client packets.")
    }

    private fun loadServerPackets() {
        ClassGraph()
            .enableAnnotationInfo()
            .acceptPackagesNonRecursive("io.rsbox.server.engine.net.game.packet.server")
            .scan().also { res ->
                res.getClassesImplementing(Packet::class.qualifiedName).forEach { cls ->
                    val annotation = cls.annotationInfo.firstOrNull { it.name == ServerPacket::class.qualifiedName }?.let { it.loadClassAndInstantiate() as ServerPacket } ?: return@forEach
                    val opcode = annotation.opcode
                    val type = annotation.type
                    val packet = cls.loadClass().kotlin as KClass<Packet>
                    val codec = packet.companionObjectInstance as Codec<Packet>
                    val length = type.length
                    serverPackets.register(packet, opcode, codec, length)
                }
            }

        Logger.info("Registered ${serverPackets.size} server packets.")
    }
    
    internal val CLIENT_PACKET_LENGTHS = mapOf(
        45 to 7,
        6 to 8,
        2 to 0,
        54 to 0,
        47 to 8,
        91 to 4,
        67 to 7,
        8 to 11,
        9 to 7,
        57 to -1,
        51 to -1,
        12 to 6,
        14 to -1,
        15 to 16,
        18 to 13,
        94 to -1,
        13 to -1,
        20 to -1,
        70 to 3,
        22 to 8,
        23 to -1,
        24 to 8,
        25 to 2,
        85 to -1,
        27 to 5,
        28 to 0,
        29 to -1,
        1 to 7,
        31 to 3,
        32 to 8,
        33 to 10,
        34 to 8,
        35 to 15,
        52 to 8,
        37 to 7,
        39 to 15,
        40 to 3,
        41 to 2,
        16 to 6,
        44 to -1,
        64 to 3,
        62 to -1,
        10 to 4,
        48 to -1,
        7 to 1,
        50 to 4,
        42 to 7,
        38 to -1,
        53 to 7,
        66 to -2,
        55 to 3,
        84 to 8,
        56 to 3,
        58 to 7,
        59 to 7,
        60 to -1,
        61 to 3,
        36 to 15,
        49 to 11,
        65 to 4,
        19 to -2,
        11 to 3,
        68 to 6,
        30 to 3,
        4 to 9,
        71 to 2,
        72 to 7,
        73 to -1,
        21 to -1,
        75 to -1,
        76 to 3,
        26 to -1,
        78 to 0,
        79 to 3,
        80 to 3,
        81 to 0,
        82 to 8,
        83 to 8,
        69 to 11,
        0 to -1,
        86 to 3,
        87 to 4,
        88 to 16,
        89 to 15,
        90 to 11,
        74 to 22,
        46 to -2,
        93 to -1,
        77 to 3,
        95 to 2,
        5 to 4,
        3 to -1,
        17 to 2,
        63 to -1,
        43 to 7,
        92 to 2
    )
}