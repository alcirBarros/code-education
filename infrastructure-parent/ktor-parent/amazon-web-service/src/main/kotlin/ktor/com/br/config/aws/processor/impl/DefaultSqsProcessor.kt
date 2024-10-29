package ktor.com.br.config.aws.processor.impl

import ktor.com.br.config.aws.processor.AwsSqsProcessor
import ktor.com.br.events.EventName
import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.Message

class DefaultSqsProcessor(
    client: SqsClient,
    queueUrl: String,
    eventType: Array<EventName> = emptyArray(),
    process: suspend (message: Message) -> Unit
) : AwsSqsProcessor, BaseSqsProcessor(client, queueUrl, eventType, process) {

    override suspend fun processMessage(message: Message) {
        processMessageWithLogs(message = message)
    }
}
