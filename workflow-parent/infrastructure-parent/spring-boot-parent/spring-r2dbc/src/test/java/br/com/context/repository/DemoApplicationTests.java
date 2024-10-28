//package br.com.context.repository;
//
//import br.com.context.model.Employee;
//import br.com.context.repository.EmployeeReactiveCrudRepository;
//import org.junit.jupiter.api.Test;
//import org.reactivestreams.Subscriber;
//import org.reactivestreams.Subscription;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//import reactor.test.StepVerifier;
//
//@SpringBootTest
//@ContextConfiguration
//class DemoApplicationTests {
//
//  @Autowired
//  private EmployeeReactiveCrudRepository repository;
//
//  @Test
//  void readsAllEntitiesCorrectly() {
//    repository.findAll().as(StepVerifier::create).expectNextCount(1).verifyComplete();
//  }
//
//  @Test
//  void readsEntitiesByNameCorrectly() {
//    repository.findAllFirstByNameOrderByNameAsc("Spring Boot").as(StepVerifier::create).expectNextCount(1)
//        .verifyComplete();
//  }
//
//  @Test
//  void contextLoads() {
//    System.out.println("--------");
//    Flux<Employee> springBoot = repository.findAllFirstByNameOrderByNameAsc("Spring Boot");
//    springBoot.subscribe(new Subscriber<Employee>() {
//      @Override
//      public void onSubscribe(Subscription subscription) {
//        subscription.request(Long.MAX_VALUE);
//      }
//
//      @Override
//      public void onNext(Employee employee) {
//        System.out.println(employee);
//      }
//
//      @Override
//      public void onError(Throwable throwable) {
//
//      }
//
//      @Override
//      public void onComplete() {
//        System.out.println("onComplete");
//      }
//    });
//  }
//
//  @Test
//  void count() {
//    Mono<Long> count = repository.count();
//    count.subscribe(System.out::println);
//  }
//
//}
