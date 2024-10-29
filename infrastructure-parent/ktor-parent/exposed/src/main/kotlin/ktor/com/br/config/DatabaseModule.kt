package ktor.com.br.config

import com.zaxxer.hikari.HikariDataSource
import io.ktor.config.ApplicationConfig
import javax.sql.DataSource

fun datasourceJDBC(properties: DatasourceJDBCProperties): DataSource {
    val dataSource = HikariDataSource()
    dataSource.driverClassName = properties.driver
    dataSource.jdbcUrl = properties.jdbcUrl
    dataSource.username = properties.username
    dataSource.password = properties.password
    dataSource.maximumPoolSize = properties.maximumPoolSize
    dataSource.leakDetectionThreshold = properties.leakDetectionThreshold
    dataSource.connectionInitSql = properties.initQuery
    dataSource.isRegisterMbeans = true
    return dataSource
}

fun datasourceJDBCProperties(config: ApplicationConfig, datasource: String): DatasourceJDBCProperties {
    val builder = DatasourceJDBCProperties.Builder()
    config.getString("datasource.$datasource.jdbc.url")?.let { builder.jdbcUrl = it }
    config.getString("datasource.$datasource.jdbc.username")?.let { builder.username = it }
    config.getString("datasource.$datasource.jdbc.password")?.let { builder.password = it }
    config.getInt("datasource.$datasource.jdbc.maximumPoolSize")?.let { builder.maximumPoolSize = it }
    config.getLong("datasource.$datasource.jdbc.leakDetectionThreshold")?.let { builder.leakDetectionThreshold = it }
    config.getString("datasource.$datasource.jdbc.driver")?.let { builder.driver = it }
    return builder.build()
}



