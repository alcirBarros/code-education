package br.com.context.util;

import java.time.LocalDate;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class LocalDateUtilTest {

  @Test
  public void test01() {
    Optional<LocalDate> convert = LocalDateUtil.convert("2023-01-01");
    System.out.println(convert);
  }

  @Test
  public void test02() {
    LocalDate localDate = LocalDate.now();
    Optional<String> convert = LocalDateUtil.convert(localDate);
    System.out.println(convert);
  }

  @Test
  public void firstDayOfMonth01() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate1 = LocalDateUtil.firstDayOfMonth(localDate);
    System.out.println(localDate1);
  }

  @Test
  public void firstDayOfMonth02() {
    Optional<LocalDate> convert = LocalDateUtil.firstDayOfMonth("2023-03");
    System.out.println(convert);
  }

  @Test
  public void lastDayOfMonth() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate1 = LocalDateUtil.lastDayOfMonth(localDate);
    System.out.println(localDate1);
  }

}
