package br.com.context.function;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.Test;

public class FunctionTest {


  @Test
  public void test01() {
    var lookupDataSourceKey = "jdbc.datasource";
    final UnaryOperator<String> getPropertyKey = relativeKey -> String.format("%s.%s", lookupDataSourceKey, relativeKey);
    final BinaryOperator<String> propertyWithFallback = (relativeKey, fallback) -> System.getProperty(getPropertyKey.apply(relativeKey), fallback);
    final String serverName = propertyWithFallback.apply("jdbc.datasource.serverName", "localhost");
    System.out.println(serverName);
  }

  @Test
  public void test02() {
    Function<Integer, Integer> function01 = input -> input * 2;
    Integer apply01 = function01.apply(10);

    Function<Integer, Integer> function02 = function01.andThen(a -> a + 1);
    Integer apply02 = function02.apply(10);

    Function<Integer, Integer> doubleFunction1 = this.doubleFunction;
    Function<Integer, Integer> integerIntegerFunction = doubleFunction1.andThen(a -> a);
    Integer apply03 = integerIntegerFunction.apply(10);

    System.out.println(apply01);
    System.out.println(apply02);
    System.out.println(apply03);
  }

  public final Function<Integer, Integer> doubleFunction = new Function<Integer, Integer>() {
    @Override
    public Integer apply(Integer input) {
      return input * 2;
    }
  };


  @Test
  public void test03() {
    Function<String, Boolean> fun = FunctionTest::show;
  }

  static Boolean show(String message){
    return false;
  }

}
