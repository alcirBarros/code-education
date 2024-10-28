package br.com.context.stream.intstream.of;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OfTest {

  @Test
  void test01() {
    IntStream range = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  }


}
