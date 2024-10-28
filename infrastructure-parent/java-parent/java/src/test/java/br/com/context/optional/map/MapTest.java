package br.com.context.optional.map;

import static java.util.Map.entry;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapTest {

  @Test
  public void test001() {
    Optional.ofNullable(null).map(x -> {
      return entry("Teste", x);
    }).ifPresent(x -> {
      System.out.println(x);
    });


  }
}
