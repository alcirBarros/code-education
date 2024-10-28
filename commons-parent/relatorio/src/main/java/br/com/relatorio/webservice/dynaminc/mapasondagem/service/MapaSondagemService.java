package br.com.relatorio.webservice.dynaminc.mapasondagem.service;

import br.com.relatorio.configuracao.domain.mapasondagem.model.MapaSondagem;
import br.com.relatorio.configuracao.repository.MapaSondagemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapaSondagemService {

    @Autowired
    private MapaSondagemRepository mapaSondagemRepository;
    
    public List<MapaSondagem> findAll() {
        return mapaSondagemRepository.findAll();
    }

}
