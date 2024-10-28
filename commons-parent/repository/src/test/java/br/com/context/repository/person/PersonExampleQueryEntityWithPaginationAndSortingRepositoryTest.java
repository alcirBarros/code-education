//package br.com.context.repository.person;
//
//import br.com.context.model.PersonExampleQueryEntity;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class PersonExampleQueryEntityWithPaginationAndSortingRepositoryTest {
//
//    @Autowired
//    private PersonExampleQueryEntityWithPaginationAndSortingRepository personExampleQueryEntityWithPaginationAndSortingRepository;
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
//        personExampleQueryEntityWithPaginationAndSortingRepository.deleteAll();
//        personExampleQueryEntityWithPaginationAndSortingRepository.saveAll(personExampleQueryEntityList);
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    public void findAllPageable() {
//        Sort nameSort = Sort.by(Sort.Order.asc("name"));
//        Sort socialNameSort = Sort.by("socialName").descending();
//        Sort sort = nameSort.and(socialNameSort);
//        Pageable pageable = PageRequest.of(0, 10, sort);
//        Page<PersonExampleQueryEntity> personExampleQueryEntityList = personExampleQueryEntityWithPaginationAndSortingRepository.findAll(pageable);
//        assertFalse(personExampleQueryEntityList.isEmpty(), "Deve ser verdadeiro");
//    }
//}
