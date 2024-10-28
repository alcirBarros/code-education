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
//public class PersonExampleQueryEntityBooleanQueryRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityBooleanQueryRepository personExampleQueryEntityBooleanQueryRepository;
//
//    private List<PersonExampleQueryEntity> personExampleQueryEntityList = List.of(
//            PersonExampleQueryEntity.builder()
//                    .name("Gabrielle Campelo Portugal")
//                    .socialName("Gabrielle Portugal")
//                    .active(true)
//                    .dateBirth(LocalDate.of(2000, 01, 01))
//                    .build(),
//            PersonExampleQueryEntity.builder()
//                    .active(false)
//                    .build()
//    );
//
//    @BeforeAll
//    public void BeforeAll() {
//        personExampleQueryEntityBooleanQueryRepository.deleteAll();
//        personExampleQueryEntityBooleanQueryRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeAll");
//    }
//
//    @Test
//    public void findByActiveTrue() {
//        List<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityBooleanQueryRepository.findByActiveTrue();
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findByActiveFalse() {
//        List<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityBooleanQueryRepository.findByActiveFalse();
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findByActive() {
//        List<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityBooleanQueryRepository.findByActive(false);
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//}
