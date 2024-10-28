package br.com.routing

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import org.kodein.di.instance
import org.kodein.di.ktor.di
import java.util.Random

fun Route.benefitsRoutes() {

    val random by di().instance<Random>()

    get("/") {
        val range = 0 until 100
        call.respondText("Random number in $range: $random[range]")
    }

    get("/benefits") {
        val message: String = "Funcionou"
        call.respond(HttpStatusCode.OK, message)
    }
}
