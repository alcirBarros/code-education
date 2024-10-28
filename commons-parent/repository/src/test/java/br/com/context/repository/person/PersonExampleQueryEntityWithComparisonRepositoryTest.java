//package br.com.context.repository.person;
//
//import br.com.context.model.PersonExampleQueryEntity;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonExampleQueryEntityWithComparisonRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityWithComparisonRepository personExampleQueryEntityWithComparisonRepository;
//
//    private List<PersonExampleQueryEntity> personExampleQueryEntityList = List.of(
//            PersonExampleQueryEntity.builder()
//                    .name("Gabrielle Campelo Portugal")
//                    .socialName("Gabrielle Portugal")
//                    .dateBirth(LocalDate.of(2000, 01, 01))
//                    .build(),
//            PersonExampleQueryEntity.builder().build()
//    );
//
//    @BeforeAll
//    public void BeforeAll() {
//        personExampleQueryEntityWithComparisonRepository.deleteAll();
//        personExampleQueryEntityWithComparisonRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAllByDateBirthBetween() {
//        LocalDate localDateStart = LocalDate.of(2000, 01, 01);
//        LocalDate localDateEnd = LocalDate.of(2000, 01, 01);
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityWithComparisonRepository.findAllByDateBirthBetween(localDateStart, localDateEnd);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//}
