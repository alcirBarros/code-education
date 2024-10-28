package br.com.context.stream.stream.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkipTest {

	@Test
	void test001() {
		List<Integer> lista = Arrays.asList(4, 9, 3);
		Stream<Integer> stream = lista.stream();
		Stream<Integer> skip = stream.skip(2);// ignora os dois primeiros números
		Collector<Integer, ?, List<Integer>> collect = Collectors.toList();
		List<Integer> integerList = skip.collect(collect);
		System.out.println(integerList);
	}










}
