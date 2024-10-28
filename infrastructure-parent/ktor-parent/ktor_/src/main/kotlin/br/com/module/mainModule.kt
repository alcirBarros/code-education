package br.com.module

import br.com.exception.handleException
import br.com.module.router.loginRouting
import br.com.routing.customerRoutes
import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.features.DataConversion
import io.ktor.features.StatusPages
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import io.ktor.util.DataConversionException
import org.kodein.di.bind
import org.kodein.di.ktor.di
import org.kodein.di.singleton
import java.security.SecureRandom
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Random

fun Application.deployment() {
    di {
        bind<Random>() with singleton { SecureRandom() }
    }

    install(DataConversion) {
        convert<LocalDate> {
            val format = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            decode { values, _ ->
                values.singleOrNull()?.let { LocalDate.parse(it, format) }
            }
            encode { value ->
                when (value) {
                    null -> listOf()
                    is LocalDate -> listOf(value.format(format))
                    else -> throw DataConversionException("Cannot convert $value as Date")
                }
            }
        }
    }

    install(StatusPages) {
        handleException()
    }

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    routing {
        loginRouting()
    }
}

fun Application.mainModule() = customerRoutes(
    di {
        bind<Random>() with singleton { SecureRandom() }
    }
)
