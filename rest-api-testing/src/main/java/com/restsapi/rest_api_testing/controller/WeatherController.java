package com.restsapi.rest_api_testing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

	private String apiKey = "190a443a447df5f4dd0c10d2679a3c34";

	@GetMapping
	public ResponseEntity<?> greet() {
		return ResponseEntity.status(HttpStatus.OK)
							 .header(apiKey, "Key to access the weatherstack API,")
							 .body("Welcome to the Weather API!");
	}

}
