package br.com.integration.api.simulation.controller;

import br.com.integration.api.simulation.model.request.SimulationRequest;
import br.com.integration.api.simulation.model.response.SimulationResponse;
import br.com.integration.service.simulation.service.SimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class SimulationController {

    @Autowired
    private SimulationService simulationService;




    @PostMapping
    public ResponseEntity<List<SimulationResponse>> receiveSimulation(@RequestBody SimulationRequest simulationRequest) {

//
//        simulationService.receiveSimulation();

//        String token = tokenService.generateToken();
//
//        SimulationParams simulationDTO = fromSimulationRequestToSimulationDTO(offerRequest);
//        List<Simulation> simulations = simulationService.receiveSimulation(token, simulationDTO);
//
//        return ok(simulations.stream().map(s -> modelMapper.map(s, SimulationResponse.class)).collect(toList()));

        return null;
    }
}
