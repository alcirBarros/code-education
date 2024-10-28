package br.com.context.time.localdatetime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;

public class LocalDateTimeTest {

  @Test
  public void localDate01() {
    LocalDateTime localDateTime = LocalDateTime.now();
    assertNotNull(localDateTime);
  }

  @Test
  public void localDate02() {
    LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    assertNotNull(localDateTime);
  }

  @Test
  public void localDate03() {
    LocalDateTime localDateTime = LocalDateTime.of(2000, Month.JANUARY, 01, 00, 00);
    assertNotNull(localDateTime);
  }

}
