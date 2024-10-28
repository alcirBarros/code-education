package br.com

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class KotlinApplicationTests {

    @Test
    fun teste001() {

        val s: String? = null

        val parent = s ?: "TESTE"

        print(parent)

        val randomUUID = UUID.randomUUID()
        println(randomUUID)

        val b: String? = null

        b?.let {
            print(it)
        }

        val let = s.let { UUID.fromString(it) }

        println(let)

        val fromString = UUID.fromString(s)
        println(fromString)
    }

    @Test
    fun teste002() {

        val pessoa = Pessoa()
        pessoa.nome = "aaaaaa"
        pessoa.cpf = "25635874526"

        var list = listOf<Pessoa>(pessoa)

        val chunked = list.chunked(5).map {

            val mapNotNull = it.mapNotNull {
                it.cpf
            }

            print(mapNotNull)
            print(it)
        }
        print(chunked)
    }
}
