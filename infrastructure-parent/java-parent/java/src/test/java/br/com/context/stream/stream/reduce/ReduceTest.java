package br.com.context.stream.stream.reduce;

import br.com.context.entity.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReduceTest {

	@Test
	void test001() {
		Stream<Integer> stream = Stream.of(1, 2);
		Integer reduce = stream.reduce(0, (a, b) -> a + b);
		System.out.println(reduce);
	}

}
