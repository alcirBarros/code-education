package br.com.context.repository.auxiliar.tiporacacor;

import br.com.context.model.tiporacacor.enumerator.TipoRacaCorEnum;
import br.com.context.model.tiporacacor.model.TipoRacaCor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRacaCorRepository extends JpaRepository<TipoRacaCor, Integer> {

    public TipoRacaCor findByTipoRacaCorEnum(TipoRacaCorEnum tipoRacaCorEnum);

}
