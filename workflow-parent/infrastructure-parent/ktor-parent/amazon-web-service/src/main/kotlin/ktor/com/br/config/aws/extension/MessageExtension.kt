package ktor.com.br.config.aws.extension

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import software.amazon.awssdk.services.sqs.model.Message

inline fun <reified T> Message.bodyToObject(): T? =
    KlaxonExtension
        .mapper
        .parse(this.getMessageAsJSON())

fun Message.getMessageAsJSON(): String =
    if (this.isMessageComingFromTopic()) this.getMessageFromTopic() else this.body()

private fun Message.isMessageComingFromTopic() = this.body().contains("TopicArn")

private fun Message.getMessageFromTopic(): String {
    val json = Parser.default().parse(StringBuilder(this.body())) as JsonObject

    return json.string("Message") ?: throw Error("Tag Message not found")
}
