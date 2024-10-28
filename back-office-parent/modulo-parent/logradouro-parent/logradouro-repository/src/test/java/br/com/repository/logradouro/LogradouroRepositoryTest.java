package br.com.repository.logradouro;

import br.com.context.repository.cidade.CidadeRepository;
import br.com.context.repository.logradouro.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest()
public class LogradouroRepositoryTest {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private LogradouroRepository logradouroRepository;

//    @Test
//    public void test01() {
//        Cidade cidade = cidadeRepository.findById(74).get();
//        List<Logradouro> logradouroList = logradouroRepository.findByCidadeAndNomeLike(cidade, "Castro Alves");
//        assertThat(logradouroList).extracting(Logradouro::getNome).containsOnly("Rua Castro Alves");
//        assertEquals(1, logradouroList.size());
//    }

}
