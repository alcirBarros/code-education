package br.com.context.service.endereco;


import br.com.context.model.endereco.EnderecoEntity;
import br.com.context.repository.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoEntity save(EnderecoEntity endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<EnderecoEntity> findAll() {
        return enderecoRepository.findAll();
    }
}
