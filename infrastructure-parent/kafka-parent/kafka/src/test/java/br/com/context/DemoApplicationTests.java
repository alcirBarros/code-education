package br.com.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

//	@Autowired
//	KafkaTemplate<String, String> kafkaTemplate;

	@Test
	void contextLoads() {
	}

//	@Test
//	void testKafkaListener(CapturedOutput output) {
//		this.kafkaTemplate.send("topic1", "testData");
//
//		await().until(() -> output.getOut().contains("Received: testData"));
//	}
}
