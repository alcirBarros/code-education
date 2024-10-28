package ktor.com.br.config.aws

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import ktor.com.br.config.aws.MessageVisibilityStrategy.DEFAULT
import ktor.com.br.config.aws.MessageVisibilityStrategy.HEARTBEAT
import ktor.com.br.config.aws.processor.AwsSqsProcessor
import ktor.com.br.config.aws.processor.impl.DefaultSqsProcessor
import ktor.com.br.config.aws.processor.impl.HeartBeatSqsProcessor
import ktor.com.br.events.EventName
import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest
import software.amazon.awssdk.services.sqs.model.Message
import software.amazon.awssdk.services.sqs.model.ReceiveMessageRequest

class AwsSqsConsumer {
    //    private val logger = KotlinLogging.logger { }
    private val consumers = mutableListOf<Job>()
    private val consumerConfigs = mutableListOf<Map<String, Any>>()

    fun start() {
        consumers.forEach {
            it.start()
        }
    }

    suspend fun stop() {
        consumers.forEach {
            if (it.isActive) it.cancelAndJoin()
        }
    }

    fun logConfigs() {
        consumerConfigs.forEach { config ->
            //    logger.info { config }
        }
    }

    fun subscribe(
        client: SqsClient,
        queueDescription: String,
        queueName: String,
        enabled: Boolean,
        eventType: EventName,
        messageVisibilityConfig: MessageVisibilityConfig,
        process: suspend (message: Message) -> Unit
    ) {
        subscribe(
            client = client,
            queueDescription = queueDescription,
            queueName = queueName,
            enabled = enabled,
            eventType = arrayOf(eventType),
            messageVisibilityConfig = messageVisibilityConfig,
            process = process
        )
    }

    fun subscribe(
        client: SqsClient,
        queueDescription: String,
        queueName: String,
        enabled: Boolean,
        eventType: Array<EventName>,
        messageVisibilityConfig: MessageVisibilityConfig,
        process: suspend (message: Message) -> Unit
    ) {
        consumerConfigs.add(
            mapOf(
                "queue" to queueName,
                "description" to queueDescription,
                "enabled" to enabled,
                "eventType" to if (eventType.isNotEmpty()) eventType.toSet() else "ALL",
                "messageVisibility" to messageVisibilityConfig.strategy
            )
        )

        if (!enabled) return
        val queueUrl = client.getQueueUrl(GetQueueUrlRequest.builder().queueName(queueName).build()).queueUrl()

        val messageRequest = ReceiveMessageRequest.builder()
            .queueUrl(queueUrl)
            .waitTimeSeconds(5)
            .maxNumberOfMessages(1)
            .build()

        val processor = buildSqsProcessor(
            messageVisibilityConfig = messageVisibilityConfig,
            client = client,
            queueUrl = queueUrl,
            eventType = eventType,
            process = process
        )

        val consumer = GlobalScope.launch(start = CoroutineStart.LAZY) {
            while (isActive) {
                receiveMessages(client = client, messageRequest = messageRequest) { message ->
                    processor.processMessage(message)
                }
                delay(100)
            }
        }
        consumers.add(consumer)
    }

    private fun buildSqsProcessor(
        client: SqsClient,
        messageVisibilityConfig: MessageVisibilityConfig,
        queueUrl: String,
        eventType: Array<EventName>,
        process: suspend (message: Message) -> Unit
    ): AwsSqsProcessor {
        return when (messageVisibilityConfig.strategy) {
            DEFAULT -> DefaultSqsProcessor(
                client = client,
                process = process,
                queueUrl = queueUrl,
                eventType = eventType
            )
            HEARTBEAT -> HeartBeatSqsProcessor(
                client = client,
                process = process,
                queueUrl = queueUrl,
                eventType = eventType,
                heartBeat = messageVisibilityConfig.heartbeat ?: 60
            )
            else -> throw UnsupportedOperationException("")
        }
    }

    private suspend fun receiveMessages(
        client: SqsClient,
        messageRequest: ReceiveMessageRequest,
        process: suspend (message: Message) -> Unit
    ) {
        runCatching {
            val messages = client.receiveMessage(messageRequest).messages()
            messages.forEach { message ->
                runBlocking {
                    process(message)
                }
            }
        }.getOrElse { e ->
            //    logger.error { "receiveMessages: ${e.message}" }
        }
    }
}

fun sqsSubscribe(configuration: AwsSqsConsumer.() -> Unit) {
    val consumer = AwsSqsConsumer()
    consumer.configuration()
    consumer.logConfigs()
    consumer.start()
}

data class MessageVisibilityConfig(
    val strategy: MessageVisibilityStrategy,
    val timeout: String?,
    val heartbeat: Int?
)

enum class MessageVisibilityStrategy {
    DEFAULT, TIMEOUT, HEARTBEAT
}
