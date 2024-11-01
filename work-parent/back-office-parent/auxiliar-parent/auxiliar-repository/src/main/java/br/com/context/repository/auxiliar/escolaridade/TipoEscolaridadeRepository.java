package br.com.context.repository.auxiliar.escolaridade;

import br.com.context.model.escolaridade.model.TipoEscolaridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEscolaridadeRepository extends JpaRepository<TipoEscolaridade, Integer> {

}
