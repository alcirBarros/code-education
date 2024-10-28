package br.com.context.reflection;

import br.com.context.entity.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionTest {


    @Test
    public void teste02() throws IllegalAccessException {

        Person person = new Person();
        person.nome = "AAAAAAAAAAAAAAAAAAAAAAAA";
        person.cpf = "123121313";


        List<Object> collect = Arrays.stream(
            person.getClass().getDeclaredFields()).map(ReflectionTest::apply).collect(Collectors.toList());


        System.out.println();

    }


    public static Object apply(Field field) {
        return field.getAnnotations();
    }

}

