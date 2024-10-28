package br.com.context.util;


import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StringUtil {

	// System.out.println(StringUtil.leftPad(123, 5, "0"));
    // resultado 00123
    public static String leftPad(String x, Integer y, String z) {
        return StringUtils.leftPad(x, y, z);
    }

    public static String joinIsNotNull(String[] stringArray, String separator, String delimitadorInicio, String delimitadorFim) {
        List<String> list = Arrays.asList(stringArray);
        return list.stream().map(x -> (x != null) ? delimitadorInicio + x.trim() + delimitadorFim : null).filter(p -> p != null).collect(Collectors.joining(separator));
    }

    public static String joinIsNotNull(Date[] array, String separator, String delimitador) {
        List<Date> asList = Arrays.asList(array);
        return asList.stream().map(x -> (x != null) ? delimitador + x + delimitador : null).filter(Objects::nonNull).collect(Collectors.joining(separator));
    }

    public static String joinIsNotNull(Object[] array, String separator, String delimitador) {
        List<Object> asList = Arrays.asList(array);
        return asList.stream().map(x -> (x != null) ? delimitador + x + delimitador : null).filter(p -> p != null).collect(Collectors.joining(separator));
    }

    /*
     * Método não utilizado
     */
    public static String joinIsNotNull(List<Integer> array, String separator, String delimitador) {
        return array.stream().map(x -> (x != null) ? delimitador + x + delimitador : null).filter(p -> p != null).collect(Collectors.joining(separator));
    }

    public static String joinIsNotEmptyNull(List<String> list, String separator, String delimitador) {
        return joinIsNotEmptyNull(list, separator, delimitador, delimitador);
    }
//    public static String joinIsNotNullDate(List<Date> array, String separator, String delimitador) {
//        return array.stream().map(x -> (x != null) ? delimitador + DateUtils.FORMAT_YYYY_MM_DD.format(x) + delimitador : null).filter(p -> p != null).collect(Collectors.joining(separator));
//    }

    public static <T extends Object> String joinEnum(List<T> enumList, String delimitador, String separator) {
        return Optional.ofNullable(enumList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull).map(x -> delimitador + x + delimitador).collect(Collectors.joining(separator));
    }

    public static String joinIsNotEmptyNull(List<String> list, String separator, String delimitadorInicio, String delimitadorFim) {
        return list.stream().map(x -> (x != null) ? delimitadorInicio + x + delimitadorFim : null).filter(p -> p != null).collect(Collectors.joining(separator));
    }

    public static List<String> joinList(List<String> list, String delimitadorInicio, String delimitadorFim) {
        Predicate<String> stringNotEmptyAndNull = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t != null && !t.trim().equals("");
            }
        };
        return Optional.ofNullable(list).orElseGet(Collections::emptyList).stream().filter(stringNotEmptyAndNull).map(x -> delimitadorInicio + x + delimitadorFim).collect(Collectors.toList());
    }

//    public static void main(String[] args) {
//        String palavra = "UPDATE_word_manager";
//        {
//            String s = toTitle(palavra, false, "_");
//            System.out.println(s);
//        }
//        List<String> value = Arrays.asList("julia", " ", null, null);
//        List<String> joinI = StringUtil.joinList(null, "'%", "%'");
//        System.err.println(joinI);
//    }


//    public static String teste01() {
//        List<String> intLIst = Arrays.asList("A", "B", "C");
//        Collector<CharSequence, ?, String> joining = Collectors.joining(", ", "{", "}");
//        String collect = intLIst.stream().collect(joining);
//        System.out.println(collect);
//    }

    public static String toTitle(String string, boolean capitalizeFirstLetter, String separator) {
        String[] split = string.toLowerCase().split(separator);
        String word = Arrays.stream(split).map((x) -> StringUtils.capitalize(x.trim())).collect(Collectors.joining());
        return capitalizeFirstLetter ? word : word.substring(0, 1).toLowerCase() + word.substring(1);
    }

    public static String isEmpty(String string) {
        return string.isBlank() ? null : string;
    }

    static class User {

        @Override
        public String toString() {
            return id + " - " + username;
        }

        int id;
        String username;

        public User() {
        }

        public User(int id, String username) {
            this.id = id;
            this.username = username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public int getId() {
            return id;
        }
    }

    public void LinkedListTest(String[] args) {

        LinkedList<User> users = new LinkedList<>();
        users.add(new User(1, "User1"));
        users.add(new User(2, "User2"));
        users.add(new User(3, "User3"));

        User user1 = users.stream().filter((user) -> user.getId() == 4).findAny().orElseThrow(() -> new ArithmeticException("Student not found - "));
        System.out.println(user1.toString());


        List<BigDecimal> intLIst = Arrays.asList(BigDecimal.TEN, BigDecimal.TEN);

        BigDecimal debitAdjustments = intLIst.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(debitAdjustments);
    }


    class Registro {
        String nome;
    }

    public static void main(String[] args) {

        String empty = StringUtil.isEmpty("  ,");

        List<String> strings = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

        List<List<String>> list = new ArrayList<>();
        List<String> stringList = null;

        for (var item : strings) {
            if (stringList == null || (stringList.size() % 2) == 0) {
                stringList = new ArrayList<>();
                list.add(stringList);
            }
            stringList.add(item);
        }


        String stringJoining = strings.stream().collect(Collectors.joining(" "));
        String substring = stringJoining.substring(0, Math.min(stringJoining.length(), 5));

        List<String> collect1 = list.stream().flatMap(List::stream).collect(Collectors.toList());


        Map<Integer, String> map = Stream.of("Example", "of", "using", "exists", "collectors").collect(Collectors.toMap(String::length, String::toUpperCase));

        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        //    stringStream.collect(Collectors.groupingBy(Registro::getCliente, Collectors.mapping(Registro::getItens, Collectors.reducing(0, Collection::size, (size1, size2) -> size1 + size2))));


        Map<Integer, List<Integer>> collect = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37).collect(groupingBy(i -> i / 10 * 10));
        System.out.println(map);


    }


}
