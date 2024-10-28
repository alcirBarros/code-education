package br.com.context.stream.stream.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForEachTest {

	@Test
	void test001() {
		List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
		Stream<Integer> stream = lista.stream();
		stream.forEach(System.out::println);
	}


}
