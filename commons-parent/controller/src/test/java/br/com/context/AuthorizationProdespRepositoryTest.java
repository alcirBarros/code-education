//package br.com.repository.configuracao.authorization;
//
//import br.com.domain.configuracao.servicoexterno.model.ServicoExterno;
//import br.com.domain.configuracao.servicoexterno.model.TipoServicoExterno;
//import br.com.repository.SpringBootMultipleDatabasesApplication;
//import br.com.repository.db.mysql.repository.auxiliar.servicoexterno.AuthorizationProdespRepository;
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootMultipleDatabasesApplication.class)
//public class AuthorizationProdespRepositoryTest {
//
//    @Autowired
//    private AuthorizationProdespRepository authorizationProdespRepository;
//
//    @Test
//    public void test01() {
//        List<ServicoExterno> findAll = authorizationProdespRepository.findAll();
//        assertNotNull(findAll);
//    }
//
//    @Test
//    public void test02() {
//        ServicoExterno servicoExterno = authorizationProdespRepository.findByTipoServicoExterno(TipoServicoExterno.PRODESP);
//        assertNotNull(servicoExterno);
//    }
//
//}
