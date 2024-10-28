package br.com.service.tipoexigepreenchimento.impl;

import br.com.context.model.tipodocumento.TipoExigePreenchimentoEntity;
import br.com.repository.tipodocumento.TipoExigePreenchimentoRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoExigePreenchimentoService {

    @Autowired
    private TipoExigePreenchimentoRepository exigePreenchimentoRepository;

    @PostConstruct
    private void init() {
        System.out.println(TipoExigePreenchimentoService.class.getName());
    }

    public List<TipoExigePreenchimentoEntity> findAll() {
        return exigePreenchimentoRepository.findAll();
    }
}
