package br.com.properties

import com.typesafe.config.ConfigFactory
import io.ktor.config.ApplicationConfig
import io.ktor.config.HoconApplicationConfig

fun createApplicationConfig(env: String? = null): ApplicationConfig {
    if (env.isNullOrBlank()) return HoconApplicationConfig(ConfigFactory.load().resolve())

    val envConfig = ConfigFactory.parseResources("application-$env.conf")
    val defaultConfig = ConfigFactory.parseResources("application.conf")

    return HoconApplicationConfig(ConfigFactory.load(envConfig).withFallback(defaultConfig).resolve())
}
