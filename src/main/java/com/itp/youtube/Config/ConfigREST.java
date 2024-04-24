package com.itp.youtube.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.server.resource.authentication.JwtIssuerAuthenticationManagerResolver;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ConfigREST {

    @Bean
    public SecurityFilterChain securityFilterChainRest(HttpSecurity http) throws Exception {

        return http.securityMatcher("/api/rest/**")
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(r->r.requestMatchers("/hello/get_secured_data/**").permitAll().anyRequest().authenticated())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.authenticationManagerResolver(authenticationManagerResolver))
                .build();

    }
     // hardcoding uris is for the easier understading, not recommended for production application
    JwtIssuerAuthenticationManagerResolver authenticationManagerResolver = JwtIssuerAuthenticationManagerResolver
            .fromTrustedIssuers("http://0.0.0.0:8080/realms/rest_relam");

}