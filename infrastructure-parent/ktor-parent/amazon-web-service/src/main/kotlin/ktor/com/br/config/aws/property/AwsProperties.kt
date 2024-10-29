package ktor.com.br.config.aws.property

import ktor.com.br.config.aws.MessageVisibilityConfig
import ktor.com.br.config.aws.MessageVisibilityStrategy
import software.amazon.awssdk.regions.Region

data class AwsProperties(
    val accountId: String,
    val region: Region
) {
    data class Builder(
        var accountId: String? = null,
        var region: String? = null
    ) {
        fun build(): AwsProperties = AwsProperties(
            accountId = accountId ?: error("Missing aws accountId"),
            region = Region.of(region ?: "us-east-1")
        )
    }
}

data class LocalStackProperties(
    val enabled: Boolean,
    val accessKeyId: String,
    val secretAccessKey: String,
    val sqsUrl: String,
    val snsUrl: String
) {
    data class Builder(
        var enabled: Boolean? = null,
        var accessKeyId: String? = null,
        var secretAccessKey: String? = null,
        var sqsUrl: String? = null,
        var snsUrl: String? = null
    ) {
        fun build(): LocalStackProperties = LocalStackProperties(
            enabled = enabled ?: false,
            accessKeyId = accessKeyId ?: "foo",
            secretAccessKey = secretAccessKey ?: "foo",
            snsUrl = snsUrl ?: "http://localhost:4575",
            sqsUrl = sqsUrl ?: "http://localhost:4576"
        )
    }
}

data class AwsQueueProperties(
    val enabled: Boolean,
    val name: String,
    val visibilityProperties: AwsQueueMessageVisibilityProperties
) {
    data class Builder(
        var enabled: Boolean? = false,
        var name: String? = null,
        var visibilityProperties: AwsQueueMessageVisibilityProperties? = null
    ) {
        fun build(): AwsQueueProperties = AwsQueueProperties(
            enabled = enabled ?: false,
            name = name ?: "UNDEFINED",
            visibilityProperties = visibilityProperties ?: AwsQueueMessageVisibilityProperties.Builder().build()
        )
    }
}

fun AwsQueueMessageVisibilityProperties.toVisibilityConfig(): MessageVisibilityConfig {
    return MessageVisibilityConfig(
        strategy = MessageVisibilityStrategy.valueOf(this.strategy.name),
        timeout = this.timeout,
        heartbeat = this.heartbeat
    )
}

data class AwsQueueMessageVisibilityProperties(
    val strategy: AwsQueueMessageVisibilityStrategy,
    val timeout: String?,
    val heartbeat: Int?
) {
    data class Builder(
        var strategy: AwsQueueMessageVisibilityStrategy? = AwsQueueMessageVisibilityStrategy.DEFAULT,
        var timeout: String? = null,
        var heartbeat: Int? = null
    ) {
        fun build(): AwsQueueMessageVisibilityProperties = AwsQueueMessageVisibilityProperties(
            strategy = strategy ?: AwsQueueMessageVisibilityStrategy.DEFAULT,
            timeout = timeout,
            heartbeat = heartbeat
        )
    }
}

enum class AwsQueueMessageVisibilityStrategy() {
    DEFAULT, TIMEOUT, HEARTBEAT
}

data class AwsTopicProperties(
    val name: String
) {
    data class Builder(
        var name: String? = null
    ) {
        fun build(): AwsTopicProperties = AwsTopicProperties(
            name = name ?: "UNDEFINED"
        )
    }
}
