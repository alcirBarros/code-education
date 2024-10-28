package br.com.context.time.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class LocalDateTest {

  @Test
  public void localDate01() {
    LocalDate now = LocalDate.now();
    LocalDate toquio = LocalDate.now(ZoneId.of("Asia/Tokyo"));
    LocalDate of = LocalDate.of(2014, Month.DECEMBER, 25);

    //Retocedento os dias para obter uma data a partir da data base 01/01/1970
    LocalDate dataBase = LocalDate.ofEpochDay(365);
    System.out.println("365 dias a partir da data baase (01/01/1970)= " + dataBase);

    //Dia do ano
    LocalDate centessimoDia2014 = LocalDate.ofYearDay(2014, 1);
    System.out.println("100º dia de 2014=" + centessimoDia2014);

    LocalDate localDate3 = LocalDate.now().plusDays(1).plusMonths(1);

    LocalDate localDate6 = LocalDate.parse("2018-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));


    int year    = LocalDate.now().getYear();
  }

  @Test
  public void localDate02() {
    LocalDate localDate01 = LocalDate.of(2000, Month.JANUARY, 01);
    LocalDate localDate02 = LocalDate.of(2000, Month.FEBRUARY, 01);
    LocalDate localDate03 = LocalDate.of(2000, Month.MARCH, 01);
    LocalDate localDate04 = LocalDate.of(2000, Month.APRIL, 01);

    List<LocalDate> localDateList = Arrays.asList(localDate01, localDate02, localDate03, localDate04);
    Stream<LocalDate> localDateStream = localDateList.stream();
    Predicate<LocalDate> aa = x -> x.isEqual(localDate03);
    Predicate<LocalDate> bb = x -> x.isAfter(localDate03);
    Predicate<LocalDate> or = aa.or(bb);

    List<LocalDate> collect = localDateStream.filter(or).collect(Collectors.toList());
    System.out.println(collect);

  }

}
