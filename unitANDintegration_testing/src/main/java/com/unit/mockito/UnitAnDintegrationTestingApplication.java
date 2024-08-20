package com.unit.mockito;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.unit.mockito.config.SwaggerConfig;

import ch.qos.logback.core.Context;
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
	    )
//	    security = @SecurityRequirement(name = "bearerAuth")  // Apply security globally to all endpoints
//	)
//	@SecurityScheme(
//	    name = "bearerAuth",  // Reference name
//	    type = SecuritySchemeType.HTTP,  // HTTP type
//	    scheme = "bearer",  // Bearer token
//	    bearerFormat = "JWT"  // Optional format for JWT
//	)
//@ComponentScan(excludeFilters = {
//	    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = SwaggerConfig.class)
//	})
@EnableWebMvc
@SpringBootApplication
public class UnitAnDintegrationTestingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(UnitAnDintegrationTestingApplication.class, args);
		String[] activeProfiles = context.getEnvironment().getActiveProfiles();
		System.out.println(Arrays.toString(activeProfiles));
		System.out.println("\nUnit Testing,\nIntegration Testing,\nMockito,,");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
