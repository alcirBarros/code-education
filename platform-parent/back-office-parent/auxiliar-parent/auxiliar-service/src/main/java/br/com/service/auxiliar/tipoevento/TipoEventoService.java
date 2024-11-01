package br.com.service.auxiliar.tipoevento;

import br.com.context.model.tipoevento.model.TipoEvento;
import br.com.context.repository.auxiliar.tipoevento.TipoEventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEventoService {

    @Autowired
    private TipoEventoRepository tipoEventoRepository;

    public List<TipoEvento> findAll() {
        return tipoEventoRepository.findAll();
    }

}
