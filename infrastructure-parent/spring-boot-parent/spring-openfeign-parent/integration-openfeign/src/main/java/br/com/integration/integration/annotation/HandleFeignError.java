package br.com.integration.integration.annotation;

import br.com.integration.integration.interceptor.FeignHttpExceptionHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HandleFeignError {
    Class<? extends FeignHttpExceptionHandler> value();
}
