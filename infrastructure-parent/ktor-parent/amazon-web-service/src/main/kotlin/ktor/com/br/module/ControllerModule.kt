package ktor.com.br.module

import io.ktor.application.Application
import io.ktor.routing.routing
import ktor.com.br.controller.controller

fun Application.controllerModule() {
    routing {
        controller()
    }
}
