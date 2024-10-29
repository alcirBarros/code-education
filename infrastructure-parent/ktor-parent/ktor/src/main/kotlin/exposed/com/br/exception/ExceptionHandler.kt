package exposed.com.br.exception

import io.ktor.application.call
import io.ktor.features.StatusPages
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import java.util.stream.Collectors

fun StatusPages.Configuration.exceptionHandler() {

    fun errorList(ex: BindException): List<ErrorObject> {
        return ex.bindingResult.stream().map { error: FieldError ->
            ErrorObject(error.field, error.message)
        }.collect(Collectors.toList())
    }

    exception<Exception> { ex ->
        val httpStatus = HttpStatusCode.BadRequest
        val statusCode = httpStatus.value.toString()
        val statusDescription = httpStatus.description
        val errorList = listOf(ErrorObject(null, ex.message))
        val validationError = ValidationError(statusCode, statusDescription, errorList)
        call.respond(httpStatus, validationError)
    }

    exception<BindException> { ex ->
        val httpStatus = HttpStatusCode.BadRequest
        val statusCode = httpStatus.value.toString()
        val statusDescription = httpStatus.description
        val errorList = errorList(ex)
        val validationError = ValidationError(statusCode, statusDescription, errorList)
        call.respond(httpStatus, validationError)
    }
}
