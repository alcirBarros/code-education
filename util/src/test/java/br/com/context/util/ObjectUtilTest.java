package br.com.context.util;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Objects;
import org.junit.jupiter.api.Test;

public class ObjectUtilTest {

  @Test
  public void test() {
    boolean nonNull = Objects.nonNull(null);
    assertFalse(nonNull);
  }

}
