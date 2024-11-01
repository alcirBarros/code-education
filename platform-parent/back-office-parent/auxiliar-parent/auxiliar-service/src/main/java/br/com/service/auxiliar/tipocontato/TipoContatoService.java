package br.com.service.auxiliar.tipocontato;

import br.com.context.model.tipocontato.enumerator.TipoContatoEnum;
import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.repository.auxiliar.tipocontato.TipoContatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoContatoService {

    @Autowired
    private TipoContatoRepository tipoContatoRepository;

    public List<TipoContato> findAll() {
        return tipoContatoRepository.findAll();
    }

    public TipoContato findByTipoSexoEnum(TipoContatoEnum tipoContatoEnum) {
        return tipoContatoRepository.findByTipoContatoEnum(tipoContatoEnum);
    }
}
