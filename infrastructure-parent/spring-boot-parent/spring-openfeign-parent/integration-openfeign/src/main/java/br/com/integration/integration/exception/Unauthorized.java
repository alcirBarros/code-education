package br.com.integration.integration.exception;

import feign.Response;

public class Unauthorized extends OpenFeignException {

    public Unauthorized(String message, Response response) throws Exception {
        super(response.status(), message, response);
    }
}
