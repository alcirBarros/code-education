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
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonExampleQueryEntityLikeQueryRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityLikeQueryRepository personExampleQueryEntityLikeQueryRepository;
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
//        personExampleQueryEntityLikeQueryRepository.deleteAll();
//        personExampleQueryEntityLikeQueryRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAllByNameStartingWith() {
//        String name = "Gab";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameStartingWith(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameEndingWith() {
//        String name = "ugal";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameEndingWith(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//
//    @Test
//    public void findAllByNameIgnoreCase() {
//        String name = "GABRIELLE CAMPELO PORTUGAL";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameIgnoreCase(null);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameStartingWithIgnoreCase() {
//        String name = "GaB";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameStartingWithIgnoreCase(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameEndingWithIgnoreCase() {
//        String name = "PORTUGAL";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameEndingWithIgnoreCase(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameContaining() {
//        String name = "Portugal";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameContaining(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameContainingIgnoreCase() {
//        String name = "PORTUGAL";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameContainingIgnoreCase(name);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllByNameStartingWithOrSocialNameStartingWith() {
//        String name = "Gab";
//        String socialName = "Gabri";
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityLikeQueryRepository.findAllByNameStartingWithOrSocialNameStartingWith(name, socialName);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//}
