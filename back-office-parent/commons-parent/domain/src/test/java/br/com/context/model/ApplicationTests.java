package br.com.context.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        PessoaClassTest build = PessoaClassTest.builder()
                .cpf("")
                .nome("")
                .build();

        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");
    }

}
