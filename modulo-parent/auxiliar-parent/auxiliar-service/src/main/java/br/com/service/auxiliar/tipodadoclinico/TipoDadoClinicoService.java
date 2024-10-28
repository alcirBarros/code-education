package br.com.service.auxiliar.tipodadoclinico;

import br.com.context.model.tipodadoclinico.model.TipoDadoClinico;
import br.com.context.repository.auxiliar.tipodadoclinico.TipoDadoClinicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDadoClinicoService {

    @Autowired
    private TipoDadoClinicoRepository tipoDadoClinicoRepository;

    public List<TipoDadoClinico> findAll() {
        return tipoDadoClinicoRepository.findAll();
    }
}
