//package br.com.integration.controller.contract.controller;
//
//import br.com.integration.controller.contract.model.response.ContractResponse;
//import br.com.integration.service.contract.model.response.ContractModelResponseService;
//import br.com.integration.service.contract.service.ContractService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//public class ContractController {
//
//    @Autowired
//    private ContractService contractService;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @GetMapping("/contratos")
//    public ResponseEntity<ContractResponse> findContractByCNPJ(@RequestParam("cnpj")  String cnpj, @RequestParam(value = "lastContractFound", required = false) String lastContractFound) {
//        ContractModelResponseService contractModelResponseService = contractService.findContractByCNPJ(cnpj, lastContractFound);
//        ContractResponse contractResponse = modelMapper.map(contractModelResponseService, ContractResponse.class);
//        return ResponseEntity.ok(contractResponse);
//    }
//}
