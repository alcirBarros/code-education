//package soap;
//
//import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumo;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultarquadroresumo.ConsultarQuadroResumoSoap;
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
//public class ConsultarQuadroResumoSoapTest {
//
//    @Autowired
//    private ConsultarQuadroResumoSoap incluirColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultarQuadroResumo consultarQuadroResumo = new ConsultarQuadroResumo();
//            consultarQuadroResumo.setInAno("2018");
//            consultarQuadroResumo.setInCodEscola("339805");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultarQuadroResumo response = incluirColetaClasseSoap.consultarQuadroResumo(consultarQuadroResumo, authorizationServicoExterno);
//            System.out.println(response.getConsultarMatriculasRaResponse().getMensagem());
//            System.out.println("ConsultarQuadroResumoSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
