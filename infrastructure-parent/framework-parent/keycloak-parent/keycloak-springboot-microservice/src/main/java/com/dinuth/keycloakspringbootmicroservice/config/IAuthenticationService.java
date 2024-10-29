package com.dinuth.keycloakspringbootmicroservice.config;

import org.springframework.security.core.Authentication;

public interface IAuthenticationService {
    Authentication getAuthentication();
}
