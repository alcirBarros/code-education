package br.com.integration.integration.exception;

import feign.FeignException;
import feign.Response;
import feign.Util;

public class OpenFeignException extends FeignException {

    public OpenFeignException(int statusCode, String message, Response response) throws Exception {
        super(statusCode, message, response.request(), Util.toByteArray(response.body().asInputStream()), response.headers());
    }
}
