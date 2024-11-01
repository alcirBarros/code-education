package br.com.context.api.pessoa;

import br.com.context.model.pessoa.PessoaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
public class InitializePessoa implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;


    @PostConstruct
    private void init(){
        System.out.print("AAAAAA");
    }

    @Override
    public void run(String... args) throws Exception {

        PessoaEntity pessoa = new PessoaEntity();
        pessoa.setNome("ALCI DE OLIVEIRA BARROS");
        pessoaRepository.save(pessoa);
    }
}
