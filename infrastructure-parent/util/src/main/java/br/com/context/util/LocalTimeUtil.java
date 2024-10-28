package br.com.context.util;

import static java.util.Optional.ofNullable;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LocalTimeUtil {

  private static final DateTimeFormatter ISO_TIME = DateTimeFormatter.ISO_TIME;

  public static Optional<LocalTime> convert(String date) {
    return ofNullable(date).map(LocalTime::parse);
  }

  public static Optional<String> convert(LocalTime localDate) {
    return ofNullable(localDate).map(ISO_TIME::format);
  }

}
