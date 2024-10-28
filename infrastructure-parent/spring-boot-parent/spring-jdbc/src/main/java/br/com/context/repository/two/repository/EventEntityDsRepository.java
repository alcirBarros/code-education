package br.com.context.repository.two.repository;

import br.com.context.repository.two.entity.EventEntityDs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventEntityDsRepository extends CrudRepository<EventEntityDs, Long> {

}