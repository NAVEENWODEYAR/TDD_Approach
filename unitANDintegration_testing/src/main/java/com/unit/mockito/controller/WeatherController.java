package com.unit.mockito.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unit.mockito.service.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024 
 */

@Tag(name = "Weather_Controller",description = "Controller to consume the external API to get the weather report,")
@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {
	
	private static final Logger log = LoggerFactory.getLogger(WeatherController.class);
	
	@Autowired
	private WeatherService weatherService;
	
	@Operation(summary = "Test Endpoint", description = "Displays the welcome message.")
	@GetMapping("/greet")
	public ResponseEntity<?> greet() {
		log.warn("Inside greet(),");
		return ResponseEntity.status(HttpStatus.OK)
							 .header("API_KEY", "Key to access the weatherstack API,")
							 .body("Welcome to the Weather API!");
	}
	
	@Operation(summary = "Get Weather", description = "Fetch the weather of the provided city.")
	//@GetMapping(value = "/weather/{location}",params ="city"  ,produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getWeather() {
		log.error("Inside getWeather() {}");
		Object weatherData = weatherService.getWeather("Bangalore");
		return ResponseEntity.status(HttpStatus.OK)
							 .header("API_KEY", "Key to access the weatherstack API,")
							 .body(weatherData);
	}

}
