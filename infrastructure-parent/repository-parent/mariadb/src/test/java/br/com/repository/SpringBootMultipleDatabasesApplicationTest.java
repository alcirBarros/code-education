package br.com.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SpringBootMultipleDatabasesApplicationTest  {

    @Autowired
    private DataSource dataSource;

//    @Test
//    public void mustConnectDatabase() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        String catalog = connection.getCatalog();
//        assertEquals("admin_company", catalog);
//    }

}
