//package br.com.integration.controller.simulation.controller;
//
//import br.com.integration.controller.simulation.model.request.SimulationRequest;
//import br.com.integration.controller.simulation.model.response.SimulationResponse;
//import br.com.integration.service.simulation.model.response.SimulationModelResponseService;
//import br.com.integration.service.simulation.model.request.SimulationModelRequestService;
//import br.com.integration.service.simulation.service.SimulationService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//import static java.util.stream.Collectors.toList;
//
//@RestController
//@RequestMapping
//public class SimulationController {
//
//    @Autowired
//    private SimulationService simulationService;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @PostMapping
//    public ResponseEntity<List<SimulationResponse>> receiveSimulation(@RequestBody SimulationRequest simulationRequest) {
//        SimulationModelRequestService simulationModelRequestService = modelMapper.map(simulationRequest, SimulationModelRequestService.class);
//        List<SimulationModelResponseService> simulationModelResponseServiceList = simulationService.receiveSimulation(simulationModelRequestService);
//        List<SimulationResponse> simulationResponseList = simulationModelResponseServiceList.stream().map(s -> modelMapper.map(s, SimulationResponse.class)).collect(toList());
//        return ResponseEntity.ok(simulationResponseList);
//    }
//}
