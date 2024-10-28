//package br.com.context.gatway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//
//@Configuration
//public class ApiGatewayConfiguration {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
////                .route(p -> p
////                        .path("/**")
////                        .uri("http://localhost:8080/"))
//
//                .route(p -> {
//                            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAa");
//                            return p
//                                    .path("/pessoa/**")
//                                    .and()
//                                    .method("POST", "PUT", "DELETE")
//                                    .filters(f -> {
//                                        return f.modifyResponseBody(String.class, String.class, (exchange, s) -> {
//                                            return null;
//                                        });
//                                    })
//                                    .uri("http://localhost:8282/");
//                        }
//                )
//
//                .route("vendorModule",
//                        rt -> {
//                            return rt.path("/vendor/**")
//                                    .uri("http://localhost:8082/");
//                        }
//                )
//
//
////                .route(r -> r.path("/get")
////                        .filters(f -> f.prefixPath("/")
////                                .addRequestHeader("X-TestHeader", "foobar"))
////                        .uri("http://httpbin.org"))
////
////
////                .route(r ->
////                        r.host("*.meusite.com.br")
////                                .filters(f -> f.addRequestHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE))
////                                .uri("http://localhost:8081/"))
////
////
////
////                .route(r -> r.path("/employee/**")
////                        .uri("http://localhost:8081/"))
////
////                .route(r -> r.path("/consumer/**")
////                        .uri("http://localhost:8082/"))
////
////
////                .route(p -> p
////                        .path("/image")
////                        .filters(f -> f.addRequestHeader(HttpHeaders.ACCEPT, MediaType.IMAGE_JPEG_VALUE))
////                        .uri("http://httpbin.org"))
//
//                .build();
//    }
//}
