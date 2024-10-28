package ktor.com.br.config.aws.processor.impl

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import ktor.com.br.config.aws.processor.AwsSqsProcessor
import ktor.com.br.events.EventName
import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.Message

class HeartBeatSqsProcessor(
    client: SqsClient,
    queueUrl: String,
    eventType: Array<EventName> = emptyArray(),
    private val heartBeat: Int = 60,
    process: suspend (message: Message) -> Unit
) : AwsSqsProcessor, BaseSqsProcessor(client, queueUrl, eventType, process) {

    override suspend fun processMessage(
        message: Message
    ) {
        val messageHeartBeat = messageHeartBeat(message)

        processMessageWithLogs(
            message = message,
            beforeDeleteMessage = {
                cancelMessageHearthBeat(messageHeartBeat)
            },
            onFail = {
                cancelMessageHearthBeat(messageHeartBeat)
                changeVisibility(it, 10)
            }
        )
    }

    private fun messageHeartBeat(
        message: Message
    ) = GlobalScope.launch {
        var count = heartBeat
        while (isActive) {
            count = when (count) {
                heartBeat -> {
                    changeVisibility(message, heartBeat.plus(5))
                    0
                }
                else -> count.plus(1)
            }
            delay(1000)
        }
    }

    private fun changeVisibility(
        message: Message,
        timeOut: Int
    ) {
        runCatching {
            client.changeMessageVisibility { req ->
                req.queueUrl(queueUrl)
                req.receiptHandle(message.receiptHandle())
                req.visibilityTimeout(timeOut)
            }
        }.getOrElse { e ->
            //    logger.warn { "[changeVisibility]: ${e.message}" }
        }
    }

    private suspend fun cancelMessageHearthBeat(heartBeat: Job) {
        heartBeat.cancel()
        while (heartBeat.isActive) {
            delay(1000)
        }
    }
}
