package com.unit.mockito;

import java.util.Arrays;

import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
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
        @Tag(name = "Employee", description = "Operations related to employees")
    }
)
@ComponentScan(excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = SwaggerConfig.class)
})
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
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
