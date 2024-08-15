package com.unit.mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
	    info = @Info(
	        title = "DEPARTMENT-SERVICE API",
	        version = "1.0",
	        description = "Microservice-1 for Employee Management System, handling department-related operations.",
	        termsOfService = "http://terms.example.com",
	        contact = @Contact(
	            name = "Support Team",
	            email = "support@example.com",
	            url = "http://support.example.com"
	        ),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0.html"
	        )
	    ),
	    servers = {
	        @Server(
	            url = "http://localhost:7070",
	            description = "Development server",
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
	        @Tag(name = "Department", description = "Operations related to departments"),
	        @Tag(name = "Employee", description = "Operations related to employees")
	    }
	)
@SpringBootApplication
public class UnitAnDintegrationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitAnDintegrationTestingApplication.class, args);
		System.out.println("\nUnit Testing,\nIntegration Testing,\nMockito,,");
	}

}
