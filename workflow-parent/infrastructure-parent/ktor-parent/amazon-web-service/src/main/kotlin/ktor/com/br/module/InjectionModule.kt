package ktor.com.br.module

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.config.ApplicationConfig
import io.ktor.config.HoconApplicationConfig
import ktor.com.br.config.aws.AwsSqsConsumer
import ktor.com.br.config.aws.aws
import ktor.com.br.service.CardService
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.ktor.di
import org.kodein.di.provider
import org.kodein.di.singleton
import java.security.SecureRandom
import java.util.Random

fun Application.injectionModule() {
    di {
        bind { singleton { SecureRandom() } }
        bind<Random>(tag = "Random2") with provider { SecureRandom() }

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

        importOnce(aws)

        bind<CardService>() with singleton { CardService(instance("cardTopicProperties"), instance()) }
    }
}

fun sqsSubscribe(configuration: AwsSqsConsumer.() -> Unit): AwsSqsConsumer {
    val consumer = AwsSqsConsumer()
    //  consumer.configuration()
    consumer.logConfigs()
    consumer.start()
    return consumer
}
