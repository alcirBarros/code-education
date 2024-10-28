package br.com

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.springframework.boot.test.context.SpringBootTest

@DisplayName("Teste ciclo de vida JUnit 5 😀 Kotlin")
@SpringBootTest()
class LifeCycleKotlinTest {

    companion object {
    
        private val instance: String = ""
        
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("BeforeAll")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("AfterAll")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("-BeforeEach")
    }

    @AfterEach
    fun afterEach() {
        println("-AfterEach")
    }

    @Test
    @DisplayName("Display Teste1")
    fun teste01() {
        println("--teste01")
    }

    @Test
    @DisplayName("Display Teste2")
    fun teste02() {
        println("--teste02")
    }

    @ParameterizedTest
    @ValueSource(longs = [1, 2, 3, 5, 8, 9, 10, 11])
    fun teste03(days: Long) {
        println("--teste03-$days")
    }
}
