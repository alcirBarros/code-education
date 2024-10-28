//package br.com.context.repository;
//
//import br.com.context.model.ESocialEventEntity;
//import br.com.context.repository.ESocialEventExtRepositoryImpl;
//import java.util.UUID;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import reactor.core.publisher.Flux;
//
//@SpringBootTest
//@ContextConfiguration
//public class ESocialEventExtRepositoryTest {
//
//
//  @Autowired
//  private ESocialEventExtRepositoryImpl eSocialEventExtRepository;
//
//  @Test
//  void readsEntitiesByNameCorrectly() {
//
//    System.out.println("------------");
//
//    UUID clientId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
//    UUID companyId = UUID.fromString("b12e129e-daae-47e3-a2f0-7d7120d34307");
//
//    Flux<ESocialEventEntity> eSocialEventStatusFlux = eSocialEventExtRepository.statusCountByClientIdAndCompanyId(clientId, companyId);
//
//    eSocialEventStatusFlux.subscribe(System.out::println);
//  }
//
//}
