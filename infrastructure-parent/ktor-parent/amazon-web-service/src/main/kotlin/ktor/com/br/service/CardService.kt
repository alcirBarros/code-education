package ktor.com.br.service

import ktor.com.br.config.aws.AwsSnsPublisher
import ktor.com.br.config.aws.property.AwsTopicProperties
import ktor.com.br.events.CardEvent
import ktor.com.br.events.EventName
import ktor.com.br.model.Card

class CardService(
    private val cardTopic: AwsTopicProperties,
    private val snsPublisher: AwsSnsPublisher
) {

    suspend fun sendCardCreatedEvent(createdCard: Card): String {
        return CardEvent.build {
            topic = cardTopic.name
            name = EventName.CREATED.name
            card = createdCard
        }.run {
            snsPublisher.sendMessage(this)
        }
    }
}
