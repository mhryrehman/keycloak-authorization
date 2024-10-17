package com.example.keycloak_authorization;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
		name = "Keycloak",
		openIdConnectUrl = "http://172.16.102.238:8082/realms/testing/.well-known/openid-configuration",
		type = SecuritySchemeType.OPENIDCONNECT,
		in = SecuritySchemeIn.HEADER
)
public class KeycloakAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakAuthorizationApplication.class, args);
	}

}
