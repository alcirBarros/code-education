package br.com.context.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculationServiceTest {

	@Autowired
	private CalculationService calculationService;

	@Test
	void contextLoads() {
		Integer sum = calculationService.sum(1, 1);
		assertEquals(2, sum);
	}

}
