package br.com.context.optional.ofnullable;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.context.entity.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OfNullableTest {
  @Test
  public void test01() {
    Person person = Person.builder()
        .id(null)
        .name("Gabriel")
        .cpf("12345678901")
        .build();
    Optional.ofNullable(person).map(Person::getName).ifPresent(System.out::println);
    Optional.ofNullable(person).map(Person::getCpf).ifPresent(System.out::println);
  }

  @Test
  public void test02() {
    List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
    List<Integer> integerList = Optional.ofNullable(list).orElseGet(Collections::emptyList);
    assertNotNull(integerList);
  }

  @Test
  public void test03() {
    List<Integer> list = Arrays.asList();
    List<Integer> integerList = Optional.ofNullable(list).orElseGet(Collections::emptyList);
    assertNotNull(integerList);
  }

  @Test
  public void test04() {
    List<Integer> list = null;
    List<Integer> integerList = Optional.ofNullable(list).orElseGet(Collections::emptyList);
    assertNotNull(integerList);
  }


  @Test
  public void test05() {
    Optional<Integer> integer = Optional.ofNullable(1);

    integer.ifPresent(x -> {
      System.out.println("AAAAAAAAA");
    });

    integer.ifPresent(x -> {
      System.out.println("BBBBBBBB");
    });

    assertNotNull(integer);
  }

  @Test
  public void test06() {
    Optional<Optional<Integer>> integer = Optional.of(Optional.of(1));
    Optional<Integer> i = integer.filter(Optional::isPresent).map(Optional::get);
  }

  @Test
  public void test07() {
    Boolean value = null;
    Boolean result = Optional.ofNullable(false).orElseGet(() -> {
      return true;
    } );
    assertNotNull(result);
  }
}
