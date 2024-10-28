package br.com

import br.com.module.deployment
import br.com.plugins.configureRouting
import br.com.properties.createApplicationConfig
import io.ktor.application.Application
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.TestApplicationEngine
import io.ktor.server.testing.createTestEnvironment
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withApplication
import org.slf4j.LoggerFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    private fun <R> withTestApplication(moduleFunction: Application.() -> Unit, test: TestApplicationEngine.() -> R): R {
        val createTestEnvironment = createTestEnvironment {
            config = createApplicationConfig()
            log = LoggerFactory.getLogger("ktor.test")
        }
        return withApplication(createTestEnvironment) {
            moduleFunction(application)
            test()
        }
    }

    @Test
    fun testRoot1() {
        withTestApplication({ deployment() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun testRoot() {
        withTestApplication({ configureRouting() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }
        }
    }
}
