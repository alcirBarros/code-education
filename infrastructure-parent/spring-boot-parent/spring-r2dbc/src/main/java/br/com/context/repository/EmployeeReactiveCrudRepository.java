//package br.com.context.repository;
//
//import br.com.context.model.Employee;
//import java.util.UUID;
//import org.springframework.data.repository.reactive.ReactiveCrudRepository;
//import org.springframework.stereotype.Repository;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Repository
//public interface EmployeeReactiveCrudRepository extends ReactiveCrudRepository<Employee, UUID> {
//
//  Mono<Employee> findByName(String helloWorld);
//
//  Flux<Employee> findAllFirstByNameOrderByNameAsc(String name);
//}
