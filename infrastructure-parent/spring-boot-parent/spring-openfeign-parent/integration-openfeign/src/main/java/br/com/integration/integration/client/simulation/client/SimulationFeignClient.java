package br.com.integration.integration.client.simulation.client;

import br.com.integration.integration.client.simulation.config.SimulationFeignClientConfig;
import br.com.integration.integration.client.simulation.model.SimulationFeignRequest;
import br.com.integration.integration.client.simulation.model.SimulationFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "simulacoes-1231564", configuration = SimulationFeignClientConfig.class)
public interface SimulationFeignClient {

    @PostMapping(value = "/capital-giro/v1/simulacoes")
    SimulationFeignResponse simulation(@RequestParam Map<String, String> paramMap, SimulationFeignRequest simulationRequest);
}
