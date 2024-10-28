package br.com

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@DisplayName("Teste ciclo de vida JUnit 5 😀 Kotlin")
@SpringBootTest
class Test {

    private val reviewUserTaxId: String? = null

    val lazyValue: String by lazy {
        println("computed!!!!!!!!!!!!!!!!!!")
        return@lazy "Hello"
    }

    @Test
    @DisplayName("Display Teste1")
    fun teste01() {
        println(lazyValue)
        println(lazyValue)
    }

    @Test
    @DisplayName("Display Teste2")
    fun teste02() {
        var taxId: String = "aaaaaaaaaaa"
        val s = when (taxId) {
            reviewUserTaxId -> null
            else -> "AAAAAAAAa"
        }

        print(s)
    }

    @Test
    fun teste03() {
        val s = try {
            "AAAAAAAAAAAAAAAAA"
        } catch (a: Exception) {
            "BBBBBBBBBBBBBBBB"
        }

        println(s)
    }

    @Test
    fun teste04() {
        runCatching {
        }.getOrElse {
            println("AAAAAAAAAAAAAAAAA")
        }
    }

    @Test
    fun teste05() {
        val mutableListOf = mutableListOf<Pessoa>()
        val any = mutableListOf.any {
            it.status
        }
        println(any)
    }
}
