package ktor.com.br.config.aws.processor.impl

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import ktor.com.br.config.aws.extension.getMessageAsJSON
import ktor.com.br.events.EventName
import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.Message
import software.amazon.awssdk.services.sqs.model.MessageSystemAttributeName

open class BaseSqsProcessor(
    val client: SqsClient,
    val queueUrl: String,
    private val eventType: Array<EventName> = emptyArray(),
    val process: suspend (message: Message) -> Unit
) {
    companion object {
        const val MESSAGE_ID = "messageId"
        const val MESSAGE_BODY = "messageBody"
        const val STATUS = "status"
        const val ATTEMPT = "attempt"
        const val ERROR = "error"
        const val QUEUE = "queue"
    }

    private fun filterMessage(eventType: Array<EventName> = emptyArray(), message: Message): Boolean {
        val messageJSON = message.getMessageAsJSON()

        val json = Parser.default().parse(StringBuilder(messageJSON)) as JsonObject

        val eventNameNormal = json.string("name")
        val eventNameLegacy = if (eventNameNormal.isNullOrBlank()) json.obj("body")?.string("name") else null

        val eventName = eventNameNormal ?: eventNameLegacy

        return eventName?.let {
            eventType.any { event ->
                eventName == event.name
            }
        } ?: false
    }

    private fun deleteMessage(
        client: SqsClient,
        queueUrl: String,
        message: Message
    ) {
        client.deleteMessage { req ->
            req.queueUrl(queueUrl)
            req.receiptHandle(message.receiptHandle())
        }
    }

    private fun logAttempt(messageId: String, message: Message) {
        val attempt = message.attributes()[MessageSystemAttributeName.APPROXIMATE_RECEIVE_COUNT]

        attempt?.let {
//            logger.info {
//                mapOf(
//                    MESSAGE_ID to messageId,
//                    ATTEMPT to it
//                )
//            }
        }
    }

    private fun logSuccess(messageId: String, message: Message) {
//        logger.info {
//            mapOf(
//                QUEUE to queueUrl,
//                MESSAGE_ID to messageId,
//                STATUS to "PROCESSED",
//                MESSAGE_BODY to message.body()
//            )
//        }
    }

    private fun logError(messageId: String, message: Message, error: String?) {
//        logger.error {
//            mapOf(
//                MESSAGE_ID to messageId,
//                STATUS to "PROCESSING_FAILURE",
//                ERROR to (error ?: ""),
//                MESSAGE_BODY to message.body()
//            )
//        }
    }

    suspend fun processMessageWithLogs(
        message: Message,
        beforeDeleteMessage: suspend (message: Message) -> Unit = {},
        onFail: suspend (message: Message) -> Unit = {}
    ) {
        val messageId = message.messageId()
        runCatching {
            val canProcess = filterMessage(eventType = eventType, message = message)
            if (canProcess) {
                logAttempt(messageId, message)

                process(message)

                logSuccess(messageId, message)
            }

            beforeDeleteMessage(message)

            deleteMessage(client, queueUrl, message)
        }.getOrElse { e ->
            logError(messageId, message, e.message)
            onFail(message)
        }
    }
}
