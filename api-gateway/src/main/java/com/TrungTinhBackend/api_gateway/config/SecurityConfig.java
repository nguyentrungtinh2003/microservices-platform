package com.TrungTinhBackend.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(auth -> auth
                        .pathMatchers("/api/auth/**").permitAll()
                        .pathMatchers("/api/users/**").hasAnyRole("USER","MANAGER","ADMIN")
                        .pathMatchers("/api/projects/**").hasAnyRole("USER","MANAGER","ADMIN")
                        .pathMatchers("/api/enrollments/**").hasAnyRole("USER","MANAGER","ADMIN")
                        .anyExchange().authenticated()
                )
                .build();
    }
}