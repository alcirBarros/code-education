package br.com.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
//@Testcontainers
public class OracleTestContainerTest {


//    @Container
//    static final OracleContainer oracle = new OracleContainer("gvenzl/oracle-xe:18.4.0-slim").withEnv("ORACLE_PASSWORD", "oracle");
//
    @Autowired
    private DataSource dataSource;
    @Autowired
    private Environment properties;


    @Test
    public void test01() throws SQLException {
        Connection connection = dataSource.getConnection();
        String catalog = connection.getCatalog();
        assertEquals(null, catalog);
    }
}
