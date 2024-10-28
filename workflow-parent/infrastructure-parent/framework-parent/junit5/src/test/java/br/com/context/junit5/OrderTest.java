package br.com.context.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {

  @Test
  @Order(1)
  public void testB() {
    assertTrue(true, "Test 01");
  }

  @Test
  @Order(2)
  public void testA() {
    assertTrue(true, "Test 02");
  }
}
