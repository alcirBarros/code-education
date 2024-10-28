package br.com.context.base;

import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.context.entity.ESocialEventReactor;
import br.com.context.entity.ESocialEventReactor.ESocialEventReactorBuilder;
import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import jakarta.persistence.criteria.CriteriaQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Criteria.CriteriaStep;
import org.springframework.data.relational.core.query.Query;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;



@Service
class R2dbcEntityTemplateRepository {

  @Autowired
  private R2dbcEntityTemplate r2dbcTemplate;

  @Autowired
  private DatabaseClient databaseClient;

  private static ESocialEventReactor apply(Row row, RowMetadata metadata) {
    ESocialEventReactorBuilder builder = ESocialEventReactor.builder();
    builder.id(row.get("id", Long.class));
    return builder.build();
  }

  public Flux<ESocialEventReactor> nativeQuery(){
    return databaseClient.sql("select * from esocial_event").map(R2dbcEntityTemplateRepository::apply).all();
  }

  public Mono<Long> count(){
    return r2dbcTemplate.select(ESocialEventReactor.class).count();
  }


  public void query(String query){
    this.r2dbcTemplate.getDatabaseClient().sql(query).then().subscribe();
  }

  public Flux<ESocialEventReactor> findAllByClientIdEndCompanyId(UUID clientId, UUID companyId, Pageable pageable){
    Sort sort = pageable.getSort();

    Criteria criteria = Criteria.where("name").is("Foo");
    CriteriaStep age1 = Criteria.where("age");
    Criteria age = Criteria.from(age1.greaterThan(42));

    Criteria from = Criteria.from(criteria, age);
    // WHERE name = 'Foo' AND age > 42

    Criteria criteria01 =  Criteria.empty();
    Criteria criteria02 = criteria01.where("client_id").is(clientId);
    Criteria criteria03 = criteria02.and("company_id").is(companyId);

    Criteria criteria04 = Criteria.where("client_period_effect_id").in(List.of(1, 2, 3, 4));

    //Criteria.where("balance").between(min, max);

    Query query01 = Query.query(criteria03);
    Query query02 = query01.columns("id");
    Query query03 = query02.sort(sort);
    Query query04 = query03.with(pageable);



    return r2dbcTemplate.select(ESocialEventReactor.class).matching(query04).all();
  }


  public Flux<ESocialEventReactor> findAll(){
    Criteria criteria01 =  Criteria.empty();

    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    LocalDateTime date = LocalDateTime.parse("2023-01-01T00:00:00.441106", formatter);

//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//    LocalDateTime date = LocalDateTime.parse("2023-01-02T00:00:00.441106", formatter);

//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    String date = LocalDateTime.now().format(formatter.withZone(ZoneId.systemDefault()));



    Criteria criteria02 = Criteria.where("created").greaterThanOrEquals("2023-01-02 00:00:00.441106");

    Criteria from = Criteria.from(criteria01, criteria02);
    Query query01 = Query.query(from);
    return r2dbcTemplate.select(query01, ESocialEventReactor.class);
  }

//  public Flux<ESocialEventReactor> findProductsByPriceGreaterThan(Double price) {
//    return databaseClient.sql("SELECT * FROM products WHERE price > :price")
//            .bind("price", price)
//            .as(ESocialEventReactor.class)
//            .fetch()
//            .all();
//  }


//  public Flux<ESocialEventReactor> findAllByClientIdEndCompanyId(){
//    ESocialEventReactor employee = new ESocialEventReactor();
//
//    ExampleMatcher matcher = ExampleMatcher.matching()
//        .withMatcher("name", endsWith())
//        .withIncludeNullValues()
//        .withIgnorePaths("role");
//
//    Example<ESocialEventReactor> example = Example.of(employee, matcher);
//
//    Flux<ESocialEventReactor> employees = r2dbcTemplate.findAll(example);
//  }

//  public Flux<ESocialEventReactor> delete(@Param("clientId") UUID clientId, @Param("companyId") UUID companyId){
//    r2dbcTemplate.delete(ESocialEventReactor.class).from("other_table")
//        .matching(query(where("firstname").is("John")))
//        .all();
//  }

}

@SpringBootTest
class R2dbcEntityTemplateTest {

  @Autowired
  private R2dbcEntityTemplateRepository r2dbcEntityTemplateRepository;

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  public void nativeQuery() {
    Flux<ESocialEventReactor> query = r2dbcEntityTemplateRepository.nativeQuery();

    StepVerifier.create(query)
        .assertNext(x->{
          assertTrue(true);
        })
        .assertNext(x->{
          assertTrue(true);
        }).verifyComplete();
  }


  @Test
  public void count() {
    Mono<Long> mono = r2dbcEntityTemplateRepository.count();
    mono.subscribe(System.out::println);
    StepVerifier
        .create(mono.log())
        .expectNext(9L)
        .expectComplete()
        .verify();
  }

  @Test
  public void findAllSort() {

    Pageable pageable = PageRequest.of(0, 10);

    UUID clientId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
    UUID companyId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");

    Flux<ESocialEventReactor> flux = r2dbcEntityTemplateRepository.findAllByClientIdEndCompanyId(clientId, companyId, pageable);

    StepVerifier
        .create(flux.log())
        .expectNextCount(9)
        .expectComplete()
        .verify();
  }


  @Test
  public void test() {
    Flux<ESocialEventReactor> findAll = r2dbcEntityTemplateRepository.findAll();

    StepVerifier .create(findAll.log())
        .assertNext(x->{
          assertTrue(true);
        })
        .verifyComplete();
  }


}
