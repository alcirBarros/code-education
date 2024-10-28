//package br.com.context.repository;
//
//import br.com.context.model.ESocialEventEntity;
//import br.com.context.model.ESocialEventStatus;
//import java.util.UUID;
//import lombok.AllArgsConstructor;
//import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
//import org.springframework.data.relational.core.query.Criteria;
//import org.springframework.data.relational.core.query.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Repository
//@AllArgsConstructor
//public class ESocialEventExtRepositoryImpl {
//
//  private final R2dbcEntityTemplate r2dbcTemplate;
//
//  public Flux<ESocialEventEntity> statusCountByClientIdAndCompanyId(@Param("clientId") UUID clientId, @Param("companyId") UUID companyId){
//    Criteria criteria = Criteria.where("client_id").is(clientId).and("company_id").is(companyId);
//    return r2dbcTemplate.select(Query.query(criteria), ESocialEventEntity.class);
//  }
//
//
//
//
//}
