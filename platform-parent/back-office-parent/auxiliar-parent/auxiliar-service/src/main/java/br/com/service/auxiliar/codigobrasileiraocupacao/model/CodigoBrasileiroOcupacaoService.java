package br.com.service.auxiliar.codigobrasileiraocupacao.model;

import br.com.context.model.codigobrasileiraocupacao.model.CodigoBrasileiroOcupacao;
import br.com.context.repository.auxiliar.codigobrasileiraocupacao.CodigoBrasileiroOcupacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CodigoBrasileiroOcupacaoService {

    @Autowired
    private CodigoBrasileiroOcupacaoRepository codigoBrasileiroOcupacaoRepository;

    public List<CodigoBrasileiroOcupacao> findAll() {
        return codigoBrasileiroOcupacaoRepository.findAll();
    }
}