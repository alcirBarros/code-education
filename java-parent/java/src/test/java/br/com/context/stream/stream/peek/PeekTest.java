package br.com.context.stream.stream.peek;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PeekTest {

  @Test
  void test001() {
    List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> integerStream = numbers01.stream();

    Stream<Integer> peek = integerStream.peek(System.out::println);

    List<Integer> integerList = peek.collect(Collectors.toList());
    assertNotNull(integerList);
  }

}
