package br.com;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JavaApplicationTestes {

    @Test
    public void contextLoads() {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "BBBBBBBBBBBB";

        System.out.println(pessoa);
    }
}
