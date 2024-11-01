package br.com.repository.tipodocumento;

import br.com.context.model.tipodocumento.TipoExigePreenchimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoExigePreenchimentoRepository extends JpaRepository<TipoExigePreenchimentoEntity, Integer> {
    
}
