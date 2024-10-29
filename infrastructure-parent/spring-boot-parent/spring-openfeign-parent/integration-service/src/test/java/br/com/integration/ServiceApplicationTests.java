package br.com.integration;

import br.com.integration.integration.client.simulation.model.SimulationFeignRequest;
import br.com.integration.integration.client.simulation.model.SimulationFeignResponse;
import br.com.integration.integration.client.simulation.service.SimulationFeignService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ServiceApplicationTests {

	@Autowired
	private SimulationFeignService simulationFeignService;

	@Test
	@DisplayName("Teste OK")
	public void whenTheTokenIsRequestedReturnBearerToken() {

		LocalDate localDate = LocalDate.now().plusMonths(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String localDateFormatString = localDate.format(formatter);

		Map<String, String> paramMap = new HashMap<>();

		SimulationFeignRequest simulationRequest = new SimulationFeignRequest();
		simulationRequest.setCnpj("10515479000152");
		simulationRequest.setFirstInstallmentDate(localDateFormatString);
		simulationRequest.setNumberOfInstallments(12);
		simulationRequest.setValue(BigDecimal.valueOf(10000));

		SimulationFeignResponse simulationResponse = simulationFeignService.simulation(paramMap, simulationRequest);
		assertNotNull(simulationResponse);
	}
}
