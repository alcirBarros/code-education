package br.com.amazon;

//import br.com.amazon.config.Certifiel;
import com.amazonaws.secretsmanager.sql.AWSSecretsManagerOracleDriver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class AWSSecretsManagerPostgreSQLDriverTest {

//    @Autowired
//    private DataSource dataSource;

//    @Autowired
//    @Qualifier(value = "s3client2")
//    private Certifiel s3client;


    @Test
    public void test01() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        String catalog = connection.getCatalog();
//        assertEquals("postgres", catalog);
//        System.out.println(dataSource);
    }
}
