package br.com.context.optional.ifpresentorelse;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ifPresentOrElseTest {

  @Test
  public void test01() {
    List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
    Optional<List<Integer>> listOptional = Optional.ofNullable(null);
    Consumer<List<Integer>> consumer = System.out::println;
    Runnable emptyAction = () -> {
      System.out.println("AAAA");
    };
    listOptional.ifPresentOrElse(consumer, emptyAction);
  }


  @Test
  public void test02() {
    List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
    Optional<List<Integer>> listOptional = Optional.ofNullable(list);
    listOptional.ifPresentOrElse(this::consumer, this::getRunnable);
  }

  public void consumer(List<Integer> integerList) {
    System.out.println(integerList);
  }

  public void getRunnable() {
      System.out.println("AAAA");
  }
}
