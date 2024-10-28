package br.com.context.repository.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.context.model.PersonExampleQueryEntity;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonExampleQueryEntityDeleteRepositoryTest {

  @Autowired
  private PersonExampleQueryEntityDeleteRepository personExampleQueryEntityDeleteRepository;

  private List<PersonExampleQueryEntity> personExampleQueryEntityList = List.of(
      PersonExampleQueryEntity.builder()
          .name("Gabrielle Campelo Portugal")
          .socialName("Gabrielle Portugal")
          .active(true)
          .dateBirth(LocalDate.of(2000, 01, 01))
          .build(),
      PersonExampleQueryEntity.builder()
          .active(false)
          .build());

  @BeforeAll
  public void BeforeAll() {
    personExampleQueryEntityDeleteRepository.deleteAll();
    personExampleQueryEntityDeleteRepository.saveAll(personExampleQueryEntityList);
    System.out.println("BeforeAll");
  }

  @Test
  public void findByActiveTrue() {
    personExampleQueryEntityDeleteRepository.deleteAllInBatch();
    assertTrue(personExampleQueryEntityDeleteRepository.findAll().isEmpty(), "Deve ser verdadeiro");
  }

  @Test
  public void deleteAllById() {
    Stream<PersonExampleQueryEntity> personExampleQueryEntityStream = personExampleQueryEntityList.stream();
    Stream<UUID> uuidStream = personExampleQueryEntityStream.map(PersonExampleQueryEntity::getUuid);
    List<UUID> collect = uuidStream.collect(Collectors.toList());
    personExampleQueryEntityDeleteRepository.deleteAllById(collect);
    assertTrue(personExampleQueryEntityDeleteRepository.findAll().isEmpty(), "Deve ser verdadeiro");
  }
}
