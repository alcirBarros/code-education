package br.com.context.stream.stream.of;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OfTest {

  @Test
  void test01() {
    Stream<Integer> stream = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> numberList = stream.collect(Collectors.toList());
    assertNotNull(numberList);
  }

  @Test
  void test02() {
    List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbers02 = Arrays.asList(6, 7, 8, 9, 10);
    List<Integer> numberList = Stream.of(numbers01, numbers02).flatMap(Collection::stream).collect(Collectors.toList());
    assertNotNull(numberList);
  }

}
