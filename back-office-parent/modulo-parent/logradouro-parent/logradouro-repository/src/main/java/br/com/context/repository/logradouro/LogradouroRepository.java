package br.com.context.repository.logradouro;

import br.com.context.model.cidade.CidadeEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogradouroRepository extends JpaRepository<LogradouroEntity, Integer> {

    @Query("select l from Logradouro l where l.bairro.cidade = :cidade and l.nome like %:nome%")
    List<LogradouroEntity> findByCidadeAndNomeLike(CidadeEntity cidade, @Param("nome") String nome);
}
