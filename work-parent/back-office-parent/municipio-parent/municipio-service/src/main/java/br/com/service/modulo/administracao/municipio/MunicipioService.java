package br.com.service.modulo.administracao.municipio;

import br.com.context.model.MunicipioEntity;
import br.com.repository.municipio.MunicipioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {

    @Autowired
    private MunicipioRepository municipioRepository;

    public List<MunicipioEntity> findAll() {
        return municipioRepository.findAll();
    }
}
