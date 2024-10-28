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
//import org.springframework.data.domain.Sort;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonExampleQueryEntityWithSortingRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityWithSortingRepository personExampleQueryEntityWithSortingRepository;
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
//        personExampleQueryEntityWithSortingRepository.deleteAll();
//        personExampleQueryEntityWithSortingRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAll() {
//        List<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityWithSortingRepository.findAll();
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findAllFirstByNameOrderByNameDescLilit1() {
//        Sort sort = Sort.by("name").ascending().and(Sort.by("dateBirth").descending());
//        List<PersonExampleQueryEntity> baseEntityOptional = personExampleQueryEntityWithSortingRepository.findAllFirstByNameOrderByNameDesc("Gabrielle Campelo Portugal", sort);
//        assertFalse(baseEntityOptional.isEmpty(), "Deve ser verdadeiro");
//    }
//}
