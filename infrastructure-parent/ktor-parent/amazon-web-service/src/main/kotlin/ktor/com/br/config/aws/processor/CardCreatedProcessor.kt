package ktor.com.br.config.aws.processor

import ktor.com.br.config.aws.AwsSqsConsumer
import ktor.com.br.config.aws.extension.bodyToObject
import ktor.com.br.config.aws.property.AwsQueueProperties
import ktor.com.br.config.aws.property.toVisibilityConfig
import ktor.com.br.events.CardEvent
import ktor.com.br.events.EventName
import org.kodein.di.DI
import org.kodein.di.direct
import org.kodein.di.instance
import software.amazon.awssdk.services.sqs.SqsClient

fun AwsSqsConsumer.cardCreatedProcessor(injector: DI) {
    val queueKey = "cardCreated"
//    val logger = KotlinLogging.logger { }
    val client: SqsClient = injector.direct.instance()
    val queueProperties: AwsQueueProperties = injector.direct.instance(queueKey)

//    val tokenService: CardTokenService = injector.direct.instance()
//    val cardPersonRepository: CardPersonRepository = injector.direct.instance()

//    val walletQueue: AwsQueueProperties = injector.direct.instance("walletAssociation")

    subscribe(
        client = client,
        queueDescription = queueKey,
        queueName = queueProperties.name,
        enabled = queueProperties.enabled,
        eventType = EventName.CREATED,
        messageVisibilityConfig = queueProperties.visibilityProperties.toVisibilityConfig()
    ) { message ->
//        message.carProcessorRunning(queueProperties) {
        val event: CardEvent? = message.bodyToObject()
//            logger.debug { message.body() }

        event?.run {

//                if (contents.personId?.toPersonId() != null && walletQueue.enabled) {
//                    tokenService.syncWallet(contents.personId.toPersonId()!!, contents.companyId)
//                } else {
//                    val cardsPerson = cardPersonRepository.findByEmployeeAndCompanyId(contents.employeeId, contents.companyId)
//                    if (cardsPerson.isNotEmpty() && walletQueue.enabled) {
//                        tokenService.syncWallet(cardsPerson.first().personId, contents.companyId)
//                    } else {
//                        tokenService.save(contents.employeeId)
//                    }
//                }

//            }
        }
    }
}
