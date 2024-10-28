package br.com.context.optional.of;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OfTest {


  @Test
  public void test01() {
    Optional.of(1).flatMap(x -> {
      return Optional.of(2);
    }).map(x -> {
      return 3;
    }).ifPresent(x -> {
      System.out.println(x);
    });
  }

  @Test
  public void test002() {
    List<Integer> list = null;
    List<Integer> integerList = Optional.ofNullable(list).orElseGet(Collections::emptyList);
    assertNotNull(integerList);
  }

  @Test
  public void test003() {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    Stream<List<Integer>> stream = Optional.of(list).stream();
    Stream<Integer> integerStream = stream.flatMap(Collection::stream);
    List<Integer> collect = integerStream.collect(Collectors.toList());
    assertNotNull(collect);
  }

  @Test
  public void test004() {
    Optional<Integer> integer = Optional.ofNullable(1);
    integer.ifPresent(System.out::println);
    integer.ifPresent(System.out::println);
  }

}
