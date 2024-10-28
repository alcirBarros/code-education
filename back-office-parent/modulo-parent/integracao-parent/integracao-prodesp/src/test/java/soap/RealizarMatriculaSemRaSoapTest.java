//package soap;
//
//import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.realizarmatriculasemra.service.RealizarMatriculaSemRaSoap;
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
//public class RealizarMatriculaSemRaSoapTest {
//
//    @Autowired
//    private RealizarMatriculaSemRaSoap fichaAlunoService;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA = new RealizarMatriculaInfoSemRA();
//            realizarMatriculaInfoSemRA.setInNumClasse("234786648");
//            realizarMatriculaInfoSemRA.setInDataMatricula("01");
//            realizarMatriculaInfoSemRA.setInMesMatricula("03");
//            realizarMatriculaInfoSemRA.setInAno("2019");
//            realizarMatriculaInfoSemRA.setInNumAluno("01");
//            realizarMatriculaInfoSemRA.setInTipoEnsino("05");
//            realizarMatriculaInfoSemRA.setInSerieAno("0");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            RealizarMatriculaInfoSemRA response = fichaAlunoService.realizarMatriculaSemRA(realizarMatriculaInfoSemRA, authorizationServicoExterno);
//            System.out.println(response.getResponse().getMensagem());
//            System.out.println("RealizarMatriculaSemRaSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
