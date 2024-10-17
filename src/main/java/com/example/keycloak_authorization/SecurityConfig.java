//package com.example.keycloak_authorization;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//
//    @Autowired
//    JwtAuthConverter jwtAuthConverter;
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http)
//            throws Exception {
//        http.csrf(t -> t.disable());
//        http.authorizeHttpRequests(authorize -> {
//            authorize.requestMatchers(HttpMethod.GET, "/swagger-ui/**", "/v3/api-docs/**", "/v3/api-docs.yaml", "/swagger-ui.html").permitAll()
//                    .requestMatchers(HttpMethod.GET,"/restaurant/public/list").permitAll()
//                    .requestMatchers(HttpMethod.GET, "/restaurant/public/menu").permitAll()
//                    .anyRequest().authenticated();
//        });
//        http.oauth2ResourceServer(t -> {
////            t.opaqueToken(Customizer.withDefaults()); //verification done from keycloak
//            t.jwt(configurer -> configurer.jwtAuthenticationConverter(jwtAuthConverter));
//        });
//        http.sessionManagement(
//                t -> t.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//        );
//        return http.build();
//    }
//}
//
