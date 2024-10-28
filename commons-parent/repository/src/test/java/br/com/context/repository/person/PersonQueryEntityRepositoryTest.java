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
//import java.util.Optional;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonQueryEntityRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityRepository personExampleQueryEntityRepository;
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
//        personExampleQueryEntityRepository.deleteAll();
//        personExampleQueryEntityRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAll() {
//        List<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityRepository.findAll();
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllFirstByName() {
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findAllFirstByName("Gabrielle Campelo Portugal");
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findDistinctFirstByName() {
//        Optional<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findDistinctFirstByName("Gabrielle Campelo Portugal");
//        assertTrue(baseEntityOptional.isPresent(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllLastByName() {
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findAllLastByName("Gabrielle Campelo Portugal");
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findDistinctLastByName() {
//        Optional<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findDistinctLastByName("Gabrielle Campelo Portugal");
//        assertTrue(baseEntityOptional.isPresent(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllFirstByNameOrderByNameAsc() {
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findAllFirstByNameOrderByNameAsc("Gabrielle Campelo Portugal");
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllFirstByNameOrderByNameDesc() {
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityRepository.findAllFirstByNameOrderByNameDesc("Gabrielle Campelo Portugal");
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//
//
//
//
//    //List<User> findTop10ByLastname(String lastname, Pageable pageable);
//}
