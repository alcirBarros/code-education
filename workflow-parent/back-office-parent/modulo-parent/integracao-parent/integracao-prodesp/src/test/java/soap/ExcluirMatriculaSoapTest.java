//package soap;
//
//import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.excluirmatricula.ExcluirMatriculaSoap;
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
//public class ExcluirMatriculaSoapTest {
//
//    @Autowired
//    private ExcluirMatriculaSoap incluirColetaClasseSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            ExcluirMatricula excluirMatricula = new ExcluirMatricula();
//            excluirMatricula.setInAno("2019");
//            excluirMatricula.setInNumClasse("232495192");
//
//            excluirMatricula.setInRA("000116091579");
//            excluirMatricula.setInDigitoRA("9");
//            excluirMatricula.setInUF("SP");
//
//            excluirMatricula.setInSerieAno("01");
////            excluirMatricula.setInTipoEnsino("14");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            ExcluirMatricula response = incluirColetaClasseSoap.excluirMatricula(excluirMatricula, authorizationServicoExterno);
//            System.out.println(response.getExcluirMatriculaResponse().getMensagem());
//            System.out.println("ExcluirMatriculaSoapTest.test01()");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
