package ktor.com.br.events

import ktor.com.br.config.aws.event.SnsEvent
import ktor.com.br.model.Card
import java.util.UUID

class CardEvent(
    override val topic: String,
    override val name: String,
    override val contents: CardPayload
) : SnsEvent(topic = topic, name = name, contents = contents) {
    companion object {
        fun build(func: Builder.() -> Unit): CardEvent {
            val builder = Builder()
            builder.func()
            return CardEvent(
                topic = builder.topic ?: throw Error("Event Topic is required"),
                name = builder.name ?: throw Error("Event Name is required"),
                contents = builder.card?.let {
                    CardPayload(
                        cardId = it.id,
                        embossingName = it.embossingName
                    )
                } ?: throw Error("Card is required")
            )
        }
    }
}

data class Builder(
    var topic: String? = null,
    var name: String? = null,
    var card: Card? = null
)

data class CardPayload(
    val cardId: UUID,
    val embossingName: String
)
