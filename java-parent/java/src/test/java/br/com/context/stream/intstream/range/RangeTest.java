package br.com.context.stream.intstream.range;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RangeTest {

  @Test
  void test01() {
    IntStream range = IntStream.range(0, 10);
  }


}
