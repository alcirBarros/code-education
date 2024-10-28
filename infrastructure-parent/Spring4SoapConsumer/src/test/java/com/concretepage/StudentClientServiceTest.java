package com.concretepage;

import com.soapclient.StudentClientService;
import com.concretepage.wsdl.GetArticleByIdResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentClientServiceTest {

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
