//package br.com.context.repository;
//
//import br.com.context.model.Employee;
//import java.util.UUID;
//import lombok.AllArgsConstructor;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
//import org.springframework.data.relational.core.query.Criteria;
//import org.springframework.data.relational.core.query.Query;
//import reactor.core.publisher.Mono;
//
//@AllArgsConstructor
//public class ExtensionRepositoryImpl implements ExtensionRepository<Employee, UUID> {
//
//  private final R2dbcEntityTemplate r2dbcTemplate;
//
//  @Override
//  public Mono<Long> count(Pageable pageable, String filter) {
////    final Criteria criteria = CriteriaUtils.from(filter, dictionary, companyId);
////    return r2dbcTemplate.count(Query.query(criteria).with(pageable), Employee.class);
//    return null;
//  }
//}
