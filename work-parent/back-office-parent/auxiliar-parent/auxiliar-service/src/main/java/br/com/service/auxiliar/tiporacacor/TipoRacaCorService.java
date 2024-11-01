package br.com.service.auxiliar.tiporacacor;

import br.com.context.model.tiporacacor.enumerator.TipoRacaCorEnum;
import br.com.context.model.tiporacacor.model.TipoRacaCor;
import br.com.context.repository.auxiliar.tiporacacor.TipoRacaCorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoRacaCorService {

    @Autowired
    private TipoRacaCorRepository tipoRacaCorRepository;

    public List<TipoRacaCor> findAll() {
        return tipoRacaCorRepository.findAll();
    }

    public TipoRacaCor findByTipoRacaCorEnum(TipoRacaCorEnum tipoRacaCorEnum) {
        return tipoRacaCorRepository.findByTipoRacaCorEnum(tipoRacaCorEnum);
    }
}
