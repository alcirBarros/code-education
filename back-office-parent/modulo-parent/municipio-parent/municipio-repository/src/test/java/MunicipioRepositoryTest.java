
import br.com.repository.SpringBootApplicationMunicipioRepository;
import br.com.repository.municipio.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootApplicationMunicipioRepository.class)
public class MunicipioRepositoryTest {

    @Autowired
    private MunicipioRepository escolaRepository;

//    @Test
//    public void test01() {
//        List<Municipio> findAll = escolaRepository.findAll();
//        System.out.println(findAll);
//    }

}
