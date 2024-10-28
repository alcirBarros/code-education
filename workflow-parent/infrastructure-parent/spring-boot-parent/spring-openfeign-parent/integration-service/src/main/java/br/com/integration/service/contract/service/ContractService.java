//package br.com.integration.service.contract.service;
//
//import br.com.integration.integration.client.contratos.model.ContractProposalFeignResponse;
//import br.com.integration.integration.client.contratos.service.ContractProposalFeignService;
//import br.com.integration.service.contract.model.response.ContractModelResponseService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class ContractService {
//
//    @Autowired
//    private ContractProposalFeignService contractProposalFeignService;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    public ContractModelResponseService findContractByCNPJ(String cnpj, String ultimoContratoPesquisado) {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("cnpj", "95669678000178");
//        paramMap.put("ultimoContratoPesquisado", "150516016");
//        ContractProposalFeignResponse contratoFeignResponse = contractProposalFeignService.contractProposal(null, null);
//        return modelMapper.map(contratoFeignResponse, ContractModelResponseService.class);
//    }
//
//}
