package br.com.service.auxiliar.tipodocumento;

import br.com.context.model.tipodocumento.model.TipoDocumento;
import br.com.context.repository.auxiliar.tipodocumento.TipoDocumentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> findAll() {
        return tipoDocumentoRepository.findAll();
    }
}
