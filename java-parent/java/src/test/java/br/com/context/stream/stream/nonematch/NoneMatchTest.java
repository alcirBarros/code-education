package br.com.context.stream.stream.nonematch;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Esta classe contém testes unitários para validar o comportamento da operação noneMatch em Java Streams.
 * Utiliza os frameworks de teste JUnit 5 e Spring Boot.
 */
@SpringBootTest
public class NoneMatchTest {

  /**
   * Este caso de teste valida que nenhum dos elementos em um Stream de Integers é igual a 1.
   * Cria um Stream de Integers, aplica a operação noneMatch com um predicado que verifica se o elemento é igual a 1,
   * e afirma que o resultado da operação noneMatch é verdadeiro.
   */
  @Test
  void test01() {
    // Cria um Stream de Integers
    Stream<Integer> stream = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

    // Aplica a operação noneMatch com um predicado que verifica se o elemento é igual a 1
    boolean result = stream.noneMatch(event -> event.equals(1));

    // Afirma que o resultado da operação noneMatch é verdadeiro
    assertTrue(result);
  }
}