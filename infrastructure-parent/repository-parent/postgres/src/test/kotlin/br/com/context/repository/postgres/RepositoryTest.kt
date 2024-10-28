//package br.com.postgres
//
//import br.com.postgres.repository.RegistryJdbcRepository
//import org.flywaydb.core.Flyway
//import org.junit.jupiter.api.AfterEach
//import org.junit.jupiter.api.Assertions
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.test.context.ContextConfiguration
//import org.springframework.test.context.jdbc.Sql
//import java.util.UUID
//import javax.sql.DataSource
//
//@SpringBootTest
//@ContextConfiguration(initializers = [JdbcContextInitializer::class])
//class RepositoryTest(
//    @Autowired
//    private val flyway: Flyway,
//    @Autowired
//    private val dataSource: DataSource,
//    @Autowired
//    private val jdbcRepository: RegistryJdbcRepository
//) {
//
////    @BeforeEach
////    fun setup() {
////        flyway.migrate()
////    }
////
////    @AfterEach
////    fun tearDown() {
////        flyway.clean()
////    }
//
//    @Test
//    fun test01() {
//        val connection = dataSource.connection
//        val catalog = connection.catalog
//        assertEquals("postgres", catalog)
//    }
//
//    @Test
//    @Sql(
//        statements = [
//            "insert into sign_up (id, name) values ('84cf23d5-cd15-40e1-905a-4e07ad7f240f', 'texto')"
//        ]
//    )
//    fun `Given a failed OtpValidation, isValidated returns false`() {
//        val findAllById = jdbcRepository.findAllById(UUID.fromString("84cf23d5-cd15-40e1-905a-4e07ad7f240f"))
//        Assertions.assertFalse(false)
//    }
//}
