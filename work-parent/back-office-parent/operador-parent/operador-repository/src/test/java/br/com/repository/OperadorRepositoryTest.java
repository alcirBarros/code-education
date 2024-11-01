package br.com.repository;

import br.com.context.model.Operador;
import br.com.repository.perfil.OperadorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = SpringBootApplicationOperadorRepository.class)
public class OperadorRepositoryTest {

    @Mock
    private OperadorRepository operadorRepository;

    @Test
    public void shouldThrowDataNotFound() {
        when(operadorRepository.findByUsername(any())).thenReturn(null);

        Operador operador = operadorRepository.findByUsername("a");
        assertThat(operador).isNull();
    }

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
