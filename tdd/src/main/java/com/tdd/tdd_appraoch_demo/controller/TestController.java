package com.tdd.tdd_appraoch_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/test")
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("test")
	public String getMethodName(@RequestParam String param) {
		log.info("Test endPoint,");
		return new String();
	}
	
}
