package br.com.context.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.context.entity.ESocialEventReactor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Criteria.CriteriaStep;
import org.springframework.data.relational.core.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Getter
@Setter
@Builder
class EsocialEventCriteria {

  private List<UUID> clientId;
  private List<UUID> companyId;

}

@Repository
class EsocialEventRepository {

  @Autowired
  private R2dbcEntityTemplate r2dbcEntityTemplate;

  public Optional<Criteria> whereEsocialClientId(EsocialEventCriteria esocialEventCriteria) {
    CriteriaStep criteriaStep = Criteria.where("client_id");
    return Optional.ofNullable(esocialEventCriteria.getClientId()).map(criteriaStep::in);
  }

  public Criteria whereList(List<Criteria> criteriaList) {
    Criteria criteria = criteriaList.stream().reduce(Criteria.empty(), Criteria::and);
    Optional<Criteria> criteriaOptional = Optional.of(criteria);
    Optional<Criteria> criteria1 = criteriaOptional.filter(((Predicate<Criteria>) Criteria::isEmpty).negate());
    return criteria1.orElse(Criteria.empty());
  }

  public Query whereList(Pageable pageable, EsocialEventCriteria esocialEventCriteria) {
    List<Criteria> whereList = new ArrayList<>();
    whereEsocialClientId(esocialEventCriteria).ifPresent(whereList::add);
    Criteria criteria = whereList(whereList);
    return Query.query(criteria).with(pageable);
  }

  public Mono<Page<ESocialEventReactor>> findAll(Pageable pageable, EsocialEventCriteria esocialEventCriteria) {
    // var query = whereList(pageable, esocialEventCriteria);

    Criteria criteria = Criteria.where("client_id").in(esocialEventCriteria.getClientId());
    Query query = Query.query(criteria);

    var eventEntityList = r2dbcEntityTemplate.select(ESocialEventReactor.class).matching(query).all().collectList();
    return eventEntityList.map(entityTuples -> new PageImpl<>(entityTuples, pageable, 100l));
  }


}



@SpringBootTest
class ESocialEventRepositoryTest {

  @Autowired
  private EsocialEventRepository eSocialEventRepository;


  @Test
  public void findAllSort() {

    Pageable pageable = PageRequest.of(0, 10);

    UUID companyId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
    UUID clientId = UUID.fromString("ab88124e-c0f9-4d70-83ef-9f8961848762");

    var criteriaBuilder = EsocialEventCriteria.builder();
    criteriaBuilder.companyId(List.of(companyId));
    criteriaBuilder.clientId(List.of(clientId));
    var esocialEventCriteria = criteriaBuilder.build();

    Mono<Page<ESocialEventReactor>> mono = eSocialEventRepository.findAll(pageable, esocialEventCriteria);

    StepVerifier.create(mono.log())
        .assertNext(item ->
          assertEquals(1, item)
        ).expectComplete()
        .verify();
  }

//  @Test
//  public void findAll(){
//    System.out.println("------------");
//    PageRequest pageRequest = PageRequest.of(0, 5);
//    Integer status = 2;
//    Flux<ESocialEventEntity> eSocialEventEntityFlux = eSocialEventRepository.findAllByStatus(status, pageRequest);
//    eSocialEventEntityFlux.subscribe(System.out::println);
//  }

//  @Test
//  public void statusCountByClientIdAndCompanyId(){
//    System.out.println("------------");
//    UUID clientId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
//    UUID companyId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
//
//    Flux<ESocialEventStatus> eSocialEventStatusMono = eSocialEventRepository.statusCountByClientIdAndCompanyId(clientId, companyId);
//    eSocialEventStatusMono.subscribe(System.out::println);
//  }

  //  @Test
  //  public void findAllByStatus() {
  //    StatusESocialEventEnum statusESocialEventEnum = StatusESocialEventEnum.PENDING;
  //    Pageable pageable = PageRequest.of(0, 5);
  //    Mono<Page<ESocialEventEntity>> allByStatus = employeeService.findAllByStatus(statusESocialEventEnum, pageable);
  //    Page<ESocialEventEntity> block = allByStatus.block();
  //    System.out.println(block);
  //  }

}
