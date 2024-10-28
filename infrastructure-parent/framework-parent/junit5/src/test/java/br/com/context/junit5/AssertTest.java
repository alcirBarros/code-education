package br.com.context.junit5;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

import br.com.context.entity.Person;
import br.com.context.service.PersonService;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssertTest {

    @Mock
    private PersonService personServiceMock;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test01() {
        String one = "one";
        String two = "two";
        String three = "three";

        String[] expectedArray = {one, two, three};
        String[] resultArray =  {one, two, three};

        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull(one);
        assertNotEquals(two, three);
        assertArrayEquals(expectedArray, resultArray);
        assertSame("one", one);
        assertNotSame(one, three);
        assertThat(Optional.of(one)).isNotEmpty();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        assertEquals("a message", exception.getMessage());
    }

    @Test
    public void testAssertThrows() {
        doThrow(NullPointerException.class).when(personServiceMock).delete(any());
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            personServiceMock.delete(Person.builder().build());
        }, "Caso não gere o erro, transmitir mensagem.");
        assertEquals(NullPointerException.class, exception.getClass());
    }
}
