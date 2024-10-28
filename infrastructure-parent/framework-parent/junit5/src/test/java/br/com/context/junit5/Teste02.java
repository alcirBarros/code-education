package br.com.context.junit5;

import br.com.context.ApplicationSpringBoot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(classes = ApplicationSpringBoot.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Teste02 {

    @Test
    @DisplayName("Deve realizar com sucesso, teste de regex")
    public void teste01() {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
        Matcher matcher = pattern.matcher("ABC-1234");
        assertTrue(matcher.matches(), "Deve ser verdadeiro");
    }

}
