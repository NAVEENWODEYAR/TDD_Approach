package com.restsapi.rest_api_testing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
/*
 * security = @SecurityRequirement(name = "bearerAuth") // Apply security
 * globally to all endpoints )
 * 
 * @SecurityScheme( name = "bearerAuth", // Reference name type =
 * SecuritySchemeType.HTTP, // HTTP type scheme = "bearer", // Bearer token
 * bearerFormat = "JWT" // Optional format for JWT )
 */
@EnableWebMvc
@SpringBootApplication
@EnableScheduling
public class RestApiTestingApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RestApiTestingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestingApplication.class, args);
		log.warn("Application START_UP");
		System.out.println("REST\n API");
	}
	
	@Scheduled(cron = "0 0/10 * * * ?")
	public void cronMethod() {
		log.error("CRON EXPRESSION: {} ",LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
	}
}
