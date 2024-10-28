package com.dinuth.keycloakspringbootmicroservice.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    public FilterRegistrationBean<SegurancaInterceptor> loggingFilter() {
//        FilterRegistrationBean<SegurancaInterceptor> registrationBean   = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new SegurancaInterceptor());
//        registrationBean.addUrlPatterns("/*");
//        return registrationBean;
//    }
}
