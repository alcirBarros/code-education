package br.com.context.util;

import java.util.Optional;
import org.junit.jupiter.api.Test;

public class PatternTest {

  @Test
  public void test01() {
    Optional<String> matcher = PatternUtil.matcher("123456789");
    System.out.println(matcher);
  }

}
