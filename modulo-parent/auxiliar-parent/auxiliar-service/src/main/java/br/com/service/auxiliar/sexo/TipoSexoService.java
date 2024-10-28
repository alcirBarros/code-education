package br.com.service.auxiliar.sexo;

import br.com.context.model.tiposexo.enumerator.TipoSexoEnum;
import br.com.context.model.tiposexo.model.TipoSexo;
import br.com.context.repository.auxiliar.tiposexo.TipoSexoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoSexoService {

    @Autowired
    private TipoSexoRepository tipoSexoRepository;

    public List<TipoSexo> findAll() {
        return tipoSexoRepository.findAll();
    }

    public TipoSexo findByTipoSexoEnum(TipoSexoEnum tipoSexoEnum) {
        return tipoSexoRepository.findByTipoSexoEnum(tipoSexoEnum);
    }

}
