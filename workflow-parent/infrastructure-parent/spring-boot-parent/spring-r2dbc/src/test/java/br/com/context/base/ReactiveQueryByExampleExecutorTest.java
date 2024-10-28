//package br.com.context.base;
//
//import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;
//
//import br.com.context.entity.ESocialEventReactor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ExampleMatcher;
//import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//import reactor.test.StepVerifier;
//
//@Repository
//interface ReactiveQueryByExampleExecutorRepository extends ReactiveQueryByExampleExecutor<ESocialEventReactor> {
//}
//
//
//@Service
//class ReactiveQueryByExampleExecutorService {
//
//  @Autowired
//  private ReactiveQueryByExampleExecutorRepository reactiveQueryByExampleExecutorRepository;
//
//  public Flux<ESocialEventReactor> findAll(){
//    ESocialEventReactor employee = new ESocialEventReactor();
//
//    ExampleMatcher matcher = ExampleMatcher.matching();
//
//    Example<ESocialEventReactor> example = Example.of(employee, matcher);
//
//    return reactiveQueryByExampleExecutorRepository.findAll(example);
//  }
//
//}
//
//@SpringBootTest
//class ReactiveQueryByExampleExecutorTest {
//
//  @Autowired
//  private ReactiveQueryByExampleExecutorService reactiveQueryByExampleExecutorService;
//
//  @Test
//  public void findAll_Example() {
//    Flux<ESocialEventReactor> flux = reactiveQueryByExampleExecutorService.findAll();
//
//    StepVerifier
//        .create(flux.log())
//        .expectNextCount(24)
//        .expectComplete().verify();
//  }
//
//}
