//package com.dinuth.keycloakspringbootmicroservice.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Map;
//import java.util.Optional;
//
//@WebFilter(urlPatterns = {"/*"})
//@Configuration
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class SegurancaInterceptor implements Filter {
//
//    @Autowired
//    private HttpServletRequest teste;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        try {
//
//
//            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//
//            String token = Optional.ofNullable(httpServletRequest.getHeader("Authorization")).map(x -> x.substring(7)).orElse(null);
//
////            JwkProvider provider = new UrlJwkProvider(new URL("http://localhost:8180/auth/realms/realmkeycloak/.well-known/openid-configuration"), null, null);
////            Jwk jwk = provider.get(keyId);
////            Algorithm algorithm1 = Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null);
////            algorithm1.verify(decodedJWT);
//
////            RefreshableKeycloakSecurityContext securityContext = principal.getKeycloakSecurityContext();
////            httpServletRequest.setAttribute(KeycloakSecurityContext.class.getName(), securityContext);
//
//
//            String header = httpServletRequest.getHeader("x-dawson-nonce");
//
//            Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
//
//            String username = Optional
//                    .ofNullable(httpServletRequest.getAttribute("username"))
//                    .map(Object::toString)
//                    .orElse("guest");
//
//            String encoding = Optional.ofNullable(servletRequest.getParameter("encoding")).orElse("UTF-8");
//
//            servletResponse.setCharacterEncoding(encoding);
//            httpServletResponse.setHeader("X-Clacks-Overhead", "GNU Terry Pratchett");
//            httpServletResponse.getWriter().write("Usuário não possui acesso");
//
//            System.out.println("AAAAAAAAAAAA");
//            filterChain.doFilter(servletRequest, servletResponse);
//            System.out.println("BBBBBBBBBBBB");
//        } catch (Exception e) {
//
//        }
//    }
//
//    @Override
//    public void destroy() {
//    }
//
//
//
//
//}
