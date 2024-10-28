package br.com.security.login.controller;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface WebSecurityConfigurer {
    
    public void configure(HttpSecurity http) throws Exception;
    
}
