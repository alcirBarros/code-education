package br.com.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Value("${info.app.version}")
	private String valor;

	@Test
	void contextLoads() {
		System.out.println(valor);
	}

}
