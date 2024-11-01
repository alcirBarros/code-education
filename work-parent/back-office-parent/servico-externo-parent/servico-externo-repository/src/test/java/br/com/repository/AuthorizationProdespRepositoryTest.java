package br.com.repository;

import br.com.repository.servicoexterno.ServicoExternoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = SpringBootApplicationServiceExternoRepository.class)
public class AuthorizationProdespRepositoryTest {

    @Autowired
    private ServicoExternoRepository servicoExternoRepository;

//    @Test
//    public void test01() {
//        List<ServicoExterno> findAll = servicoExternoRepository.findAll();
//        assertNotNull(findAll);
//    }
//
//    @Test
//    public void test02() {
//        ServicoExterno servicoExterno = servicoExternoRepository.findByTipoServicoExterno(TipoServicoExterno.PRODESP);
//        assertNotNull(servicoExterno);
//    }

}
