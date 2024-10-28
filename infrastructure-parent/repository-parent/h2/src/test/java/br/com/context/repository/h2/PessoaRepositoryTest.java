package br.com.context.repository.h2;

import br.com.context.model.Endereco;
import br.com.context.model.Pessoa;
import br.com.context.model.PessoaPk;
import br.com.context.reposotory.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Test()
    public void run() {
        Pessoa pessoa = new Pessoa();
        PessoaPk pessoaPk = new PessoaPk();
        pessoaPk.setId(1);
        pessoa.setPessoaPk(pessoaPk);
        pessoa.setNome("nome");
        Endereco endereco = new Endereco();
        endereco.setEndereco("endereco");
        pessoa.setEndereco(endereco);
        Pessoa save = pessoaRepository.save(pessoa);
        System.out.println(save);
    }
}
