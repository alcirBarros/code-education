package br.com.context.list.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SortTest {

  @Test
  void test01() {
    List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 6);
    Comparator<Integer> comparing = Comparator.comparing(Integer::intValue);
    System.out.println(list);
    list.sort(comparing);
    System.out.println(list);
  }


  @Test
  void test02() {
    List<Integer> list = Arrays.asList(1);
    Comparator<Integer> comparing = Comparator.comparing(Integer::intValue);
    System.out.println(list);
    list.sort(comparing);
    System.out.println(list);
  }
}
