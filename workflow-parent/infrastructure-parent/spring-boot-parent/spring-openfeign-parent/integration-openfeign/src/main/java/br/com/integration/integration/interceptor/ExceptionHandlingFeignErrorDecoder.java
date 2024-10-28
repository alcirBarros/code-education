package br.com.integration.integration.interceptor;

import br.com.integration.integration.annotation.HandleFeignErrorEvent;
import br.com.integration.integration.exception.RetryableFeiginException;
import feign.FeignException;
import feign.Request;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.encoding.HttpEncoding;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.zip.GZIPInputStream;

@Component
public class ExceptionHandlingFeignErrorDecoder implements ErrorDecoder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlingFeignErrorDecoder.class);

    @Autowired
    private HandleFeignErrorEvent handleFeignErrorEvent;

    @Override
    public Exception decode(String methodKey, Response responseDecode) {
        try {
            Request request = responseDecode.request();
            Response response = getResponse(responseDecode);

            logRequest(request);
            logResponse(response);

            FeignException feignException = errorStatus(methodKey, response);
            if (feignException != null && HttpStatus.valueOf(feignException.status()).isError()) {
                return new RetryableFeiginException(response, feignException);
            }

            return FeignException.errorStatus(methodKey, response);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Response getResponse(Response response) throws IOException {
        Map<String, Collection<String>> headersMap = response.headers();
        Collection<String> contentEncoding = headersMap.get(HttpEncoding.CONTENT_ENCODING_HEADER);

        if (contentEncoding.contains(HttpEncoding.GZIP_ENCODING)) {
            final StringBuilder output = new StringBuilder();
            byte[] compressed = Util.toByteArray(response.body().asInputStream());
            final GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(compressed));
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gis, StandardCharsets.UTF_8));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                output.append(line);
            }
            response = response.toBuilder().body(output.toString().getBytes()).build();
        }

        return response;
    }

    private FeignException errorStatus(String methodKey, Response response) {
        try {
            Map<String, FeignHttpExceptionHandler> exceptionHandlerMap = handleFeignErrorEvent.getExceptionHandlerMap();
            FeignHttpExceptionHandler handler = exceptionHandlerMap.get(methodKey);
            return handler != null ? handler.errorStatus(methodKey, response) : null;
        } catch (Exception e) {
            return null;
        }
    }


    private void logRequest(Request request) {
        LOGGER.info("===========================request begin================================================");
        LOGGER.info("URI         : {}", request.url());
        LOGGER.info("Method      : {}", request.httpMethod().name());
        LOGGER.info("Headers     : {}", request.headers());
        LOGGER.info("Request body: {}", new String(request.body(), Charset.defaultCharset()));
        LOGGER.info("==========================request end================================================");
    }

    private void logResponse(Response response) throws IOException {
        LOGGER.info("============================response begin==========================================");
        LOGGER.info("Status code  : {}", response.status());
        LOGGER.info("Headers      : {}", response.headers());
        LOGGER.info("Response body: {}", new String(Util.toByteArray(response.body().asInputStream()), Charset.defaultCharset()));
        LOGGER.info("=======================response end=================================================");
    }

}
