package ktor.com.br.config.aws

import ktor.com.br.config.aws.event.SnsEvent

interface AwsSnsPublisher {
    suspend fun sendMessage(event: SnsEvent): String

    //  suspend fun sendMessage(message: String, queue: String): String

    // suspend fun sendMessage(events: List<SnsEvent>): Map<SnsEvent, String>
}
