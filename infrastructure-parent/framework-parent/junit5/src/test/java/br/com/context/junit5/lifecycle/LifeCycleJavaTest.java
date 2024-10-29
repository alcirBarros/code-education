package br.com.context.junit5.lifecycle;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



@SpringBootTest()
@DisplayName("Teste ciclo de vida JUnit 5 😀 Java")
public class LifeCycleJavaTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll() {
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
