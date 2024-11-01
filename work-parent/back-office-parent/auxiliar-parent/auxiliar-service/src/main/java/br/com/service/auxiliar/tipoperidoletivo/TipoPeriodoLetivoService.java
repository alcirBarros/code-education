package br.com.service.auxiliar.tipoperidoletivo;

import br.com.context.model.tipoperidoletivo.enumerator.TipoPeriodoLetivoEnum;
import br.com.context.model.tipoperidoletivo.model.TipoPeriodoLetivo;
import br.com.context.repository.auxiliar.tipoperidoletivo.TipoPeriodoLetivoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPeriodoLetivoService {

    @Autowired
    private TipoPeriodoLetivoRepository tipoPeriodoLetivoRepository;

    public List<TipoPeriodoLetivo> findAll() {
        return tipoPeriodoLetivoRepository.findAll();
    }

    public TipoPeriodoLetivo findByTipoPeriodoLetivoEnum(TipoPeriodoLetivoEnum tipoPeriodoLetivoEnum) {
        return tipoPeriodoLetivoRepository.findByTipoPeriodoLetivoEnum(tipoPeriodoLetivoEnum);
    }

}
