package br.com.context.repository.auxiliar.tiponacionalidade;

import br.com.context.model.tiponacionalidade.enumerator.TipoNacionalidadeEnum;
import br.com.context.model.tiponacionalidade.model.TipoNacionalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoNacionalidadeRepository extends JpaRepository<TipoNacionalidade, Integer> {

    public TipoNacionalidade findByTipoNacionalidadeEnum(TipoNacionalidadeEnum tipoNacionalidadeEnum);

}
