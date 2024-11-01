package br.com.service.auxiliar.estadocivil;

import br.com.context.model.estadocivil.model.TipoEstadoCivil;
import br.com.context.repository.auxiliar.estadocivil.TipoEstadoCivilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoEstadoCivilService {

    @Autowired
    private TipoEstadoCivilRepository tipoEstadoCivilRepository;

    public List<TipoEstadoCivil> findAll() {
        return tipoEstadoCivilRepository.findAll();
    }
}