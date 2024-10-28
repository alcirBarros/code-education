package br.com.context.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ListTest {

  @Test
  public void test001() {
    List<Integer> asList = Arrays.asList();;
    List<Integer> of = List.of();
    Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

    Optional<Integer> integer = Optional.empty();
    Optional<List<Integer>> integers = integer.map(List::of);
    List<Integer> integers1 = integers.orElse(List.of());
    System.out.println(integers1);

    ArrayList<Integer> collect = integers1.stream().collect(ArrayList::new, List::add, List::addAll);
    collect.add(2);
    collect.add(null);
    collect.add(null);
    collect.add(null);
    collect.add(null);
    System.out.println(collect);

  }


  @Test
  public void test002() {

  }

}
