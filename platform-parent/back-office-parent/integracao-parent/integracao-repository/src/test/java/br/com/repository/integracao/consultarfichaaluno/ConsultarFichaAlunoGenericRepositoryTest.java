//package br.com.repository.integracao.consultarfichaaluno;
//
//import br.com.domain.integracao.consultafichaaluno.model.ConsultaRA;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.repository.SpringBootApplicationIntegracaoRepository;
//import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootApplicationIntegracaoRepository.class)
//public class ConsultarFichaAlunoGenericRepositoryTest {
//
//    @Autowired
//    private ConsultarFichaAlunoGenericRepository consultarFichaAlunoGenericRepository;
//
//    @Test
//    public void test01() {
//        ConsultaRA consultaRA = ConsultaRA.criarInstancia();
//        consultaRA.setInRA("000M56444592");
//        consultaRA.setInDigitoRA("");
//        consultaRA.setInUF("MG");
//        ConsultarFichaAluno consultarFichaAluno = consultarFichaAlunoGenericRepository.consultarFichaAluno(consultaRA);
//        assertNotNull(consultarFichaAluno);
//    }
//
//}
