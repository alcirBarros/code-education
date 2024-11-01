package br.com.context.repository.cidade;

import br.com.context.model.cidade.CidadeEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, Integer> {

    List<CidadeEntity> findByNomeIgnoreCaseStartingWith(String nome);
}
