package br.com.context.service.cidade;

import br.com.context.model.cidade.CidadeEntity;
import br.com.context.repository.cidade.CidadeRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public CidadeEntity save(CidadeEntity cidade) {
        return cidadeRepository.save(cidade);
    }

    public List<CidadeEntity> findAll() {
        return cidadeRepository.findAll();
    }
    
    public List<CidadeEntity> findByNomeIgnoreCaseStartingWith(String nome){
        return cidadeRepository.findByNomeIgnoreCaseStartingWith(nome);
    }
}
