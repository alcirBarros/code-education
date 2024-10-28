package br.com.webservice.dispose.classe;

import br.com.webserviceclient.configuracao.jersey.client.template.BasicAuthRestTemplate;
import br.com.webserviceclient.configuracao.jersey.client.template.RestTemplateImp;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles({"test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ClasseRestTest {

    @Autowired
    @Qualifier(value = RestTemplateImp.Prodesp.QUALIFIER)
    private BasicAuthRestTemplate secureRestTemplate;

    @Test
    public void test03() {
        try {

//            String url = RestTemplateImp.Dispose.Security.CLASSE.getUrl();
            String url = "http://homologacao.multfacilcomercial.com.br:8080/web/webservice/private/classe";
            ResponseEntity<List<EscolaPojo>> response = secureRestTemplate.exchange(url, HttpMethod.GET, null, new EscolaPojoReference());
            List<EscolaPojo> country = response.getBody();
            System.out.println(country);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class EscolaPojoReference extends ParameterizedTypeReference< List<EscolaPojo>> {

    }

}
