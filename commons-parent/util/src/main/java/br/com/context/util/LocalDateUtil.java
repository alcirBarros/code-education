package br.com.context.util;

import static java.time.format.DateTimeFormatter.ofPattern;
import static java.util.Optional.ofNullable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Optional;

public class LocalDateUtil {

  public static final DateTimeFormatter ISO_LOCAL_DATE_TIME = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
  private static final DateTimeFormatter FORMATTER_01 = ofPattern("dd-MM-yyyy");
  private static final DateTimeFormatter FORMATTER_2 = ofPattern("yyyy-MM");

  public static Optional<LocalDate> convert(String date) {
    return ofNullable(date).map(LocalDate::parse);
  }



  public static Optional<String> convert(LocalDate localDate) {
     return ofNullable(localDate).map(FORMATTER_01::format);
  }

  public static LocalDate firstDayOfMonth(LocalDate date) {
    TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
    return date.with(temporalAdjuster);
  }

  public static Optional<LocalDate> firstDayOfMonth(String date) {
    Optional<TemporalAccessor> temporalAccessor = ofNullable(date).map(FORMATTER_2::parse);
    return temporalAccessor.map(LocalDateUtil::convert);
  }

  public static LocalDate lastDayOfMonth(LocalDate date) {
    TemporalAdjuster temporalAdjuster = TemporalAdjusters.lastDayOfMonth();
    return date.with(temporalAdjuster);
  }

  public static LocalDate convert(TemporalAccessor temporalAccessor) {
    int year = temporalAccessor.get(ChronoField.YEAR);
    int month = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
    return LocalDate.of(year, month, 1);
  }

}
