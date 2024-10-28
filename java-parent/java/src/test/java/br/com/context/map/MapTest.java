package br.com.context.map;

import java.util.Map;
import java.util.Map.Entry;
import org.junit.jupiter.api.Test;

public class MapTest {

  @Test
  void test01() {
    Entry<Integer, Integer> entry = Map.entry(10, 10);
    System.out.println(entry);
  }

  @Test
  void test02() {
    Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3);
    System.out.println(map);
  }
}
