package br.com.integration.integration.exception;

import feign.Response;

public class NotFound extends OpenFeignException {

    public NotFound(String message, Response response) throws Exception {
        super(response.status(), message, response);
    }
}