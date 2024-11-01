package br.com.context.api.pessoa;

import br.com.context.model.pessoa.PessoaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaEntity save(PessoaEntity pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<PessoaEntity> findAll() {
        return pessoaRepository.findAll();
    }
}
