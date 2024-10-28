package br.com.context.junit5.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest()
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Teste ciclo de vida JUnit 5 😀 Java")
public class LifeCycleInstanceJavaTest {

    @BeforeAll
    void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @Test
    @DisplayName("Display Teste1")
    void teste01() {
        System.out.println("teste01");
    }

    @Test
    @DisplayName("Display Teste2")
    void teste02() {
        System.out.println("teste02");
    }


}
