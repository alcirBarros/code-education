package br.com.integration.integration.client.simulation.service;

import br.com.integration.integration.client.simulation.client.SimulationFeignClient;
import br.com.integration.integration.client.simulation.model.SimulationFeignRequest;
import br.com.integration.integration.client.simulation.model.SimulationFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SimulationFeignServiceImpl implements SimulationFeignService {

    @Autowired
    private SimulationFeignClient ofertaAtivoClient;
    @Autowired
    private AuthorizationService authorizationService;

//    @Autowired
//    private RestTemplate restTemplate;

    @Override
    public SimulationFeignResponse simulation(Map<String, String> paramMap, SimulationFeignRequest simulationRequest) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(paramMap);

//        DefaultResponseErrorHandler defaultResponseErrorHandler = new DefaultResponseErrorHandler() {
//            @Override
//            public void handleError(ClientHttpResponse response) throws IOException {
//                InputStream inputStream = response.getBody();
//                byte[] bytes = inputStream.readAllBytes();
//                String text = new String(bytes);
//                System.out.println(text);
//            }
//        };
//
//        restTemplate.setErrorHandler(defaultResponseErrorHandler);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setBearerAuth("RkZQMcnGCApp_LdMXlyB87FBhlxtGhWnjhQR-7a4JWchGbLt-jcvcr4rGP2eXnztovjo8H0PC8IHb252RoOSug.iUjHB7ymk-DokHfvVU-y1r-bK3_V2QPnkPKvFuNBgD-Z0EpTZjVduLzPQl-L0pUyFJilwcxILcsh6ylvMULn_jpq_pPr4ozuvdgPgBx4Omiukcsw8MD5HzeyleAvfOdYihGWtXvpkVbMBTyIxp3f2-tCNuE7ucrsy38VhR9oClnpNC5owIPi-RBHNe717YhaTnZ3dTA27qdK5Aa0aIh5RNDxXQP199rKocDPgIDc_ldM6JKCSYpVNvPalxqW29YfbtXbYrezwR_UDOmSkubx90l0GyiR3gAUTIgNNAczsjyPcCMDxtGxYYaiY2lj2yieFmlKw-9in3jvd5lalsstavR1UaAAms41DXvq-kcW-7VLEIjFwZ6VG2i0YQIkEWjVXszGOGc9D4fmihmOzQMrWxQxCAtNY6SNrdC8MlnqCtToE8rnuzNIum5Tl6BSiNGlCYZxIpnOWAk7U-XSzCB1-IXKAtsGu1RBv4pX6OPDWpSzMCGF8USwNubTGNNc4FKmo-f2DMAx7sHFad9xJVif2GexFKocqtUtZ5W5S5JhBo_5YfadeE4qBJMV0nP9FbZjfOp9RMGXdDyUYOYKDPaffLumT-lv65JI3a0GOe3rKGh5D4XBHxpJR7tNnVs_xFAae_aarRGkgbKBhpxOz5vhIF4Dk6eV9QtbX01ebz2O23ifWDVWIZ5sdkNi5Hq1B1neU7_tU5PaG8sozaM2_tKdTXBzRlNruZ93BKalZBqWVGsnuUn7tuFGML0CNDaWrKY0cbzhIdTVdklbfRBDVT9lfMEpH2TrtvFPBwNWU2u1ttHCKlq4ORxl3yOL4Ri8MFTwRc4NBFavubjSJMe-MWCd7mKR0f126hZ3rcYxg7RXkVqJ5c2mbgNIET64hxBich0Bc9jbpcddr6i5PUmYNf9M3i9T0lhDUg0qsfsa95Yeb2nUQghCoC4wZ1tbCk78io51xyjEvTnsRpA8R0BArsmDA2TexHjf9MI6SSv4AEzHgiA.0np29H4Ufzo88721zBCe9VbSQv1iBH9qeCOdoIKjFkt4EnUMBfGItryzsA5NJ1f9vojvS-37CtyFWBscckfBJQ");
//        HttpEntity<SimulationFeignRequest> request = new HttpEntity<>(simulationRequest, headers);
//        ResponseEntity<SimulationFeignResponse> simulationFeignResponseResponseEntity = restTemplate.postForEntity("https://api-ip.bb.com.br/capital-giro/v2/simulacoes?gw-dev-app-key=f6f54bb406bbef90134b348990050756b911a5b0", request, SimulationFeignResponse.class, paramMap);

        return ofertaAtivoClient.simulation(paramMapApplicationKey, simulationRequest);
    }
}
