package br.com.context.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class LocalDateTimeUtilTest {

  @Test
  public void test001() {
    Optional<LocalDateTime> convert = LocalDateTimeUtil.convert("2023-11-07T14:15:19.935059100");
    System.out.println(convert);
  }

  @Test
  public void test002() {
    LocalDateTime localDateTime = LocalDateTime.now();
    Optional<String> convert = LocalDateTimeUtil.convert(localDateTime);
    System.out.println(convert);
  }

}
