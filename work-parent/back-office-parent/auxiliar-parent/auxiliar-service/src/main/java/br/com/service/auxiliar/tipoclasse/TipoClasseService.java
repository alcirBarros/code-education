package br.com.service.auxiliar.tipoclasse;

import br.com.context.model.tipoclasse.model.TipoClasse;
import br.com.context.repository.auxiliar.tipoclasse.TipoClasseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoClasseService {

    @Autowired
    private TipoClasseRepository tipoClasseRepository;

    public List<TipoClasse> findAll() {
        return tipoClasseRepository.findAll();
    }

}
