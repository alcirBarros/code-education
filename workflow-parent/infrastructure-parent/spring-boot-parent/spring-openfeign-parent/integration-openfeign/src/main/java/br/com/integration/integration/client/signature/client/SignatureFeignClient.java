package br.com.integration.integration.client.signature.client;

import br.com.integration.integration.client.signature.config.SignatureFeignClientConfig;
//import br.com.integration.integration.client.signature.config.SignatureFeignClientExceptionHandler;
import br.com.integration.integration.client.signature.model.SignatureFeignResponse;
//import br.com.integration.integration.annotation.HandleFeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "signature-1231564", configuration = SignatureFeignClientConfig.class)
public interface SignatureFeignClient {

    @GetMapping(value = "/propostas/{id}/assinaturas")
//    @HandleFeignError(SignatureFeignClientExceptionHandler.class)
    SignatureFeignResponse signature(@RequestHeader(HttpHeaders.AUTHORIZATION) String accessToken, @RequestParam Map<String, String> paramMap, @PathVariable(value = "id") Integer proposalNumber);
}
