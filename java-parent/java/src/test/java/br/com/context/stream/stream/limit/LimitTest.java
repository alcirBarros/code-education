package br.com.context.stream.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LimitTest {

	@Test
	void test001() {
		List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
		Stream<Integer> stream = lista.stream();
		Stream<Integer> limit = stream.limit(9);// limita a 9 números
		Collector<Integer, ?, List<Integer>> collect = Collectors.toList();
		List<Integer> integerList = limit.collect(collect);
		System.out.println(integerList);
	}
}
