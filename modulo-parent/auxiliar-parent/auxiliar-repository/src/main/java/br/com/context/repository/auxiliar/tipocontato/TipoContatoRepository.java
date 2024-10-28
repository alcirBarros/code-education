package br.com.context.repository.auxiliar.tipocontato;

import br.com.context.model.tipocontato.enumerator.TipoContatoEnum;
import br.com.context.model.tipocontato.model.TipoContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContatoRepository extends JpaRepository<TipoContato, Integer> {

    public TipoContato findByTipoContatoEnum(TipoContatoEnum tipoSexoEnum);
    
}
