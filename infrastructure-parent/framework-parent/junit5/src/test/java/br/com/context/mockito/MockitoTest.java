package br.com.context.mockito;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.context.entity.Person;
import br.com.context.repository.PersonRepository;
import br.com.context.service.PersonService;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = PersonService.class)
public class MockitoTest {

  @MockBean
  private PersonRepository personRepository;
  @Autowired
  private PersonService personService;

  @Test
  void test01() {
    var personListMock = List.of(Person.builder().build(), Person.builder().build());
    when(personRepository.findAll()).thenReturn(personListMock);

    List<Person> personList = personService.findAll();
    assertNotNull(personList);
  }

  @Test
  void test02() {
    var personListMock = List.of(Person.builder().build(), Person.builder().build());
    personService.deleteAll(personListMock);

    ArgumentCaptor<List<Person>> deletedEvents = ArgumentCaptor.forClass(List.class);
    verify(personRepository).deleteAll(deletedEvents.capture());
    Assertions.assertTrue(deletedEvents.getValue().stream().findAny().isPresent());
  }

  @Test
  void test03() {
  //  verify(repository, atMostOnce()).count(eq(pageable), anyString());
  }


}
