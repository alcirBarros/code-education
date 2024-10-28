package br.com.context

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.Arrays.asList

@SpringBootTest()
@DisplayName("Teste asset JUnit 5 😀 Kotlin")
class AssertKotlinTest {

    @Test
    fun whenAssertingEquality_thenEqual() {
        val expected = "Baeldung"
        val actual = "Baeldung"
        Assertions.assertEquals(expected, actual)
        Assertions.assertEquals(expected, actual, "failure - strings are not equal")
    }

    @Test
    fun whenAssertingArraysEquality_thenEqual() {
        val expected = charArrayOf('J', 'u', 'n', 'i', 't')
        val actual = "Junit".toCharArray()
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun givenNullArrays_whenAssertingArraysEquality_thenEqual() {
        val expected: IntArray? = null
        val actual: IntArray? = null
        Assertions.assertArrayEquals(expected, actual)
    }

    @Test
    fun whenAssertingNull_thenTrue() {
        val car: Any? = null
        Assertions.assertNull(car, "The car should be null")
    }

    @Test
    fun whenAssertingConditions_thenVerified() {
        Assertions.assertTrue(5 > 4, "5 is greater then 4")
        Assertions.assertFalse(5 > 6, "5 is not greater then 6")
    }

    @Test
    fun whenAssertingEqualityListOfStrings_thenEqual() {
        val expected: List<String> = asList("Java", "11", "JUnit")
        val actual: List<String> = asList("Java", "11", "JUnit")
        Assertions.assertLinesMatch(expected, actual)
    }

    @Test
    fun whenAssertingEquality_thenNotEqual() {
        val value = 5 // result of an algorithm
        Assertions.assertNotEquals(0, value, "The result cannot be 0")
    }
}
