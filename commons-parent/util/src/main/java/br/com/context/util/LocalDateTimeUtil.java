package br.com.context.util;

import static java.util.Optional.ofNullable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LocalDateTimeUtil {

  public static final DateTimeFormatter ISO_LOCAL_DATE_TIME = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

  public static Optional<LocalDateTime> convert(String date) {
    return ofNullable(date).map(LocalDateTime::parse);
  }

  public static Optional<String> convert(LocalDateTime localDate) {
    return ofNullable(localDate).map(ISO_LOCAL_DATE_TIME::format);
  }

}
