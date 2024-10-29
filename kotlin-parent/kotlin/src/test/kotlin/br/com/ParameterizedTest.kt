package br.com

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import org.springframework.boot.test.context.SpringBootTest
import java.util.stream.Stream

@SpringBootTest
class ParameterizedTest {

    @ParameterizedTest
    @ArgumentsSource(CardValidationArgumentsProvider::class)
    fun teste03(int: Int, string: String, expected: Boolean) {
        println("--teste03-")
    }

    class CardValidationArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    123,
                    "texto",
                    true
                )
            )
        }
    }
}
