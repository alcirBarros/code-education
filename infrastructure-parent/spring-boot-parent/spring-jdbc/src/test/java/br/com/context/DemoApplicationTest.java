package br.com.context;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
@RequiredArgsConstructor
class DemoApplicationTest {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Test
	void contextLoads() {
		System.out.println("AAAAAAA");
	}

}
