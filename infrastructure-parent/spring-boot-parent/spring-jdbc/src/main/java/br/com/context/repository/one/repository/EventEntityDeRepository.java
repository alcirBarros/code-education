package br.com.context.repository.one.repository;


import br.com.context.repository.one.entity.EventEntityDe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventEntityDeRepository extends CrudRepository<EventEntityDe, Long> {

}