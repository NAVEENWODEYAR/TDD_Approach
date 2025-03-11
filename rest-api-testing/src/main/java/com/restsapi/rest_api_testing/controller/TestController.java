package com.restsapi.rest_api_testing.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	    return java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm ddMMMMyyyy"));
	}

}
