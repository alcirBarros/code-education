package br.com.exception

import io.ktor.application.call
import io.ktor.features.StatusPages
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.TextContent
import io.ktor.http.withCharset
import io.ktor.response.respond
import java.lang.Exception

fun StatusPages.Configuration.handleException() {

    exception<Throwable> { cause ->
        call.respond(HttpStatusCode.InternalServerError)
        val statusCode = HttpStatusCode.InternalServerError
        val result = mapOf(
            "status" to statusCode.value,
            "details" to cause.message
        )
        call.respond(statusCode, result)
    }

    exception<NotImplementedError> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    status(HttpStatusCode.NotFound) { it: HttpStatusCode ->
        val withCharset = ContentType.Text.Plain.withCharset(Charsets.UTF_8)
        call.respond(TextContent("${it.value} ${it.description}", withCharset, it))
    }

    exception<Exception> {
        val statusCode = HttpStatusCode.InternalServerError
        val result = mapOf(
            "status" to statusCode.value,
            "cause" to it.cause,
            "message" to it.localizedMessage,
            "stackTrace" to it.stackTraceToString()
        )
        call.respond(statusCode, result)
    }
}
