package ktor.com.br.plugins

import io.ktor.application.Application
import ktor.com.br.module.controllerModule
import ktor.com.br.module.injectionModule
import ktor.com.br.module.installModule
import ktor.com.br.module.requestModule

fun Application.configureRouting() {
    installModule()
    injectionModule()
    //  serviceModule()
    controllerModule()
    requestModule()
}
