package br.com.context.stream.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SortedTest {

	@Test
	void test01() {
		List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
		Comparator<Integer> comparing = Comparator.comparing(Integer::intValue);
		Stream<Integer> sorted = lista.stream().sorted(comparing);
		List<Integer> collect = sorted.collect(Collectors.toList());
		System.out.println(collect);
	}


	@Test
	void test02() {
		List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
		Comparator<Integer> customComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				 return o1.compareTo(o2);
			}
		};
		Stream<Integer> sorted = list.stream().sorted(customComparator); //ordena os elementos
		List<Integer> collect = sorted.collect(Collectors.toList());
		System.out.println(collect);
	}

	@Test
	void test03() {
		List<Integer> numbers = Arrays.asList(6, 1, 7, 2, 4, 3, 5);
		Collector<Integer, ?, List<Integer>> collect = Collectors.toList();
		Comparator<Integer> reverseOrder = Comparator.reverseOrder();
		Stream<Integer> stream = numbers.stream();
		Stream<Integer> sorted = stream.sorted(reverseOrder);
		List<Integer> integerList = sorted.collect(collect);
		System.out.println(integerList);
	}

	@Test
	void test04() {
		List<Integer> lista = Arrays.asList(0, 5, 8, 7, 2, 3, 1, 6, 4, 9, 10);
		Comparator<Integer> comparing01 = Comparator.comparing(Integer::intValue);
		Comparator<Integer> comparing02 = Comparator.comparing(Integer::intValue).reversed();
		Comparator<Integer> comparing = comparing01.thenComparing(comparing02);
		Stream<Integer> sorted = lista.stream().sorted(comparing);
		List<Integer> collect = sorted.collect(Collectors.toList());
		System.out.println(collect);
	}
}
