package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonExampleQueryEntityFindByFieldRepositoryTest {

    @Autowired
    private PersonExampleQueryEntityFindByFieldRepository personExampleQueryEntityFindByFieldRepository;

    private List<PersonExampleQueryEntity> personExampleQueryEntityList = List.of(
            PersonExampleQueryEntity.builder()
                    .name("Gabrielle Campelo Portugal")
                    .socialName("Gabrielle Portugal")
                    .dateBirth(LocalDate.of(2000, 01, 01))
                    .build(),
            PersonExampleQueryEntity.builder().build()
    );

    @BeforeAll
    public void BeforeAll() {
        personExampleQueryEntityFindByFieldRepository.deleteAll();
        personExampleQueryEntityFindByFieldRepository.saveAll(personExampleQueryEntityList);
        System.out.println("BeforeEach");
    }

    @Test
    public void findByName() {
        Optional<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityFindByFieldRepository.findByName("Gabrielle Campelo Portugal");
        assertTrue(baseEntityOptional.isPresent(), "Deve ser verdadeiro");
    }

    @Test
    public void findByNameNot() {
        Optional<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityFindByFieldRepository.findByNameNot("William Campelo Portugal");
        assertTrue(baseEntityOptional.isPresent(), "Deve ser verdadeiro");
    }

    @Test
    public void findByNameIsNot() {
        Optional<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityFindByFieldRepository.findByNameIsNot("William Campelo Portugal");
        assertTrue(baseEntityOptional.isPresent(), "Deve ser verdadeiro");
    }
}
