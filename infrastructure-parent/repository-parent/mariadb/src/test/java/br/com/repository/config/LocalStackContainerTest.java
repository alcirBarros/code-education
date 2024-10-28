package br.com.repository.config;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public abstract class LocalStackContainerTest {

    @Container
    static MariaDBContainer localStack = new MariaDBContainer()
            .withDatabaseName("admin_company")
            .withUsername("root")
            .withPassword("root");

    @DynamicPropertySource
    static void properties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", localStack::getJdbcUrl);
        registry.add("spring.datasource.password", localStack::getPassword);
        registry.add("spring.datasource.username", localStack::getUsername);
    }

}
