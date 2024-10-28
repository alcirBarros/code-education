package br.com.repository.initialize;

import br.com.context.annotation.Development;
import br.com.repository.perfil.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Development
public class Initialize implements CommandLineRunner {

    @Autowired
    private OperadorRepository operadorRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
