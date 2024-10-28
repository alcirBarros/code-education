package br.com.webservice.administracao.escola;

import br.com.webserviceclient.configuracao.jersey.client.template.BasicAuthRestTemplate;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EscolaRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private BasicAuthRestTemplate secureRestTemplate;

    @Test
    public void test03() {
        try {
            String url = RestTemplateImp.Administracao.Escola.ESCOLA.getUrl();
            ResponseEntity<String> forEntity = secureRestTemplate.getForEntity(url, String.class);
            System.out.println("br.com.webservice.dispose.classe.ClasseRestTest.test03()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
