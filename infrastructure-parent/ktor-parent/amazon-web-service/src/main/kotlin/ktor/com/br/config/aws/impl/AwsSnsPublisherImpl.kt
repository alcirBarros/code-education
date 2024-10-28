package ktor.com.br.config.aws.impl

import ktor.com.br.config.aws.AwsSnsPublisher
import ktor.com.br.config.aws.event.SnsEvent
import ktor.com.br.config.aws.extension.toJson
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sns.SnsClient
import software.amazon.awssdk.services.sns.model.MessageAttributeValue
import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest

class AwsSnsPublisherImpl(
    val snsClient: SnsClient,
    val sqsClient: SqsClient,
    private val accountId: String,
    private val region: Region
) : AwsSnsPublisher {

    private fun getTopicArn(topicName: String): String = "arn:aws:sns:$region:$accountId:$topicName"

    private fun getAttributes(event: SnsEvent): Map<String, MessageAttributeValue> {
        val messageAttributes = mutableMapOf<String, MessageAttributeValue>()
        messageAttributes["version"] = MessageAttributeValue.builder().dataType("String").stringValue(event.version).build()
        messageAttributes["source"] = MessageAttributeValue.builder().dataType("String").stringValue(event.source).build()
        messageAttributes["createdAt"] = MessageAttributeValue.builder().dataType("String").stringValue(event.createdAt.toString()).build()
        messageAttributes["name"] = MessageAttributeValue.builder().dataType("String").stringValue(event.name).build()
        return messageAttributes
    }

    override suspend fun sendMessage(event: SnsEvent): String {
        val message = event.toJson()
        val attributes = getAttributes(event)
        val topicArn = getTopicArn(event.topic)

        val response = snsClient.publish { request ->
            request
                .topicArn(topicArn)
                .messageAttributes(attributes)
                .message(message)
                .build()
        }

        val messageId = response.messageId()

        return messageId
    }

//    override suspend fun sendMessage(message: String, queue: String): String {
//        val response = sqsClient.sendMessage { request ->
//            request
//                .queueUrl(getQueueUrl(queue))
//                .messageBody(message)
//                .build()
//        }
//
//        return response.messageId()
//    }

//    override suspend fun sendMessage(events: List<SnsEvent>): Map<SnsEvent, String> {
//        val sentEvents = mutableMapOf<SnsEvent, String>()
//        events.forEach { event ->
//            val messageId = sendMessage(event)
//            sentEvents[event] = messageId
//        }
//        return sentEvents
//    }

//    private fun getQueueUrl(queue: String) = sqsClient.getQueueUrl(GetQueueUrlRequest.builder().queueName(queue).build()).queueUrl()
}
