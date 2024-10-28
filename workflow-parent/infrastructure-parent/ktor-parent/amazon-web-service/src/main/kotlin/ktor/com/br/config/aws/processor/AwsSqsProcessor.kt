package ktor.com.br.config.aws.processor

import software.amazon.awssdk.services.sqs.model.Message

interface AwsSqsProcessor {
    suspend fun processMessage(message: Message)
}
