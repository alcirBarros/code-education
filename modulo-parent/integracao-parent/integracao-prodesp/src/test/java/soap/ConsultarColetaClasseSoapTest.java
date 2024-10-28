//package soap;
//
//import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultarcoletaclasse.ConsultarColetaClasseSoap;
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
//public class ConsultarColetaClasseSoapTest {
//
//    @Autowired
//    private ConsultarColetaClasseSoap consultarColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultarColetaClasse consultarColetaClasse = new ConsultarColetaClasse();
//            consultarColetaClasse.setInAno("2019");
//            consultarColetaClasse.setInNumClasse("234786648");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultarColetaClasse response = consultarColetaClasseSoap.consultarColetaClasse(consultarColetaClasse, authorizationServicoExterno);
//            System.out.println(response.getConsultarColetaClasseResponse().getMensagem());
//            System.out.println("ConsultarColetaClasseSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
