package br.com.integration.integration.interceptor;

import feign.FeignException;
import feign.Response;

public interface FeignHttpExceptionHandler {

    FeignException errorStatus(String methodKey, Response response) throws Exception;

}
