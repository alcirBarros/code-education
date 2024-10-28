package br.com.context.base;

import br.com.context.entity.ESocialEventReactor;
import java.util.List;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

@Getter
@Setter
@ToString
class ESocial {

  @Id
  private Long id;

  @Column(value = "sequential_id")
  private String sequentialId;

  @Column(value = "client_id")
  private UUID clientId;

}

@Repository
interface PageReactiveRepository extends ReactiveCrudRepository<ESocialEventReactor, Long> {

  Flux<ESocial> findAllBy(Pageable pageable);

}

@Service
class PageReactiveService {

  @Autowired
  private PageReactiveRepository pageReactive;

  public Mono<Page<ESocial>> findAllBy(Pageable pageable){
    Mono<List<ESocial>> monoList = this.pageReactive.findAllBy(pageable).collectList();
    Mono<Long> count = this.pageReactive.count();
    return Mono.zip(monoList, count).map((Tuple2<List<ESocial>, Long> t) -> new PageImpl<>(t.getT1(), pageable, t.getT2()));
  }
}

@SpringBootTest
class PageReactiveTest {

  @Autowired
  private PageReactiveService pageReactiveService;

  @Test
  public void findAll_Pageable() {
    Pageable pageable = PageRequest.of(0, 10);
    Mono<Page<ESocial>> monoPageESocial = pageReactiveService.findAllBy(pageable);
    monoPageESocial.subscribe(System.out::println);

    StepVerifier
        .create(monoPageESocial)
        .expectNextCount(1)
        .expectComplete().verify();
  }
}
