package com.unit.mockito.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unit.mockito.service.MovieService;
/**
 * @author Naveen K Wodeyaar,
 * @Date 15-Aug-2024
 */
@RestController("/api/v1/moviecontroller")
public class MovieServiceController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> test(){
		return  ResponseEntity.ok("Welcome to the Movie_Controller!,");
	}
	
}
