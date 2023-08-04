package io.rsbox.server.engine.model.entity

import io.rsbox.server.config.ServerConfig
import io.rsbox.server.engine.model.coord.Tile
import io.rsbox.server.engine.model.manager.GpiManager
import io.rsbox.server.engine.model.manager.InterfaceManager
import io.rsbox.server.engine.model.manager.SceneManager
import io.rsbox.server.engine.model.ui.DisplayMode
import io.rsbox.server.engine.net.Session
import io.rsbox.server.engine.net.login.LoginRequest
import org.tinylog.kotlin.Logger
import java.io.File

class Player internal constructor(val session: Session) : Entity() {

    init {
        session.player = this
    }

    /*
     * Player context Managers
     */
    val gpi = GpiManager(this)
    val scene = SceneManager(this)
    val ui = InterfaceManager(this)

    override val sizeX = 1
    override val sizeY = 1

    override var tile = Tile(ServerConfig.SPAWN_TILE.X, ServerConfig.SPAWN_TILE.Y, ServerConfig.SPAWN_TILE.LEVEL)
    override var prevTile = tile

    var username: String = ""
    var displayName: String = ""
    var passwordHash: String = ""
    var privilege = 3
    var isMember = true
    var displayMode = DisplayMode.RESIZABLE_MODERN

    override suspend fun cycle() {

    }

    private fun init() {
        gpi.init()
        scene.init()
        ui.init()
    }

    fun login() {
        Logger.info("[$username] has connected to the server.")
        this.init()
    }

    fun logout() {
        Logger.info("[$username] has disconnected from the server.")
        world.players.remove(this)
        session.ctx.disconnect()
    }

    override fun equals(other: Any?): Boolean {
        return other is Player && other.username == username && other.passwordHash == passwordHash
    }

    companion object {
        fun File.printFileName() {
            println(this.name)
        }

        fun create(request: LoginRequest): Player {
            val player = Player(request.session)
            player.username = request.username
            player.displayName = request.username
            player.passwordHash = request.password ?: ""

            player.session.xteas = request.xteas
            player.session.reconnectXteas = request.reconnectXteas
            player.session.encoderIsaac.init(IntArray(4) { player.session.xteas[it] + 50 })
            player.session.decoderIsaac.init(player.session.xteas)

            val f = File("test.txt")
            f.printFileName()

            return player
        }
    }
}