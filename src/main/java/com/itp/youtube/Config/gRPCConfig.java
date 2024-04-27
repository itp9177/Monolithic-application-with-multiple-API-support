package com.itp.youtube.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import net.devh.boot.grpc.server.security.authentication.BearerAuthenticationReader;
import net.devh.boot.grpc.server.security.authentication.CompositeGrpcAuthenticationReader;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationProvider;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken;
import org.springframework.core.convert.converter.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration(proxyBeanMethods = false)
@EnableMethodSecurity(securedEnabled = true, proxyTargetClass = true)
public class gRPCConfig {
    private static final Logger log = LoggerFactory.getLogger(gRPCConfig.class);

    final static String issuerUri = "http://0.0.0.0:8080/realms/grphql_relam/protocol/openid-connect/certs";

    @Bean
    public AuthenticationManager authenticationManager() {
        List<AuthenticationProvider> providers = new ArrayList<>();
        JwtAuthenticationProvider jwtAuthenticationProvider = new JwtAuthenticationProvider(
                NimbusJwtDecoder.withJwkSetUri(issuerUri).build());
        providers.add(jwtAuthenticationProvider);
        log.info("Jwt Authentication provider for gRPC OAuth2 jwt authentication");

        return new ProviderManager(providers);
    }

    @Bean
    GrpcAuthenticationReader authenticationReader() {
        log.info("initiate gRCP authentication reader");

        final List<GrpcAuthenticationReader> readers = new ArrayList<>();
        readers.add(new BearerAuthenticationReader(accessToken -> new BearerTokenAuthenticationToken(accessToken)));
        return new CompositeGrpcAuthenticationReader(readers);

    }
/*
 * Keycloak role mapping to Springboot Granted Authorities 
 */
    public JwtAuthenticationConverter jwtAuthenticationConverterForKeycloak() {
        
        Converter<Jwt, Collection<GrantedAuthority>> jwtGrantedAuthoritiesConverter = jwt -> {
            log.debug("token", jwt);
            Map<String, Collection<String>> realmAccess = jwt.getClaim("realm_access");
            Collection<String> roles = realmAccess.get("roles");
            return roles.stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                    .collect(Collectors.toList());
        };

        var jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwtGrantedAuthoritiesConverter);

        return jwtAuthenticationConverter;
    }
}