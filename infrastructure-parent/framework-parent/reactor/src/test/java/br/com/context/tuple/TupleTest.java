package br.com.context.tuple;

import org.junit.jupiter.api.Test;
import reactor.util.function.Tuple3;
import reactor.util.function.Tuples;

public class TupleTest {

  @Test
  public void flux01_() {
    Tuple3<Integer, Integer, String> base = Tuples.of(100, 200, "Foo");
    Tuple3<Integer, Integer, Integer> mapped = base.mapT3(String::length);
    System.out.println(mapped);

  }


}
