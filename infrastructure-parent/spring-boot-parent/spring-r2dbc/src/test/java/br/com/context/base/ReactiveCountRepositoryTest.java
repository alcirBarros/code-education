package br.com.context.base;

import br.com.context.entity.ESocialEventReactor;
import br.com.context.enumerator.StatusEventEnum;
import br.com.context.model.ESocialEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Getter
@Setter
@ToString
class ESocialCount {

  @Column("pending")
  private Integer pending;

  @Column("in_processing")
  private Integer inProcessing;

  @Column("warnings")
  private Integer warnings;

  @Column("validated")
  private Integer validated;
}

@Repository
interface ReactiveSortingRepositoryInterfaceTest extends ReactiveSortingRepository<ESocialEventReactor, Long> {

  Flux<ESocialEventReactor> findAll();

  @Query("SELECT e.* from esocial_event e WHERE e.client_id = :clientId AND e.period_effect = :periodEffect AND e.status in (:statusList) ")
  Flux<ESocialEventReactor> findAllByClientIdAndPeriodEffectAndStatuses (@Param("clientId") UUID clientId, @Param("periodEffect") LocalDate periodEffect,@Param("statusList") List<Integer> statusesList );

  Mono<Long> countByClientIdAndPeriodEffectAndStatusAndEventCode(UUID clientId, LocalDate periodEffect, Integer status, Integer eventCode);

  Flux<ESocialEventReactor> findAllByStatus(Integer status, Pageable pageable);


  @Query("SELECT t FROM esocial_event t WHERE t.status=?1")
  Page<ESocialEventReactor> findByStatusWithPagination(Integer status, Pageable pageable);


  @Query("select "
      + "(select count(id) from esocial_event e where e.status = 2 and e.company_id = :companyId and e.client_id = :clientId) as pending,"
      + "(select count(id) from esocial_event e where e.status = 3 and e.company_id = :companyId and e.client_id = :clientId) as inProcessing,"
      + "(select count(id) from esocial_event e where e.status = 4 and e.company_id = :companyId and e.client_id = :clientId) as warnings,"
      + "(select count(id) from esocial_event e where e.status = 5 and e.company_id = :companyId and e.client_id = :clientId) as validated;")
  Mono<ESocialCount> statusCountByClientIdAndCompanyId(@Param("companyId") UUID companyId, @Param("clientId") UUID clientId);


//  @Query(
//      value = "SELECT * FROM Users ORDER BY id \n-- #pageable\n",
//      countQuery = "SELECT count(*) FROM Users",
//      nativeQuery = true)
//  Page<ESocialCount> findAllUsersWithPagination(Pageable pageable);



}

@SpringBootTest
class ReactiveCountRepositoryTest {

  @Autowired
  private ReactiveSortingRepositoryInterfaceTest pagingAndSortingRepository;









  @Test
  public void test() {

    List<StatusEventEnum> pending = List.of(StatusEventEnum.PENDING, StatusEventEnum.IN_PROCESSING);
    Stream<Integer> integerStream = pending.stream().map(StatusEventEnum::getIdStatus);
    List<Integer> statusEventIntegerList = integerStream.collect(Collectors.toList());
    var events = pagingAndSortingRepository.findAllByClientIdAndPeriodEffectAndStatuses(UUID.randomUUID(), LocalDate.now(), statusEventIntegerList);

    StepVerifier.create(events)
        .assertNext(item ->
                        assertEquals(1, item)
                   ).expectComplete()
        .verify();

  }



  @Test
  public void count() {

    Integer idStatus = 11;
    Mono<Long> longMono = pagingAndSortingRepository.countByClientIdAndPeriodEffectAndStatusAndEventCode(UUID.randomUUID(), LocalDate.now(), 11, 1000);

    StepVerifier
        .create(longMono)
        .assertNext(item ->
                assertNotNull(item)
        ).expectComplete()
        .verify();

  }




  @Test
  public void findAll() {
    Flux<ESocialEventReactor> findAll = pagingAndSortingRepository.findAll();
    StepVerifier.create(findAll).assertNext(item -> assertEquals(item, item)).expectComplete().verify();
  }

  @Test
  public void statusCountByClientIdAndCompanyId() {
    UUID clientId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
    UUID companyId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
    Mono<ESocialCount> eSocialEventStatusReactorEntityFlux = pagingAndSortingRepository.statusCountByClientIdAndCompanyId(clientId, companyId);

    Duration verify = StepVerifier
        .create(eSocialEventStatusReactorEntityFlux)
        .expectNextCount(1)
        .expectComplete().verify();
  }

  @Test
  public void findAll_Sort() {
    Sort sort = Sort.by("id");
    Flux<ESocialEventReactor> findAll = pagingAndSortingRepository.findAll(sort);

    StepVerifier
        .create(findAll)
        .expectNextCount(5)
        .expectComplete().verify();
  }


  @Test
  public void findByStatusWithPagination() {
    StatusEventEnum statusESocialEventEnum = StatusEventEnum.PENDING;
    Integer idStatus = statusESocialEventEnum.getIdStatus();

    Pageable pageable = PageRequest.of(0, 10);
    Page<ESocialEventReactor> byStatusWithPagination = pagingAndSortingRepository.findByStatusWithPagination(idStatus,
                                                                                                             pageable);

    System.out.println(byStatusWithPagination);
  }

  @Test
  public void findAllByStatus() {
    StatusEventEnum statusESocialEventEnum = StatusEventEnum.PENDING;
    Integer idStatus = statusESocialEventEnum.getIdStatus();

    Pageable pageable = PageRequest.of(0, 10);
    Flux<ESocialEventReactor> findAllByStatus = pagingAndSortingRepository.findAllByStatus(idStatus, pageable);





    StepVerifier
        .create(findAllByStatus)
        .expectNextCount(4)
        .expectComplete().verify();
  }




}
