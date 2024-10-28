//package soap;
//
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaSoap;
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
//public class ConsultaClasseAlunoPorEscolaSoapTest {
//
//    @Autowired
//    private ConsultaClasseAlunoPorEscolaSoap consultaClasseAlunoPorEscolaSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola = new ConsultaClasseAlunoPorEscola();
//            consultaClasseAlunoPorEscola.setInAnoLetivo("2019");
//            consultaClasseAlunoPorEscola.setInCodEscola("339805");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ConsultaClasseAlunoPorEscola response = consultaClasseAlunoPorEscolaSoap.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola, authorizationServicoExterno);
//
//            System.out.println(response.getConsultaClasseAlunoPorEscolaResponse().getMensagem());
//            System.out.println("ConsultaClasseAlunoPorEscolaSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
