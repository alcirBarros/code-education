package br.com.context.repository.h2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
class ApplicationTest {

	@Test
	void contextLoads() {
		System.out.println("appVersion");
	}

}
