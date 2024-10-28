package br.com.service.auxiliar.tipoensino;

import br.com.context.model.tipoensino.enumerator.TipoEnsinoEnum;
import br.com.context.model.tipoensino.model.TipoEnsino;
import br.com.context.repository.auxiliar.tipoensino.TipoEnsinoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEnsinoService {

    @Autowired
    private TipoEnsinoRepository tipoEnsinoRepository;

    public List<TipoEnsino> findAll() {
        return tipoEnsinoRepository.findAll();
    }

    public TipoEnsino findByCodigo(String codigo) {
        return tipoEnsinoRepository.findByCodigo(codigo);
    }

    public TipoEnsino findByTipoEnsinoEnum(TipoEnsinoEnum tipoEnsinoEnum) {
        return tipoEnsinoRepository.findByTipoEnsinoEnum(tipoEnsinoEnum);
    }

    public TipoEnsino findByDescricaoIgnoreCase(String descricao) {
        return tipoEnsinoRepository.findByDescricaoIgnoreCase(descricao);
    }
}
