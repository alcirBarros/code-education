package br.com.web;

import br.com.web.modulo.integracao.soap.StudentClientService;
import com.concretepage.wsdl.GetArticleByIdResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ApplicationTests {

    @Autowired
    private StudentClientService studentClientService;

    @Test
    public void contextLoads() {
        GetArticleByIdResponse response = studentClientService.getStudentById(0);
        System.out.println("Name:" + response.getArticleInfo().getTitle());
        System.out.println("Age:" + response.getArticleInfo().getCategory());
        System.out.println("Class:" + response.getArticleInfo().getArticleId());
    }

}
