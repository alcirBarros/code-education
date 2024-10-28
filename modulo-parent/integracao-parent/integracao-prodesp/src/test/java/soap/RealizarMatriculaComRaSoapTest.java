//package soap;
//
//import br.com.domain.integracao.realizarmatriculacomra.model.RealizarMatriculaInfoComRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.realizarmatriculacomra.service.RealizarMatriculaComRaSoap;
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
//public class RealizarMatriculaComRaSoapTest {
//
//    @Autowired
//    private RealizarMatriculaComRaSoap realizarMatriculaComRaSoap;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            RealizarMatriculaInfoComRA realizarMatriculaInfoComRA = new RealizarMatriculaInfoComRA();
//
//            realizarMatriculaInfoComRA.setInAno("2019");
//
//            realizarMatriculaInfoComRA.setInSerieAno("00");
//            realizarMatriculaInfoComRA.setInTipoEnsino("05");
//            realizarMatriculaInfoComRA.setInNumClasse("234786648");
//            realizarMatriculaInfoComRA.setInDataMatricula("01");
//
//            realizarMatriculaInfoComRA.setInRA("116584739");
//            realizarMatriculaInfoComRA.setInDigitoRA("5");
//            realizarMatriculaInfoComRA.setInUFRA("SP");
//
//            realizarMatriculaInfoComRA.setInMesMatricula("01");
//            realizarMatriculaInfoComRA.setInNumAluno("00");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            RealizarMatriculaInfoComRA response = realizarMatriculaComRaSoap.realizarMatriculaInfoComRA(realizarMatriculaInfoComRA, authorizationServicoExterno);
//            System.out.println(response.getRealizarMatriculaInfoComRAResponse().getMensagem());
//            System.out.println("RealizarMatriculaComRaSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
