package br.com.amazon;

import br.com.amazon.services.impl.AthenaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringS3Test {

    @Autowired
    private AthenaService athenaService;

    @Test
    void test01()  {
        athenaService.queryEligible();
    }

}


