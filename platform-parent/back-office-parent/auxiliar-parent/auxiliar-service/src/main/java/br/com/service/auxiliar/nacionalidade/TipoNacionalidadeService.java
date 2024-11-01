package br.com.service.auxiliar.nacionalidade;

import br.com.context.model.tiponacionalidade.enumerator.TipoNacionalidadeEnum;
import br.com.context.model.tiponacionalidade.model.TipoNacionalidade;
import br.com.context.repository.auxiliar.tiponacionalidade.TipoNacionalidadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoNacionalidadeService {

    @Autowired
    private TipoNacionalidadeRepository tipoNacionalidadeRepository;

    public List<TipoNacionalidade> findAll() {
        return tipoNacionalidadeRepository.findAll();
    }

    public TipoNacionalidade findByTipoNacionalidadeEnum(TipoNacionalidadeEnum tipoNacionalidadeEnum) {
        return tipoNacionalidadeRepository.findByTipoNacionalidadeEnum(tipoNacionalidadeEnum);
    }

}
