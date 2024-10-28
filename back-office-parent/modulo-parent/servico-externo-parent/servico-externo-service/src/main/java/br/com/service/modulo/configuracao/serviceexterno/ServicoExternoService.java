package br.com.service.modulo.configuracao.serviceexterno;

import br.com.context.model.servicoexterno.model.ServicoExterno;
import br.com.context.model.servicoexterno.model.TipoServicoExterno;
import br.com.repository.servicoexterno.ServicoExternoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoExternoService {

    @Autowired
    private ServicoExternoRepository servicoExternoRepository;

    public List<ServicoExterno> findAll() {
        return servicoExternoRepository.findAll();
    }

    public ServicoExterno findByTipoServicoExterno(TipoServicoExterno tipoServicoExterno) {
        return servicoExternoRepository.findByTipoServicoExterno(tipoServicoExterno);
    }
}
