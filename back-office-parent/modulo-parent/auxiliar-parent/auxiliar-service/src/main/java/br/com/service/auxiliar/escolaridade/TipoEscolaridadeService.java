package br.com.service.auxiliar.escolaridade;

import br.com.context.model.escolaridade.model.TipoEscolaridade;
import br.com.context.repository.auxiliar.escolaridade.TipoEscolaridadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoEscolaridadeService {

    @Autowired
    private TipoEscolaridadeRepository tipoEscolaridadeRepository;

    public List<TipoEscolaridade> findAll() {
        return tipoEscolaridadeRepository.findAll();
    }
}