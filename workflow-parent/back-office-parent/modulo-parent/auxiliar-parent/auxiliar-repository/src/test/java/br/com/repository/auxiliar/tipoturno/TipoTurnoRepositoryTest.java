//package br.com.repository.auxiliar.tipoturno;
//
//import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
//import br.com.repository.SpringBootMultipleDatabasesApplication;
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.junit.Assert.*;
//import org.springframework.test.context.jdbc.Sql;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootMultipleDatabasesApplication.class)
//public class TipoTurnoRepositoryTest {
//
//    @Autowired
//    private TipoTurnoRepository turnoRepository;
//
//    @Test
//    @Sql(scripts =  {"/integration/sql/data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//    public void contextLoads() {
//        List<TipoTurno> findAll = turnoRepository.findAll();
//        assertNotNull(findAll);
//    }
//
//}
