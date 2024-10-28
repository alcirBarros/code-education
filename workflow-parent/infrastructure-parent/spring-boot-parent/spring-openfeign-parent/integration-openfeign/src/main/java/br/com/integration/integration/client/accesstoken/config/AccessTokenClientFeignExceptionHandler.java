//package br.com.integration.integration.client.accesstoken.config;
//
//import br.com.integration.integration.exception.Unauthorized;
//import br.com.integration.integration.interceptor.FeignHttpExceptionHandler;
//import feign.FeignException;
//import feign.Response;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AccessTokenClientFeignExceptionHandler implements FeignHttpExceptionHandler {
//
//    @Override
//    public FeignException errorStatus(String methodKey, Response response) throws Exception {
//        int statusCode = response.status();
//        HttpStatus httpStatus = HttpStatus.resolve(statusCode);
//        if (HttpStatus.BAD_REQUEST.equals(httpStatus)) {
//            return unauthorized(response);
//        }
//        return FeignException.errorStatus(methodKey, response);
//    }
//
////    public AException handle(Response response) {
////        try {
////            Reader reader = response.body().asReader(StandardCharsets.UTF_8);
////            String json = IOUtils.toString(reader);
////            return objectMapper.readValue(json, AException.class);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return null;
////    }
////
////    public static class AException extends OpenFeignNotFoundException {
////        String error;
////        String error_description;
////
////        public AException(String error, String error_description) {
////            super(request);
////        }
////    }
//
//
//    public static FeignException unauthorized(Response response) throws Exception {
//        return new Unauthorized("Unauthorized", response);
//    }
//
//}
