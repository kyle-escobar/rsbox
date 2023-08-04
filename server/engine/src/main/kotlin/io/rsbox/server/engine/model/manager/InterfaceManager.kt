package io.rsbox.server.engine.model.manager

import io.rsbox.server.engine.model.entity.Player
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.model.ui.GameInterface
import io.rsbox.server.engine.model.ui.InterfaceType
import io.rsbox.server.engine.net.game.packet.server.IfMoveSubServerPacket
import io.rsbox.server.engine.net.game.packet.server.IfOpenSubServerPacket
import io.rsbox.server.engine.net.game.packet.server.IfOpenTopServerPacket

class InterfaceManager(private val player: Player) {

    private var currentDisplayMode = DisplayMode.RESIZABLE
    private val openInterfaces = hashMapOf<Int, Int>()
    private var openModal: Int = -1

    fun init() {
        openTopInterface(currentDisplayMode.interfaceId)
        GameInterface.values().forEach { gameInterface ->
            openGameInterface(gameInterface)
        }

        updateDisplayMode()
    }

    private fun open(parent: Int, child: Int, interfaceId: Int) {
        val component = (parent shl 16) or child
        if(openInterfaces.containsKey(component)) close(component)
        openInterfaces[component] = interfaceId
    }

    private fun close(component: Int) {
        openInterfaces.remove(component)
    }

    private fun openModal(parent: Int, child: Int, interfaceId: Int) {
        open(parent, child, interfaceId)
        openModal = interfaceId
    }

    fun openTopInterface(interfaceId: Int) {
        open(interfaceId, 0, interfaceId)
        player.session.write(IfOpenTopServerPacket(interfaceId))
    }

    fun openSubInterface(parent: Int, child: Int, interfaceId: Int, type: InterfaceType = InterfaceType.OVERLAY) {
        if(type == InterfaceType.MODAL) {
            openModal(parent, child, interfaceId)
        } else {
            open(parent, child, interfaceId)
        }
        val component = (parent shl 16) or child
        player.session.write(IfOpenSubServerPacket(component, interfaceId, type.id))
    }

    fun openSubInterface(parent: GameInterface, interfaceId: Int) {
        val child = parent.getEnumChildId(currentDisplayMode)
        openSubInterface(currentDisplayMode.interfaceId, child, interfaceId, InterfaceType.MODAL)
    }

    fun openGameInterface(gameInterface: GameInterface) {
        val parent = currentDisplayMode.interfaceId
        val child = gameInterface.getEnumChildId(currentDisplayMode)
        openSubInterface(parent, child, gameInterface.interfaceId, gameInterface.type)
    }

    fun updateDisplayMode() {
        openTopInterface(player.displayMode.interfaceId)
        openInterfaces.keys.forEach { component ->
            val fromParent = component shr 16
            val fromChild = component and 0xFFFF
            val toParent = player.displayMode.interfaceId
            val toChild = GameInterface.fromEnumChildId(fromChild, currentDisplayMode)?.getEnumChildId(player.displayMode)
            if(toChild != null) {
                player.session.write(IfMoveSubServerPacket(fromParent, fromChild, toParent, toChild))
            }
        }
        currentDisplayMode = player.displayMode
    }
}