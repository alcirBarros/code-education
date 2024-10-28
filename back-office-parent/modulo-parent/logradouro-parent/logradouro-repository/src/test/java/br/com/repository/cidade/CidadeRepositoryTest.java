package br.com.repository.cidade;

import br.com.context.repository.cidade.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class CidadeRepositoryTest {

    @Autowired
    private CidadeRepository cidadeRepository;

//    @Test
//    public void test01() {
//        List<Cidade> cidadeList = cidadeRepository.findByNomeIgnoreCaseStartingWith("São josé dos Campos");
//        assertEquals(1, cidadeList.size());
//    }

}
