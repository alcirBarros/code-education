package br.com.context;

import br.com.context.model.pessoa.PersonEntityEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationSpringBootTest {

	@Test
	void contextLoads() {
		PersonEntityEnum id = PersonEntityEnum.ID;
		System.out.println(id);

	}

}
