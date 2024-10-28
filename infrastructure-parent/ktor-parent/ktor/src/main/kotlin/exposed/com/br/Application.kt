package exposed.com.br

import exposed.com.br.plugins.configureRouting
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080) {
        configureRouting()
    }.start(true)
}
