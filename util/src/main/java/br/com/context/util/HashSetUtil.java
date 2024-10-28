package br.com.context.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class HashSetUtil {


  public static <T> List<T> emptyList(List<T> array) {
    return Optional.ofNullable(array).filter(Objects::nonNull).orElseGet(Collections::emptyList);
  }

  public static <T> void arrayToHashSet(List<T> array) {
    List<T> list = Optional.ofNullable(array).orElseGet(Collections::emptyList);
    HashSet<T> collect = list.stream().collect(Collectors.toCollection(HashSet::new));
    System.out.println(collect);
  }

  public static void main(String[] args) {
    arrayToHashSet(null);
  }


}
