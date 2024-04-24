package com.itp.youtube.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ConfigMVC {

    @Bean
    public SecurityFilterChain securityFilterChainMvc(HttpSecurity http) throws Exception {

        return http.securityMatcher("/mvc/**","/oauth2/authorization/keycloak/**","/login/**")
                .authorizeHttpRequests(r->r.requestMatchers("/hello/get_secured_data/**","/login/**").permitAll().anyRequest().authenticated())
                .oauth2Login(a->clientRegistrationRepository2())
                .build();
    }


    @Bean
    public ClientRegistrationRepository clientRegistrationRepository2() {
        return new InMemoryClientRegistrationRepository(this.MvcClientRegistration());
    }
 
    // hardcoding uris is for the easier understading, not recommended for production application

    private ClientRegistration MvcClientRegistration() {
        return ClientRegistration.withRegistrationId("keycloak")
                .clientId("oauth-demo-authclient")
                .clientSecret("DVktOslRLlgCyWmQxQl4Tdm658q7Vd9s")
                .clientAuthenticationMethod(ClientAuthenticationMethod.NONE)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUri("http://localhost:8081/login/oauth2/code/keycloak")
                .authorizationUri("http://0.0.0.0:8080/realms/oauthdemo/protocol/openid-connect/auth")
                .tokenUri("http://0.0.0.0:8080/realms/oauthdemo/protocol/openid-connect/token")
                .scope("openid", "profile")
                .jwkSetUri("http://0.0.0.0:8080/realms/oauthdemo/protocol/openid-connect/certs")
                .issuerUri("http://0.0.0.0:8080/realms/oauthdemo")
                .clientName("keycloak")
                .build();
    }


}
