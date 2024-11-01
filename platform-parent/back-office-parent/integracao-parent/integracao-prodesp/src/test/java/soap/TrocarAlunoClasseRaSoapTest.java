//package soap;
//
//import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRA;
//import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
//import br.com.soap.SpringBootSoapConsumer;
//import br.com.soap.configuracao.soap.ProdespConfig;
//import br.com.soap.modulo.integration.trocaralunoclassera.TrocarAlunoClasseRaSoap;
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
//public class TrocarAlunoClasseRaSoapTest {
//
//    @Autowired
//    private TrocarAlunoClasseRaSoap fichaAlunoService;
//    @Autowired
//    private ProdespConfig prodespConfig;
//
//    @Test
//    public void test01() {
//        try {
//            TrocarAlunoClasseRA trocarAlunoClasseRA = new TrocarAlunoClasseRA();
//
//            trocarAlunoClasseRA.setInAno("2019");
//
//            trocarAlunoClasseRA.setInRA("116584739");
//            trocarAlunoClasseRA.setInDigitoRA("5");
//            trocarAlunoClasseRA.setInUF("SP");
//
//            trocarAlunoClasseRA.setInDiaTroca("28");
//            trocarAlunoClasseRA.setInMesTroca("02");
//            trocarAlunoClasseRA.setInAnoTroca("2019");
//
////            trocarAlunoClasseRA.setInNumAluno("01");
//            trocarAlunoClasseRA.setInTipoEnsino("05");
//            trocarAlunoClasseRA.setInSerieAno("00");
//
//            trocarAlunoClasseRA.setInNumClasseOrigem("234786648");
//            trocarAlunoClasseRA.setInNumClasseDestino("234786648");
//
//            AuthorizationServicoExterno authorizationServicoExterno = prodespConfig.getAuthorizationServicoExterno();
//            TrocarAlunoClasseRA response = fichaAlunoService.trocarAlunoClasseRA(trocarAlunoClasseRA, authorizationServicoExterno);
//            System.out.println(response.getTrocarAlunoClasseRAResponse().getMensagem());
//            System.out.println("TrocarAlunoClasseRaSoapTest.test01()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
