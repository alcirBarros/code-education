package ktor.com.br.controller

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import ktor.com.br.model.Card
import ktor.com.br.service.CardService
import org.kodein.di.DI
import org.kodein.di.instance
import org.kodein.di.ktor.closestDI
import java.util.Random
import java.util.UUID

fun Route.controller() {
    val cardService by closestDI().instance<CardService>()
    val random: Random by closestDI().instance<Random>()
    val kodeinInstances = mutableListOf<DI>()

    get("/") {
        val range = 0 until 100
        call.respondText("Random number in $range: ${random[range]}")
    }

    get("/repository") {
        val card = Card(UUID.randomUUID(), "Embossing Name")
        val id = cardService.sendCardCreatedEvent(card)
        call.respondText("Send message id: $id")
    }

    get("/di") {
        kodeinInstances.add(closestDI().baseDI)
        call.respondText(kodeinInstances.joinToString())
    }
}

private operator fun Random.get(range: IntRange): Int {
    val i = range.last - range.first
    return range.first + this.nextInt(i)
}
