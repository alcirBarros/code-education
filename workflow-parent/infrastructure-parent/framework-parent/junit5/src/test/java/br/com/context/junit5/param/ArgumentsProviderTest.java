package br.com.context.junit5.param;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArgumentsProviderTest {

  static class CustomArgumentProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
      Arguments arguments01 = Arguments.of(1, 1, 2);
      Arguments arguments02 = Arguments.of(2, 3, 5);
      return Stream.of(arguments01, arguments02);
    }
  }

  @ParameterizedTest()
  @ArgumentsSource(CustomArgumentProvider.class)
  public void sum(int a, int b, int sum) {
    assertTrue(true);
  }

}
