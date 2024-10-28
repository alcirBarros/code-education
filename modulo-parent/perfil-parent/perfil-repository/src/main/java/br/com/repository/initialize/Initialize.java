package br.com.repository.initialize;

import br.com.context.annotation.Development;
import br.com.repository.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Development
public class Initialize implements CommandLineRunner {

    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
