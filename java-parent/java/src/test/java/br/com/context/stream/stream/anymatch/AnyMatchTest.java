package br.com.context.stream.stream.anymatch;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.context.entity.Person;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ObjectUtils;


@SpringBootTest
class AnyMatchTest {

	@Test
	void test001() {
		Person person01 = new Person();
		person01.setId(UUID.randomUUID());

		Person person02 = new Person();
		person02.setId(UUID.randomUUID());

		List<Person> personList = List.of(person01, person02);
		boolean result01 = personList.stream().map(Person::getId).anyMatch(person01.getId()::equals);
		assertTrue(result01);

		boolean result02 = personList.stream().anyMatch(p -> p.getId().equals(person01.getId()));
		assertTrue(result02);
	}

	@Test
	void test002() {
		Person person = new Person();
		person.setId(UUID.randomUUID());
		List<Person> personList = List.of();

		boolean empty = personList.isEmpty();
	//	assertFalse(empty);

		boolean b1 = Optional.of(personList).stream().anyMatch(ObjectUtils::isEmpty);

		boolean b = personList.stream().anyMatch(ObjectUtils::isEmpty);
		assertFalse(b);
	}


}
