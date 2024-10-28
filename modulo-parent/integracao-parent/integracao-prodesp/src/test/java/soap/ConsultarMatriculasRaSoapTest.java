//package soap;
//
//import br.com.domain.integracao.consultarmatriculasra.ConsultarMatriculasRa;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultarmatriculasra.ConsultarMatriculasRaSoap;
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
//public class ConsultarMatriculasRaSoapTest {
//
//    @Autowired
//    private ConsultarMatriculasRaSoap consultarMatriculasRaSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultarMatriculasRa consultarMatriculasRa = new ConsultarMatriculasRa();
//            consultarMatriculasRa.setInRA("116584739");
//            consultarMatriculasRa.setInDigitoRA("5");
//            consultarMatriculasRa.setInUF("SP");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultarMatriculasRa response = consultarMatriculasRaSoap.consultarMatriculasRa(consultarMatriculasRa, authorizationServicoExterno);
//            System.out.println(response.getConsultarMatriculasRaResponse().getMensagem());
//            System.out.println("ConsultarMatriculasRaSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
