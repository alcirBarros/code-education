package br.com.service.modulo.administracao.escola;

import br.com.context.model.SchoolEntity;
import br.com.context.model.MunicipioEntity;
import br.com.repository.escola.EscolaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscolaService {

    @Autowired
    private EscolaRepository escolaRepository;

    public List<SchoolEntity> findAll() {
        return escolaRepository.findAll();
    }

    public List<SchoolEntity> findByMunicipio(MunicipioEntity municipio) {
        return escolaRepository.findByMunicipio(municipio);
    }
}
