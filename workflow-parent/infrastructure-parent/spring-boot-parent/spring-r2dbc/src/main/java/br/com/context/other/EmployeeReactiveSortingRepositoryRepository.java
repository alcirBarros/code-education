//package br.com.context.other;
//
//import br.com.context.model.Employee;
//import java.util.UUID;
//import org.reactivestreams.Publisher;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.reactive.ReactiveSortingRepository;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//public interface EmployeeReactiveSortingRepositoryRepository extends ReactiveSortingRepository<Employee, UUID> {
//
////  Mono<Integer> deleteByLastname(String lastname);
////
////  Mono<Void> deletePersonByLastname(String lastname);
////
////  Mono<Boolean> deletePersonByLastname(String lastname);
////
////  Flux<Employee> findByFirstname(String firstname);
////
////  Flux<Employee> findByFirstname(Publisher<String> firstname);
////
////  Flux<Employee> findByFirstnameOrderByLastname(String firstname, Pageable pageable);
////
////  Mono<Employee> findByFirstnameAndLastname(String firstname, String lastname);
////
////  Mono<Employee> findFirstByLastname(String lastname);
////
////  @Query("SELECT * FROM employee WHERE lastname = :lastname")
////  Flux<Employee> findByLastname(String lastname);
////
////  @Query("SELECT firstname, lastname FROM employee WHERE lastname = $1")
////  Mono<Employee> findFirstByLastname(String lastname);
//
//}
