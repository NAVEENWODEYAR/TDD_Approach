package com.unit.mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.*;
import io.swagger.v3.oas.annotations.tags.Tag;
@OpenAPIDefinition(
	    info = @Info(
	        title = "JUNIT_UNIT,,MOCKITO",
	        version = "1.0",
	        description = "Unit testing using Mockito,",
	        termsOfService = "http://terms.example.com",
	        contact = @Contact(
	            name = "naveen k wodeyar",
	            email = "naveen.wodeyar@yahoo.com",
	            url = "http://naveenwodeyar.com"
	        ),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0.html"
	        )
	    ),
	    servers = {
	        @Server(
	            url = "http://localhost:7070",
	            description = "Testing server",
	            variables = {
	                @ServerVariable(
	                    name = "port",
	                    description = "Port number",
	                    defaultValue = "7070"
	                )
	            }
	        ),
	        @Server(
	            url = "http://production-server.com",
	            description = "Production server"
	        )
	    },
	    externalDocs = @ExternalDocumentation(
	        description = "Find more info here",
	        url = "http://example.com/docs"
	    ),
	    tags = {
	        @Tag(name = "Movie_Service", description = "Testing related to Movie_Service"),
	        @Tag(name = "Employee", description = "Operations related to employees")}
//	    },
//	    security = @SecurityRequirement(name = "bearerAuth")  // Apply security globally to all endpoints
//	)
//	@SecurityScheme(
//	    name = "bearerAuth",  // Reference name
//	    type = SecuritySchemeType.HTTP,  // HTTP type
//	    scheme = "bearer",  // Bearer token
//	    bearerFormat = "JWT"  // Optional format for JWT
	)
@SpringBootApplication
public class UnitAnDintegrationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitAnDintegrationTestingApplication.class, args);
		System.out.println("\nUnit Testing,\nIntegration Testing,\nMockito,,");
	}

}
