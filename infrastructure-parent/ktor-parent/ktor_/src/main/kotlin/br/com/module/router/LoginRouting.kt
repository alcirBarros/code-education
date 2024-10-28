package br.com.module.router

import br.com.module.TeamCreate
import br.com.module.TeamCreateImpl
import br.com.module.TeamReq
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import org.kodein.di.instance
import org.kodein.di.ktor.di
import java.lang.NullPointerException
import java.util.Random

private operator fun Random.get(range: IntRange): Int {
    val i = range.last - range.first
    return range.first + this.nextInt(i)
}

fun Route.loginRouting() {

    val random: Random by di().instance()

    get {
        val range = 0 until 100
        call.respondText("Random number in $range: ${random[range]}")
        call.respond(HttpStatusCode.OK)
    }

    get("/findAll/{id}") {
        val range = 0 until 100
        val id = call.parameters["id"]?.toIntOrNull()
        call.respondText("Param, number: $id")
    }

    get("/nullpointerexception") {
        throw NullPointerException()
    }

//    post {
//        val teamCreate: TeamCreate = TeamCreateImpl
//        val req = call.receive<TeamReq>()
//
//        val request = TeamCreate.Request(req)
//
//        val result = teamCreate.create(request)
//        when (result) {
//            is TeamCreate.Response.Failure -> {
//            }
//            is TeamCreate.Response.Success -> {
//                val dto = result.dto
//                call.respond(dto)
//            }
//        }
//    }
}
