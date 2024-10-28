package br.com.context.stream.stream.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.context.entity.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CollectTest {

	private Collector<CharSequence, ?, String> joining = Collectors.joining(";");

	@Test
	void test001() {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = numbers.stream();
		List<Integer> integerList = stream.collect(Collectors.toList());

		Optional<Integer> first = integerList.stream().findFirst();

		System.out.println(integerList);
	}

	@Test
	void test003() {
		List<Integer> numbers = Arrays.asList(7, 7, 7, 7, 2, 2, 2, 3, 3, 3, 3, 100, 100, 200, 200);
		Stream<Integer> stream = numbers.stream();
		Set<Integer> collectSet = stream.collect(Collectors.toSet());
		System.out.println(collectSet);
	}

	@Test
	void test004() {
		Person person01 = Person.builder().id(UUID.randomUUID()).name("John").build();
		Person person02 = Person.builder().id(UUID.randomUUID()).name("Piter").build();
		Person person03 = Person.builder().id(UUID.randomUUID()).name("Joy").build();
		Person person04 = Person.builder().id(UUID.randomUUID()).name("Joy").build();

		List<Person> personList = Arrays.asList(person01, person02, person03, person04);

		Function<Person, String> key = Person::getName;
		Function<Person, Person> value = x -> x;

		Collector<Person, ?, LinkedHashMap<String, Person>> map = Collectors.toMap(key, value, (existing, replacement) -> existing, LinkedHashMap::new);
		Collector<Person, ?, Collection<Person>> personCollectionCollector = Collectors.collectingAndThen(map, LinkedHashMap::values);
		List<Person> collect1 = personList.stream().collect(Collectors.collectingAndThen(personCollectionCollector, ArrayList::new));
		assertEquals(3, collect1.size());
	}

	@Test
	void test005() {
		List<Integer> lista = Arrays.asList(1, 2, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4, 9);
		Stream<Integer> stream = lista.stream();
		Collector<Integer, ?, Map<Boolean, List<Integer>>> collect = Collectors.groupingBy(x -> {
			return x % 2 == 0;
		});
		Map<Boolean, List<Integer>> mapa = stream.collect(collect);
		assertEquals(2, mapa.size());
	}

	@Test
	void test006() {
		List<Integer> list01 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list02 = Arrays.asList(6, 7, 8, 9, 10);
		List<List<Integer>> list = Arrays.asList(list01, list02);



		{
			ArrayList<Object> collect01 = list.stream().collect(ArrayList::new, List::addAll, List::addAll);
			System.out.println(collect01);
		}

		{
			ArrayList<Integer> collect01 = list.stream().collect(() -> {
																																		return new ArrayList<Integer>();
																																 }, (bloodGroups, bloodGroup) -> {
																																		bloodGroups.addAll(bloodGroup);
																																 }, (resultList, bloodGroups) -> {
																																		resultList.addAll(bloodGroups);
																																 });
			System.out.println(collect01);
		}
	}

	@Test
	void test07() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream();
		HashSet<Integer> collect = stream.collect(Collectors.toCollection(HashSet::new));
		assertEquals(5, collect.size());
	}

	@Test
	void test08() {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5");
		Stream<String> stream = list.stream();
		Map<String, Integer> collect = stream.collect(Collectors.toMap(String::valueOf, String::length));
		assertEquals(5, collect.size());
	}

}
