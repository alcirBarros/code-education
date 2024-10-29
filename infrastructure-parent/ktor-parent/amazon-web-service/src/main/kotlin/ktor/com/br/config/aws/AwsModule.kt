package ktor.com.br.config.aws

import com.typesafe.config.Config
import ktor.com.br.config.aws.impl.AwsSnsPublisherImpl
import ktor.com.br.config.aws.property.AwsProperties
import ktor.com.br.config.aws.property.AwsQueueMessageVisibilityProperties
import ktor.com.br.config.aws.property.AwsQueueMessageVisibilityStrategy
import ktor.com.br.config.aws.property.AwsQueueProperties
import ktor.com.br.config.aws.property.AwsTopicProperties
import ktor.com.br.config.aws.property.LocalStackProperties
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider
import software.amazon.awssdk.http.SdkHttpClient
import software.amazon.awssdk.http.apache.ApacheHttpClient
import software.amazon.awssdk.services.sns.SnsClient
import software.amazon.awssdk.services.sqs.SqsClient
import java.net.URI
import java.time.Duration

val aws = DI.Module("aws") {
    //  importOnce(configuration)

    bind() from singleton { awsProperties(instance()) }
    bind() from singleton { localStackProperties(instance()) }
    bind() from singleton { awsHttpClient() }
    bind() from singleton { awsCredentialProvider(instance()) }

    bind() from singleton { awsSnsClient(instance(), instance(), instance(), instance()) }
    bind() from singleton { awsSqsClient(instance(), instance(), instance(), instance()) }
    bind() from singleton { awsSnsPublisher(instance(), instance(), instance()) }

    bind("testQueue") from singleton { awsQueueProperties(instance(), "testQueue") }
    bind("employeeCreatedUpdated") from singleton { awsQueueProperties(instance(), "employeeCreatedUpdated") }
    bind("accountLinked") from singleton { awsQueueProperties(instance(), "accountLinked") }
    bind("cardCreated") from singleton { awsQueueProperties(instance(), "cardCreated") }
    bind("walletAssociation") from singleton { awsQueueProperties(instance(), "walletAssociation") }

    bind("testTopic") from singleton { awsTopicProperties(instance(), "testTopic") }

    bind("cardTopicProperties") from singleton { awsTopicProperties(instance(), "card") }
}

private fun awsProperties(config: Config): AwsProperties {
    val builder = AwsProperties.Builder()
    if (config.hasPath("aws")) {
        config.getString("aws.accountId")?.let { builder.accountId = it }
        config.getString("aws.region")?.let { builder.region = it }
    }
    return builder.build()
}

private fun localStackProperties(config: Config): LocalStackProperties {
    val builder = LocalStackProperties.Builder()
    if (config.hasPath("aws.localstack")) {
        config.getBoolean("aws.localstack.enabled").let { builder.enabled = it }
        config.getString("aws.localstack.accessKeyId")?.let { builder.accessKeyId = it }
        config.getString("aws.localstack.secretAccessKey")?.let { builder.secretAccessKey = it }
        config.getString("aws.localstack.snsUrl")?.let { builder.snsUrl = it }
        config.getString("aws.localstack.sqsUrl")?.let { builder.sqsUrl = it }
    }
    return builder.build()
}

private fun awsHttpClient(): SdkHttpClient = ApacheHttpClient.builder()
    .connectionTimeout(Duration.ofSeconds(5))
    .connectionMaxIdleTime(Duration.ofSeconds(5))
    .maxConnections(500)
    .build()

private fun awsCredentialProvider(
    localStackProperties: LocalStackProperties
): AwsCredentialsProvider {

    if (localStackProperties.enabled)
        return StaticCredentialsProvider.create(
            AwsBasicCredentials.create(localStackProperties.accessKeyId, localStackProperties.secretAccessKey)
        )

    return DefaultCredentialsProvider.builder().build()
}

private fun awsSnsClient(
    awsProperties: AwsProperties,
    localStackProperties: LocalStackProperties,
    httpClient: SdkHttpClient,
    credentialsProvider: AwsCredentialsProvider
): SnsClient {
    val client = SnsClient.builder()
        .credentialsProvider(credentialsProvider)
        .httpClient(httpClient)
        .region(awsProperties.region)

    if (localStackProperties.enabled) client.endpointOverride(URI(localStackProperties.snsUrl))

    return client.build()
}

private fun awsSqsClient(
    awsProperties: AwsProperties,
    localStackProperties: LocalStackProperties,
    httpClient: SdkHttpClient,
    credentialsProvider: AwsCredentialsProvider
): SqsClient {
    val client = SqsClient.builder()
        .credentialsProvider(credentialsProvider)
        .httpClient(httpClient)
        .region(awsProperties.region)

    if (localStackProperties.enabled) client.endpointOverride(URI(localStackProperties.sqsUrl))

    return client.build()
}

private fun awsQueueProperties(config: Config, key: String): AwsQueueProperties {
    val builder = AwsQueueProperties.Builder()
    if (config.hasPath("aws.queue.$key")) {
        config.getBoolean("aws.queue.$key.enabled").let { builder.enabled = it }
        config.getString("aws.queue.$key.name")?.let { builder.name = it }
    }

    val messageVisibilityBuilder = AwsQueueMessageVisibilityProperties.Builder()
    if (config.hasPath("aws.queue.$key.messageVisibility")) {
        config.getString("aws.queue.$key.messageVisibility.strategy")
            .let { messageVisibilityBuilder.strategy = AwsQueueMessageVisibilityStrategy.valueOf(it) }
        config.getString("aws.queue.$key.messageVisibility.timeout")?.let { messageVisibilityBuilder.timeout = it }
        config.getString("aws.queue.$key.messageVisibility.heartbeat")
            ?.let { messageVisibilityBuilder.heartbeat = it.toIntOrNull() }
    }
    builder.visibilityProperties = messageVisibilityBuilder.build()

    return builder.build()
}

private fun awsTopicProperties(config: Config, key: String): AwsTopicProperties {
    val builder = AwsTopicProperties.Builder()
    if (config.hasPath("aws.topic.$key")) {
        config.getString("aws.topic.$key.name")?.let { builder.name = it }
    }
    return builder.build()
}

private fun awsSnsPublisher(snsClient: SnsClient, sqsClient: SqsClient, awsProperties: AwsProperties) =
    AwsSnsPublisherImpl(
        snsClient = snsClient,
        sqsClient = sqsClient,
        accountId = awsProperties.accountId,
        region = awsProperties.region
    )
