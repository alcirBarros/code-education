package ktor.com.br

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import ktor.com.br.plugins.configureRouting

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080) {
        configureRouting()
    }.start(true)
}
