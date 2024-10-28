//package soap;
//
//import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIE;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultarescolacie.ConsultarEscolaCieSoap;
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
//public class ConsultarEscolaCieSoapTest {
//
//    @Autowired
//    private ConsultarEscolaCieSoap consultarEscolaCieSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultarEscolaCIE consultarEscolaCIE = new ConsultarEscolaCIE();
//            consultarEscolaCIE.setInCodEscola("339805AA");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultarEscolaCIE response = consultarEscolaCieSoap.consultarEscolaCIE(consultarEscolaCIE, authorizationServicoExterno);
//            System.out.println(response.getConsultarEscolaCIEResponse().getMensagem());
//            System.out.println("ConsultarEscolaCieSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
