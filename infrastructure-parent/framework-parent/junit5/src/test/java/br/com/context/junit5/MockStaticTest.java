package br.com.context.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

/*
* !Important
* Attention this functionality may not work in Java 20
*/

@SpringBootTest
public class MockStaticTest {

    private static MockedStatic<LocalDateTime> mockLocalDate;

    @BeforeEach
    public void setup() {
        LocalDateTime dateTime = LocalDateTime.now();
        mockLocalDate = mockStatic(LocalDateTime.class);
        when(LocalDateTime.now()).thenReturn(dateTime);
    }

    @AfterEach
    public void afterEach() {
        mockLocalDate.close();
    }

    @Test
    void test01() {
        LocalDateTime now = LocalDateTime.now();
        assertNotNull(now);
    }

    @Test
    void test02() {
        LocalDateTime now = LocalDateTime.now();
        assertNotNull(now);
    }

    @Test
    void test03() {
        LocalDateTime now = LocalDateTime.now();
        assertNotNull(now);
    }
}
