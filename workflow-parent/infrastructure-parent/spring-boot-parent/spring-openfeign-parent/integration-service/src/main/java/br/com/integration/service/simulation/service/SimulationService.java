package br.com.integration.service.simulation.service;

import br.com.integration.service.simulation.model.response.SimulationModelResponseService;
import br.com.integration.service.simulation.model.request.SimulationModelRequestService;
import br.com.integration.integration.client.simulation.model.SimulationFeignRequest;
import br.com.integration.integration.client.simulation.model.SimulationFeignResponse;
import br.com.integration.integration.client.simulation.service.SimulationFeignService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SimulationService {

    @Autowired
    private SimulationFeignService simulationFeignService;

    @Autowired
    private ModelMapper modelMapper;

    public List<SimulationModelResponseService> receiveSimulation(SimulationModelRequestService simulationModelRequestService) {

        Map<String, String> paramMap = new HashMap<>();
        SimulationFeignRequest simulationRequest = new SimulationFeignRequest();
        simulationRequest.setCnpj("98563428000147");
        simulationRequest.setFirstInstallmentDate("01.04.2022");
        simulationRequest.setNumberOfInstallments(11);
        simulationRequest.setValue(BigDecimal.valueOf(100000));

        SimulationFeignResponse simulationFeignResponse = simulationFeignService.simulation(paramMap, simulationRequest);
        return modelMapper.map(simulationFeignResponse, null);
    }
}
