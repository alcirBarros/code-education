package br.com.context;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTest {

  @Test
  void contextLoads() {
    int sum = new Calculation().sum(1, 1);
    assertEquals(2, sum);
  }

}
