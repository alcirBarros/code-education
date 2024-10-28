package br.com.repository;

import br.com.repository.perfil.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootApplicationRoleRepository.class)
public class OperadorRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

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
//        Role role = new Role();
//        role.setRole("ROLE_ADMIN");
//        operador.adicionarRole(role);
//
//        Operador save = operadorRepository.save(operador);
//
//        println(save);
//    }
//
//    @Test
//    public void test02() {
//        Iterable<Operador> findAll = operadorRepository.findAll();
//        assertEquals(1, findAll.spliterator().estimateSize());
//    }

}
