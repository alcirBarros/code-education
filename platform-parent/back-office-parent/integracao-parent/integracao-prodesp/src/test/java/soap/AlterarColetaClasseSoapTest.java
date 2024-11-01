//package soap;
//
//
//import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.alterarcoletaclasse.AlterarColetaClasseSoap;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@ActiveProfiles({"test"})
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {SpringBootSoapConsumer.class})
//public class AlterarColetaClasseSoapTest {
//
//    @Autowired
//    private AlterarColetaClasseSoap consultarColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        AlterarColetaClasse incluirColetaClasse = new AlterarColetaClasse();
//        incluirColetaClasse.setInAno("2019");
//        incluirColetaClasse.setInNumClasse("3123123");
//
//        AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//        AlterarColetaClasse response = consultarColetaClasseSoap.alterarColetaClasse(incluirColetaClasse, authorizationServicoExterno);
//        System.out.println("AlterarColetaClasseSoapTest.test01()");
//        System.out.println(response.getAlterarColetaClasseResponse().getMensagem());
//    }
//
//}
