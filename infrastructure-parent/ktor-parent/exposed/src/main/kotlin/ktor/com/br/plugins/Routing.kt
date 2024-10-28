package ktor.com.br.plugins

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.config.ApplicationConfig
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import ktor.com.br.config.DatabaseConst
import ktor.com.br.config.datasourceJDBC
import ktor.com.br.config.datasourceJDBCProperties
import ktor.com.br.repository.CardRepository
import ktor.com.br.repository.CardTable
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.ktor.closestDI
import org.kodein.di.ktor.di
import org.kodein.di.singleton
import java.security.SecureRandom
import java.util.Random
import java.util.UUID
import javax.sql.DataSource

fun Application.configureRouting() {

    install(ContentNegotiation) {
        jackson()
    }

    di {
        bind<Random> { singleton { SecureRandom() } }

        val profileActive = System.getenv("KTOR_PROFILE") ?: "local"

        val profileConfig = ConfigFactory.parseResources("application-$profileActive.conf")
        val defaultConfig = ConfigFactory.parseResources("application.conf")

        bind<Config>() with singleton {
            return@singleton ConfigFactory.load(profileConfig)
                .withFallback(defaultConfig)
                .resolve()
        }
        bind<ApplicationConfig>() with singleton { HoconApplicationConfig(instance()) }

        bind(DatabaseConst.databaseRwProperties) from singleton {
            datasourceJDBCProperties(instance(), DatabaseConst.sourceRw)
        }

        bind(DatabaseConst.dataSourceRw) from singleton {
            datasourceJDBC(instance(DatabaseConst.databaseRwProperties))
        }

        bind(DatabaseConst.databaseRw) from singleton {
            Database.connect(instance(DatabaseConst.dataSourceRw) as DataSource)
        }

        bind<CardRepository>() with singleton {
            SchemaUtils.create(CardTable)

            CardRepository(instance(DatabaseConst.databaseRw))
        }
    }

    routing {

        get("/") {
            val random by closestDI().instance<Random>()
            val range = 0 until 100
            call.respondText("Random number in $range: ${random[range]}")
        }

        get("/repository") {
            val cardRepository by closestDI().instance<CardRepository>()

            val findById = cardRepository.findById(UUID.fromString("a3a6feba-307f-4559-8d75-469dff434e3a"))

            call.respond(findById)
        }
    }
}

operator fun Random.get(range: IntRange): Int {
    val i = range.last - range.first
    return range.first + this.nextInt(i)
}
