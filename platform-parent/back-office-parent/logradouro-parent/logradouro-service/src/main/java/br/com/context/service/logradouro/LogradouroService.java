package br.com.context.service.logradouro;

import br.com.context.model.cidade.CidadeEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import br.com.context.repository.logradouro.LogradouroRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogradouroService {

    @Autowired
    private LogradouroRepository logradouroRepository;

    public LogradouroEntity save(LogradouroEntity logradouro) {
        return logradouroRepository.save(logradouro);
    }

    public List<LogradouroEntity> findAll() {
        return logradouroRepository.findAll();
    }

    public List<LogradouroEntity> findByCidadeAndNomeLike(CidadeEntity cidade, String nome) {
       return logradouroRepository.findByCidadeAndNomeLike(cidade, nome);
    }
}
