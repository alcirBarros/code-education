//package br.com.context.repository.person;
//
//import br.com.context.model.PersonExampleQueryEntity;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonExampleQueryEntityWithPaginationRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityWithPaginationRepository personExampleQueryEntityWithPaginationRepository;
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
//        personExampleQueryEntityWithPaginationRepository.deleteAll();
//        personExampleQueryEntityWithPaginationRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAllPageable() {
//        Pageable pageable = Pageable.ofSize(10);
//        Page<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityWithPaginationRepository.findAll(pageable);
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//
//    @Test
//    public void findByName() {
//        Pageable pageable = Pageable.ofSize(10);
//        Page<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityWithPaginationRepository.findByName("Gabrielle Campelo Portugal", pageable);
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//}
