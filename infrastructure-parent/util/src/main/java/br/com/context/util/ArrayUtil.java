package br.com.context.util;

import java.lang.reflect.Array;
import java.util.List;

public class ArrayUtil {


  public static <T> T[] toArray(List<T> list) {
    T[] array = (T[]) Array.newInstance(list.get(0).getClass(), list.size());
    return list.toArray(array);
  }
}
