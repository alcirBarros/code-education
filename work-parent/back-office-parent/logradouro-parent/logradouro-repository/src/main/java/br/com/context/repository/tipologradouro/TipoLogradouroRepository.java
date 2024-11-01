package br.com.context.repository.tipologradouro;

import br.com.context.model.tipologradouro.TipoLogradouroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLogradouroRepository extends JpaRepository<TipoLogradouroEntity, Integer> {
}
