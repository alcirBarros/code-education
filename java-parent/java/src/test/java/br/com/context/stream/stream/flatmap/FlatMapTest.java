package br.com.context.stream.stream.flatmap;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlatMapTest {

  @Test
  void test001() {
    List<Integer> list01 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list02 = Arrays.asList(6, 7, 8, 9, 10);
    List<List<Integer>> list011 = List.of(list01, list02);
    List<Object> list = list011.stream().flatMap(List::stream).collect(Collectors.toList());
    assertNotNull(list);
  }


}
