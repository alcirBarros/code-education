package br.com.context.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.ObjectUtils;

public class ListUtil {
  public static Predicate<List> isNotEmpty = ObjectUtils::isNotEmpty;
  public static Predicate<List> isEmpty = ObjectUtils::isEmpty;
  public static Predicate<List> isNotEmptyAndIsEmpty = isNotEmpty.and(isEmpty);
  public static <T> List<T> isNotEmpty(T[] array) {
    return Optional.ofNullable(array).map(Arrays::asList).filter(isNotEmpty).orElseGet(Collections::emptyList);
  }

  public static <T> List<T> isNotEmpty(List<T> list) {
    return Optional.ofNullable(list).orElseGet(Collections::emptyList);
  }

  public static <T extends Enum<T>> List<Enum<T>> toEnumList(Enum<T>[] enumArray) {
    return Optional.ofNullable(enumArray).map(Arrays::asList).orElseGet(Collections::emptyList);
  }

  public static <T> List<T> toList(List<List<T>> list) {
    Optional<Stream<List<T>>> ofNullableOptional = Optional.ofNullable(list).map(List::stream);
    Stream<List<T>> orElseGetStream = ofNullableOptional.orElseGet(Stream::empty);
    return orElseGetStream.filter(ObjectUtils::isNotEmpty).flatMap(List::stream).collect(Collectors.toList());
  }

  public static<T> List<List<T>> partition(List<T> list, int size) {
    return ListUtils.partition(list, size);
  }



  //    public void getSaldoEstoqueMapList() {
  //        saldoEstoqueList.stream().map(Produto::new).collect(Collectors.toList());
  //    }
  //
  //    public List<Map.Entry<Produto, List<SaldoEstoque>>> getSaldoEstoqueMapList() {
  //        Map<Produto, List<SaldoEstoque>> produtoSolicitacaoMap = saldoEstoqueList.stream().collect(Collectors
  //        .groupingBy(p -> ((SaldoEstoque) p).getProduto()));
  //        Set<Map.Entry<Produto, List<SaldoEstoque>>> produtoSolicitacaoSet = produtoSolicitacaoMap.entrySet();
  //        return new ArrayList<>(produtoSolicitacaoSet);
  //    }
  //

  //    public static List<String> converterStringArrayToStringListNotNull(String[] stringArray) {
  //        Predicate<String> stringNotEmptyAndNull = new Predicate<String>() {
  //            @Override
  //            public boolean test(String t) {
  //                return t != null && !t.trim().equals("");
  //            }
  //        };
  //        return Optional.ofNullable(stringArray).flatMap(o -> Optional.of(Arrays.asList(o).stream().filter
  //        (stringNotEmptyAndNull).collect(Collectors.toList()))).orElseGet(Collections::emptyList);
  //    }
  //
  //    public static Integer[] nullToEmpty(Integer[] integerArray) {
  //        return Optional.ofNullable(integerArray).flatMap(o -> Optional.of(Arrays.asList(o).stream().filter
  //        (Objects::nonNull).toArray(Integer[]::new))).orElse(new Integer[]{});
  //    }
  //
  //    public static <T extends Entidade> Integer[] converterEntidadeArrayToIdArray(T[] Array) {
  //        return Optional.ofNullable(Array).flatMap(o -> Optional.of(Arrays.asList(o).stream().filter
  //        (Objects::nonNull).filter(y -> y.getId() != null).map(x -> Integer.valueOf(x.getId().toString())).toArray
  //        (Integer[]::new))).orElse(new Integer[]{});
  //    }
  //
  //    public static <T extends Entidade> Integer[] converterEntidadeListaToIdArray(List<T> list) {
  //        return Optional.ofNullable(list).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
  //        .filter(x -> x.getId() != null).map(x -> x.getId()).toArray(Integer[]::new);
  //    }
  //
  //    public static List<Integer> converterIntegerArrayToIntegerListIsNotNull(Integer[] integerArray) {
  //        return Optional.ofNullable(integerArray).flatMap(o -> Optional.of(Arrays.asList(o).stream().filter
  //        (Objects::nonNull).collect(Collectors.toList()))).orElseGet(Collections::emptyList);
  //    }
  //
  //    public static List<Long> converterLongArrayToLongListIsNotNull(Long[] longArray) {
  //        return Optional.ofNullable(longArray).flatMap(o -> Optional.of(Arrays.asList(o).stream().filter
  //        (Objects::nonNull).collect(Collectors.toList()))).orElseGet(Collections::emptyList);
  //    }
  //
  //    //---------------------
  //    public static <T extends Entidade> Integer[] converterEntidadeToIntegerArray(Entidade entidade) {
  //        Integer entidadeId = (entidade != null && entidade.getId() != null) ? Integer.valueOf(entidade.getId()
  //        .toString()) : null;
  //        return (entidadeId != null) ? new Integer[]{entidadeId} : null;
  //    }
  //
  //    public static <T extends Entidade> String[] converterEntidadeToStringArray(Entidade entidade) {
  //        String entidadeId = (entidade != null && entidade.getId() != null) ? (String) entidade.getId().toString()
  //        : null;
  //        return (entidadeId != null) ? new String[]{entidadeId} : null;
  //    }
  //
  //    public static Integer[] converterIntegerListToIntegerArray(List<Integer> integerList) {
  //        return Optional.ofNullable(integerList).orElseGet(Collections::emptyList).stream().filter
  //        (Objects::nonNull).toArray(Integer[]::new);
  //    }
  //
  //    public static <T> T[] converterEntidadeToArray(T entidade) {
  //        return (entidade != null) ? Converter.converterEntidadeToArray(entidade) : null;
  //    }
  //
  //    public static <T> T[] converterEntidadeToArray(List<T> entidadeList) {
  //        return (entidadeList != null && !entidadeList.isEmpty()) ? Converter.converterListEntidadeToArray
  //        (entidadeList) : null;
  //    }
  //
  //    private static class Converter {
  //
  //        private static <T> T[] converterEntidadeToArray(T entidade) {
  //            List<T> asList = Arrays.asList(entidade);
  //            return converterListEntidadeToArray(asList);
  //        }
  //
  //
  //    }
}
