package br.com.context.stream.stream.dropwhile;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DropWhileTest {

  @Test
  void test01() {
    List<Integer> listInteger = Arrays.asList(1, 2);
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    List<Integer> list = stream.dropWhile(listInteger::contains).collect(Collectors.toList());
    assertNotNull(list);
  }

  @Test
  void test02() {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    Stream<Integer> dropWhile = stream.dropWhile(n -> n % 2 == 0);
    List<Integer> list = dropWhile.collect(Collectors.toList());
    assertNotNull(list);
  }

  @Test
  void test03() {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    Stream<Integer> dropWhile = stream.takeWhile(n -> n % 2 == 0);
    List<Integer> list = dropWhile.collect(Collectors.toList());
    assertNotNull(list);
  }

}
