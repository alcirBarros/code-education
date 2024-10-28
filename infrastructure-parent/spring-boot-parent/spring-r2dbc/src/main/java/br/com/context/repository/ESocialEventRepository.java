//package br.com.context.repository;
//
//import br.com.context.model.ESocialEventEntity;
//import br.com.context.model.ESocialEventStatus;
//import java.util.UUID;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.r2dbc.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.reactive.ReactiveSortingRepository;
//import org.springframework.stereotype.Repository;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Repository
//public interface ESocialEventRepository extends ReactiveSortingRepository<ESocialEventEntity, Long> {
//
//    Flux<ESocialEventEntity> findAllByStatus(Integer status, Pageable pageable);
//
//    Mono<Long> count();
//
//    Mono<Long> countByStatus(Integer status);
//
//    @Query("select count(*) as count, e.status from esocial_event e where e.client_id = :clientid"
//        + " and e.company_id = :company_id"
//        + " group by 2")
//    Flux<ESocialEventStatus> statusCountByClientIdAndCompanyId(@Param("clientId") UUID clientId, @Param("companyId") UUID companyId);
//
//
//}
