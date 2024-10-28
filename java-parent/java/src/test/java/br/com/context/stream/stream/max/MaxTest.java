package br.com.context.stream.stream.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaxTest {

	@Test
	void test001() {
		List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
		Stream<Integer> stream = lista.stream();
		Optional<Integer> max = stream.max(Comparator.naturalOrder());/// pega o menor item pela ordem natural
		Integer i = max.orElseThrow();
		System.out.println(i);
	}
}
