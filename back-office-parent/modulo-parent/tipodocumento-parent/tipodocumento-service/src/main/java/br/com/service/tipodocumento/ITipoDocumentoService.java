package br.com.service.tipodocumento;

import br.com.context.model.tipodocumento.TipoDocumentoEntity;
import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumentoEntity save(TipoDocumentoEntity instituicao);
    
    public TipoDocumentoEntity findById(Integer tipoDocumentoId);

    public List<TipoDocumentoEntity> findAll();

}
