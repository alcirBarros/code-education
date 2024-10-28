package ktor.com.br.module

import io.ktor.application.Application
import ktor.com.br.service.CardService
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.ktor.di
import org.kodein.di.singleton

fun Application.serviceModule() {
    di {
        bind<CardService>() with singleton { CardService(instance(), instance()) }
    }
}
