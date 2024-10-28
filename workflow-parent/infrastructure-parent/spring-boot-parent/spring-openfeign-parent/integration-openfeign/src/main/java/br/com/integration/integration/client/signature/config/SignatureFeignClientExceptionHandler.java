//package br.com.integration.integration.client.signature.config;
//
//import br.com.integration.integration.exception.NotFound;
//import br.com.integration.integration.interceptor.FeignHttpExceptionHandler;
//import feign.FeignException;
//import feign.Response;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SignatureFeignClientExceptionHandler implements FeignHttpExceptionHandler {
//
//    @Override
//    public FeignException errorStatus(String methodKey, Response response) {
//        try {
//            int statusCode = response.status();
//            HttpStatus httpStatus = HttpStatus.resolve(statusCode);
//
//            if (HttpStatus.NOT_FOUND.equals(httpStatus)) {
//                return notFound(response);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return FeignException.errorStatus(methodKey, response);
//    }
//
//    public static NotFound notFound(Response response) throws Exception {
//        return new NotFound("NotFound", response);
//    }
//
//}
