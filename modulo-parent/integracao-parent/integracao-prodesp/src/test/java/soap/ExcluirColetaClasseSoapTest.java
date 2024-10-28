//package soap;
//
//import br.com.domain.integracao.excluircoletaclasse.model.ExcluirColetaClasse;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.excluircoletaclasse.ExcluirColetaClasseSoap;
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
//public class ExcluirColetaClasseSoapTest {
//
//    @Autowired
//    private ExcluirColetaClasseSoap excluirColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ExcluirColetaClasse excluirColetaClasse = new ExcluirColetaClasse();
//            excluirColetaClasse.setInAno("2019");
//            excluirColetaClasse.setInNumClasse("232495192");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ExcluirColetaClasse response = excluirColetaClasseSoap.excluirColetaClasse(excluirColetaClasse, authorizationServicoExterno);
//            System.out.println(response.getExcluirColetaClasseResponse().getMensagem());
//            System.out.println("ExcluirColetaClasseSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
