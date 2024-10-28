package br.com.context.service;

import br.com.context.repository.one.entity.EventEntityDe;
import br.com.context.repository.two.entity.EventEntityDs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootTest
@EnableJdbcRepositories()
public class EventServiceTest {

  @Autowired
  private EventService eventService;

  @Test
  void contextLoads() {
    Iterable<EventEntityDe> all = eventService.findAll();

    Iterable<EventEntityDs> all1 = eventService.findAlls();
    System.out.println("AAAAAAA");
  }

}





