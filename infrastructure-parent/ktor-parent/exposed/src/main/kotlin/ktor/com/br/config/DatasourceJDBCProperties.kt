package ktor.com.br.config

data class DatasourceJDBCProperties(
    val jdbcUrl: String,
    val username: String,
    val password: String,
    val driver: String,
    val maximumPoolSize: Int,
    val leakDetectionThreshold: Long,
    val initQuery: String
) {
    data class Builder(
        var jdbcUrl: String = "",
        var username: String = "",
        var password: String = "",
        var driver: String = "org.postgresql.Driver",
        var maximumPoolSize: Int = 10,
        var leakDetectionThreshold: Long = 0,
        var initQuery: String = ""
    ) {
        fun build(): DatasourceJDBCProperties {
            return DatasourceJDBCProperties(
                jdbcUrl = jdbcUrl,
                username = username,
                password = password,
                driver = driver,
                maximumPoolSize = maximumPoolSize,
                leakDetectionThreshold = leakDetectionThreshold,
                initQuery = initQuery
            )
        }
    }
}
