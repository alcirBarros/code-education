package br.com.integration.exception;

import feign.FeignException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity feignException(FeignException ex) {
        int statusCode = ex.status();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //log.warn("Status: " + ex.status() + " Return: " + ex.contentUTF8());
        return new ResponseEntity(ex.contentUTF8(), headers, statusCode);
    }

}
