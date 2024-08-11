package com.restsapi.rest_api_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class RestApiTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestingApplication.class, args);
		System.out.println("REST\n API");
	}
}
