package br.com.service.pessoa;


import br.com.domain.pessoa.Pessoa;
import br.com.repository.pessoa.PessoaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa instituicao) {
        return pessoaRepository.save(instituicao);
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
}
