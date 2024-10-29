package ktor.com.br.config.aws.event

import java.time.Instant

abstract class SnsEvent(
    val version: String = "2019-07-09",
    val source: String = "ife-ifoodoffice-card-service",
    val createdAt: Instant = Instant.now(),
    open val topic: String,
    open val name: String,
    open val contents: Any
)
