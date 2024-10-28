//package br.com.context.base;
//
//import br.com.context.entity.ESocialEventJpaEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.TypedSort;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//interface ReactiveCrud_Repository extends PagingAndSortingRepository<ESocialEventJpaEntity, Long> {
//
////  User findFirstByOrderByLastnameAsc();
////
////  User findTopByOrderByAgeDesc();
////
////  Page<User> queryFirst10ByLastname(String lastname, Pageable pageable);
////
////  Slice<User> findTop3ByLastname(String lastname, Pageable pageable);
////
////  List<User> findFirst10ByLastname(String lastname, Sort sort);
////
////  List<User> findTop10ByLastname(String lastname, Pageable pageable);
////
////  Optional<User> findOptionalByEmailAddress(EmailAddress emailAddress);
//
//}
//
//@SpringBootTest
//class ReactiveCrudRepositoryTest {
//
//  @Test
//  public void findAllSort() {
//    Sort sort = Sort.by("firstname").ascending().and(Sort.by("lastname").descending());
//
//    TypedSort<ESocialEventJpaEntity> person = Sort.sort(ESocialEventJpaEntity.class);
//    Sort sort_ = person.by(ESocialEventJpaEntity::getId).ascending().and(person.by(ESocialEventJpaEntity::getId).descending());
//
//  }
//
//}
