package br.com.context;

import br.com.context.model.Endereco;
import br.com.context.model.Pessoa;
import br.com.context.model.PessoaPk;
import br.com.context.reposotory.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class ApplicationSpringBoot implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

    @Override
    public void run(String... args) {
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
