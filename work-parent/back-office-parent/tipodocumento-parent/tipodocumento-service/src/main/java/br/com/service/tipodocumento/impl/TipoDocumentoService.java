package br.com.service.tipodocumento.impl;

import br.com.context.model.tipodocumento.TipoDocumentoEntity;
import br.com.repository.tipodocumento.TipoDocumentoRepository;
import br.com.service.tipodocumento.ITipoDocumentoService;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TipoDocumentoService implements ITipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @PostConstruct
    private void init() {
        System.out.println(TipoDocumentoService.class.getName());
    }

    @Override
    public TipoDocumentoEntity save(TipoDocumentoEntity instituicao) {
        return tipoDocumentoRepository.save(instituicao);
    }

    @Override
    public TipoDocumentoEntity findById(Integer tipoDocumentoId) {
        return tipoDocumentoRepository.findById(tipoDocumentoId).get();
    }

    @Override
    public List<TipoDocumentoEntity> findAll() {
        return tipoDocumentoRepository.findAll();
    }
}
