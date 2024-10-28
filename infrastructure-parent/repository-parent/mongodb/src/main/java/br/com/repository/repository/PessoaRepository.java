package br.com.repository.repository;

import br.com.repository.entity.PessoaEntity;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends ReactiveSortingRepository<PessoaEntity, Integer> {
}
