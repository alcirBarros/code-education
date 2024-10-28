package br.com.context.util;

import static java.util.function.Function.identity;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUtil {

  public static <T extends Enum<T>> Map<String, Enum<T>> toMap(Enum<T>[] enumArray) {
    return Arrays.stream(enumArray).collect(Collectors.toMap(Enum::name, identity()));
  }

}
