package com.restsapi.rest_api_testing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naveen Wodeyar
 * @date 11-March-2025
 * @time 21:57:15 pm
 */

@RestController
@RequestMapping("/v1/")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public String test() {
    	log.info("test method,");
    	String format = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm ddMMMMyyyy"));
    	return format;		
    }

    @GetMapping("/external")
    public String callExternalApi() {
        log.info("callExternalApi() started");
        String url = "https://api.chucknorris.io/jokes/random"; 
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        log.info("External API response: {}", response.getBody());
        return response.getBody();
    }
}
