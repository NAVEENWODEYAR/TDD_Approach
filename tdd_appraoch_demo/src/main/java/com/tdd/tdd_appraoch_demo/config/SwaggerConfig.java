package com.tdd.tdd_appraoch_demo.config;

import org.springframework.context.annotation.*;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;

/**
 * @author Naveen K Wodeyar
 * @date 21-Aug-2024
 */
@Configuration
public class SwaggerConfig {
	 
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SPRING_SECURITY_DEMO")
                        .description("Spring Boot project for spring-sercurity-demo.")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Naveen K Wodeyar")
                                .url("http://naveen.co.in")
                                .email("naveenwodeyar@yahoo.com"))
                        .license(new License()
                                .name("My License")
                                .url("http://www.license.co.in"))
                );
    }
}
