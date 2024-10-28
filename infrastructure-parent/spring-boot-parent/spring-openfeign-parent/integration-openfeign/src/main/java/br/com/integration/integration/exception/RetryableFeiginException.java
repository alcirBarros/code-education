package br.com.integration.integration.exception;

import feign.FeignException;
import feign.Response;
import feign.RetryableException;

public class RetryableFeiginException extends RetryableException {

    protected final FeignException feignException;

    public RetryableFeiginException(Response response, FeignException feignException) {
        super(response.status(), feignException.getMessage(), response.request().httpMethod(), feignException, null, response.request());
        this.feignException = feignException;
    }

    public FeignException getFeignException() {
        return feignException;
    }
}
