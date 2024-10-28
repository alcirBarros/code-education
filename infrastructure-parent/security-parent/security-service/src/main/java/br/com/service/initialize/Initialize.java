package br.com.service.initialize;

import br.com.domain.Operador;
import br.com.domain.Senha;
import br.com.repository.security.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Initialize implements CommandLineRunner {

    @Autowired
    private SecurityRepository securityRepository;
    
    @Override
    public void run(String... args) throws Exception {

        Senha senha = new Senha();
        senha.setPassword(new BCryptPasswordEncoder(16).encode("admin"));

        Operador operador = new Operador();
        operador.setNome("administrador");
        operador.setUsername("admin");
        operador.setSenha(senha);

        securityRepository.save(operador);
    }
}
