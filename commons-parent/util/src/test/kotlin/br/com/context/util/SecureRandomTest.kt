package br.com.context.util

import org.apache.commons.lang3.RandomStringUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.security.SecureRandom
import java.security.Security

@SpringBootTest()
@DisplayName("Teste asset JUnit 5 😀 Kotlin")
class SecureRandomTest {

    @Test
    fun generateSafeToken() {
        val algorithms: Set<String> = Security.getAlgorithms("SecureRandom")

        for (algorithm in algorithms) {
            println(algorithm)
        }

        val defaultAlgorithm = SecureRandom().algorithm

        Assertions.assertNotNull(defaultAlgorithm)
        Assertions.assertEquals("", "", "")
    }

    @Test
    fun whenAssertingEquality_thenEqual() {
        val secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG")
        val provider = secureRandomGenerator.provider.name
        Assertions.assertEquals("SUN", provider)
    }

    @Test
    fun test003() {
        val secureRandomGenerator = SecureRandom.getInstance("DRBG")

        val possibleCharacters: CharArray =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?".toCharArray()

        val randomStr: String = RandomStringUtils.random(
            6,
            0,
            possibleCharacters.size - 1,
            false,
            true,
            possibleCharacters,
            secureRandomGenerator
        )
        Assertions.assertNotNull(randomStr)
    }
}