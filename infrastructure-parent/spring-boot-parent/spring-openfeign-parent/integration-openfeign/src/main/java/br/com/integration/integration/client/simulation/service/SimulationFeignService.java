package br.com.integration.integration.client.simulation.service;

import br.com.integration.integration.client.simulation.model.SimulationFeignRequest;
import br.com.integration.integration.client.simulation.model.SimulationFeignResponse;

import java.util.Map;

public interface SimulationFeignService {

    SimulationFeignResponse simulation(Map<String, String> paramMap, SimulationFeignRequest simulationRequest);

}
