package exposed.com.br.plugins

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import exposed.com.br.exception.BindException
import exposed.com.br.exception.FieldError
import exposed.com.br.exception.exceptionHandler
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.config.ApplicationConfig
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.ContentNegotiation
import io.ktor.features.StatusPages
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.defaultResource
import io.ktor.http.content.static
import io.ktor.jackson.jackson
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.ktor.closestDI
import org.kodein.di.ktor.di
import org.kodein.di.singleton
import java.security.SecureRandom
import java.util.Random

fun Application.configureRouting() {

    install(ContentNegotiation) {
        jackson()
    }

    install(StatusPages) {

        exception<Throwable> {
            call.respond(
                status = HttpStatusCode.InternalServerError,
                message = it
            )
        }

        exceptionHandler()
    }

    di {
        bind<Random> { singleton { SecureRandom() } }

        val profileActive = System.getenv("KTOR_PROFILE") ?: "local"

        val profileConfig = ConfigFactory.parseResources("application-$profileActive.conf")
        val defaultConfig = ConfigFactory.parseResources("application.conf")

        bind<Config>() with singleton {
            val conf = ConfigFactory.load(profileConfig)
                .withFallback(defaultConfig)
                .resolve()
            conf
        }
        bind<ApplicationConfig>() with singleton { HoconApplicationConfig(instance()) }
    }

    routing {

        static {
            defaultResource("index.html")
        }

        get("/") {
            val random by closestDI().instance<Random>()
            val range = 0 until 100
            call.respondText("Random number in $range: ${random[range]}")
        }

        get("/NullPointerException") {
            val mutableListOf = mutableListOf<FieldError>()
            mutableListOf.add(FieldError("Field", "message"))
            throw BindException(mutableListOf.toList())
        }
    }
}

operator fun Random.get(range: IntRange): Int {
    val i = range.last - range.first
    return range.first + this.nextInt(i)
}
