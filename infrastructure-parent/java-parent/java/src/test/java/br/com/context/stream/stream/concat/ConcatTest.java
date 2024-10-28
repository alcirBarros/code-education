package br.com.context.stream.stream.concat;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConcatTest {

  @Test
  void test001() {
    List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbers02 = Arrays.asList(6, 7, 8, 9, 10);
    Stream<Integer> stream01 = numbers01.stream();
    Stream<Integer> stream02 = numbers02.stream();
    Stream<Integer> concat = Stream.concat(stream01, stream02);

    List<Integer> numberList = concat.collect(Collectors.toList());

    assertNotNull(numberList);
  }

  @Test
  void test002() {
    List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbers02 = Arrays.asList(6, 7, 8, 9, 10);
    Stream<Integer> stream01 = numbers01.stream();
    Stream<Integer> stream02 = Stream.empty();
    Stream<Integer> concat = Stream.concat(stream01, stream02);

    List<Integer> numberList = concat.collect(Collectors.toList());

    assertNotNull(numberList);
  }


}
