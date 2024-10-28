package br.com.context.util;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {
  private static final Pattern MATCHER_01 = Pattern.compile("\\d{4}");

  private static final Pattern MATCHER_02 = Pattern.compile("DFE101\\_\\d{8}(.TXT|.txt|)");

  private static final Pattern MATCHER_03 = Pattern.compile("redis://(.*):(\\d+)");

  public static Optional<String> matcher(String value) {
    Matcher matcher = MATCHER_01.matcher(value);
    return Optional.of(matcher).filter(Matcher::find).map(Matcher::group);
  }

}
