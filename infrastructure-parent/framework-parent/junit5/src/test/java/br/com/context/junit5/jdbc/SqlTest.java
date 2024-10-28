package br.com.context.junit5.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
public class SqlTest {

    @Test
    @Sql({"/schema.sql", "/data.sql"})
    public void testInsert() {
        System.out.println("");
    }

}
