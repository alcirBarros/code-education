package br.com.context.service;

import br.com.context.repository.one.entity.EventEntityDe;
import br.com.context.repository.one.repository.EventEntityDeRepository;
import br.com.context.repository.two.entity.EventEntityDs;
import br.com.context.repository.two.repository.EventEntityDsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EventService {

  private final EventEntityDeRepository eventEntityDeRepository;

  private final EventEntityDsRepository eventEntityDsRepository;

  public Iterable<EventEntityDe> findAll() {
    return eventEntityDeRepository.findAll();
  }

  public Iterable<EventEntityDs> findAlls() {
    return eventEntityDsRepository.findAll();
  }

}
