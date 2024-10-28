package br.com.routing

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import java.util.UUID
import org.kodein.di.ktor.DIFeature

fun Application.customerRoutes(di: DIFeature) {
    routing() {
        httpStatusCodeOk()
        createCustomerRoute()
        orderByIdRoute()
        createOrder()
        runtimeException()
    }
}

fun Route.httpStatusCodeOk() {
    get("/customer/{id}") {
        val randomUUID = UUID.randomUUID()
        val authorizationHeader = call.request.headers["Authorization"]
        val s = call.parameters["id"]!!
        call.respond(HttpStatusCode.OK, s)
    }
}

fun Route.createCustomerRoute() {
    post("/customer") {
        val person = call.receive<Any>()
    }
}

fun Route.runtimeException() {
    get("/runtimeexception") {
        throw RuntimeException()
    }
}

fun Route.orderByIdRoute() {
    get("/order/{id}") {
    }
}

fun Route.createOrder() {
    post("/order") {
    }
}
