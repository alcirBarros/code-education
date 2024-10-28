//package soap;
//
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultaformacaoclasse.ConsultaFormacaoClasseSoap;
//
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
//public class ConsultaFormacaoClasseSoapTest {
//
//    @Autowired
//    private ConsultaFormacaoClasseSoap consultaFormacaoClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultaFormacaoClasse consultaFormacaoClasse = new ConsultaFormacaoClasse();
//            consultaFormacaoClasse.setInNumClasse("232495192");
//            
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultaFormacaoClasse response = consultaFormacaoClasseSoap.consultaFormacaoClasse(consultaFormacaoClasse, authorizationServicoExterno);
//            System.out.println(response.getConsultaFormacaoClasseResponse().getMensagem());
//            System.out.println("ConsultaFormacaoClasseSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
