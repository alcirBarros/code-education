package br.com.context.stream.stream.orelseget;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class orElseGetTest {

  @Test
  void test001() {
    List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
    Stream<Integer> stream = lista.stream();
    Stream<Integer> limit = stream.limit(9);// limita a 9 números
    Integer integer = limit.findAny().orElse(null);
    System.out.println(integer);
  }

  @Test
  void test002() {
    List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
    Stream<Integer> stream = lista.stream();
    Stream<Integer> limit = stream.limit(9);// limita a 9 números
    Integer integer = limit.findAny().orElseGet(null); //Erro exception, não pode retornar null
    System.out.println(integer);
  }

}
