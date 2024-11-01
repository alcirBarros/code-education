package br.com.context.repository.auxiliar.tipoperidoletivo;

import br.com.context.model.tipoperidoletivo.enumerator.TipoPeriodoLetivoEnum;
import br.com.context.model.tipoperidoletivo.model.TipoPeriodoLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPeriodoLetivoRepository extends JpaRepository<TipoPeriodoLetivo, Integer> {

    public TipoPeriodoLetivo findByTipoPeriodoLetivoEnum(TipoPeriodoLetivoEnum tipoPeriodoLetivoEnum);

}
