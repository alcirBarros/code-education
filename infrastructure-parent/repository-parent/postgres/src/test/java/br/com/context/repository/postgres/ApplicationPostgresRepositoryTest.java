package br.com.context.repository.postgres;

import br.com.context.repository.postgres.config.LocalStackContainerTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApplicationPostgresRepositoryTest extends LocalStackContainerTest {

//    public static Network network = Network.newNetwork()
//
//    public static MySQLContainer mySql = new MySQLContainer(DockerImageName.parse('mysql:5.7')
//            .withUsername("devuser")
//            .withPassword("devuser")
//            .withInitScript("database/INIT.sql")
//            .withNetwork(network)
//            .withDatabaseName("devdb")
//            .withNetworkAliases(MY_SQL_HOST_NAME) as MySQLContainer
//
//    @DynamicPropertySource
//    static void setup(DynamicPropertyRegistry registry) {
//        registry.add("spring.datasource.url", mysql::getJdbcUrl); // コンテナで起動中のMySQLへ接続するためのJDBC URLをプロパティへ設定
//    }

    @Autowired
    private DataSource dataSource;

    @Test
    public void test01() throws SQLException {
        Connection connection = dataSource.getConnection();
        String catalog = connection.getCatalog();
        assertEquals("postgres", catalog);
    }
}
