package br.com.repository;

import br.com.SpringBootApplicationSecurityRepository;
import br.com.repository.login.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = SpringBootApplicationSecurityRepository.class)
public class SecurityRepositoryTest {

    @Autowired
    private SecurityRepository securityRepository;

//    @Test
//    public void test01() {
//        Operador operador = new Operador();
//        operador.setNome("administrador");
//        operador.setUsername("admin");
//
//        Senha senha = new Senha();
//        senha.setPassword(new BCryptPasswordEncoder(16).encode("admin"));
//        operador.setSenha(senha);
//
//
//        Role role = new Role();
//        role.setRole("ROLE_ADMIN");
//        operador.adicionarRole(role);
//
//        Operador save = securityRepository.save(operador);
//        System.out.println(save);
//    }



}
