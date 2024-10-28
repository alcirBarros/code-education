package br.com.service.auxiliar.tiporesponsavel;

import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.model.tiporesponsavel.enumerator.TipoResponsavelEnum;
import br.com.context.model.tiporesponsavel.model.TipoResponsavel;
import br.com.context.repository.auxiliar.tiporesponsavel.TipoResponsavelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoResponsavelService {

    @Autowired
    private TipoResponsavelRepository tipoResponsavelRepository;

    public List<TipoResponsavel> findAll() {
        return tipoResponsavelRepository.findAll();
    }

    public TipoContato findByTipoResponsavelEnum(TipoResponsavelEnum tipoResponsavelEnum) {
        return tipoResponsavelRepository.findByTipoResponsavelEnum(tipoResponsavelEnum);
    }
}
