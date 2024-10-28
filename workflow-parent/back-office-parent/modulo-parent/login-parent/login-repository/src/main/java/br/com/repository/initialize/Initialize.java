package br.com.repository.initialize;

import br.com.context.model.Operador;
import br.com.context.model.RoleOperador;
import br.com.context.model.Senha;
import br.com.context.annotation.Development;
import br.com.repository.login.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Development
public class Initialize implements CommandLineRunner {

    @Autowired
    private SecurityRepository securityRepository;

    @Override
    public void run(String... args) throws Exception {
        Operador operador = new Operador();
        operador.setNome("administrador");
        operador.setUsername("admin");

        Senha senha = new Senha();
        senha.setPassword(new BCryptPasswordEncoder(16).encode("admin"));
        operador.setSenha(senha);

        RoleOperador roleOperador = new RoleOperador();
    //    roleOperador.setRole("ROLE_ADMIN");
        operador.adicionarRole(roleOperador);

        Operador save = securityRepository.save(operador);
        System.out.println(save);
    }
}
