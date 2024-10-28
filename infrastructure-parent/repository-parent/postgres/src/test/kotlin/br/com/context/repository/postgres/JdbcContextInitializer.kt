package br.com.context.repository.postgres

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.test.context.support.TestPropertySourceUtils
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.utility.DockerImageName

class JdbcContextInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {
    companion object {
        private val POSTGRES = PostgreSQLContainer<Nothing>(DockerImageName.parse("postgres:13-alpine")).apply {
            withDatabaseName("postgres")
            withUsername("root")
            withPassword("root")
            withCommand("postgres", "-c", "fsync=off", "-c", "log_statement=all")
            start()
        }
    }

    override fun initialize(configurableApplicationContext: ConfigurableApplicationContext) {
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
            configurableApplicationContext,
            "spring.datasource.url=" + POSTGRES.jdbcUrl
        )
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
            configurableApplicationContext,
            "spring.datasource.username=" + POSTGRES.username
        )
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
            configurableApplicationContext,
            "spring.datasource.password=" + POSTGRES.password
        )
    }
}
