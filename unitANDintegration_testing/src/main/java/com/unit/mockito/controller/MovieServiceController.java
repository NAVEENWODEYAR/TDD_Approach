package com.unit.mockito.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unit.mockito.entity.Movie;
import com.unit.mockito.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
/**
 * @author Naveen K Wodeyaar,
 * @Date 15-Aug-2024
 */
@Tag(name = "Movie_Service_Controller", description = "Operations related to movie,")
@RestController("/api/v1/moviecontroller")
public class MovieServiceController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Test endPoint,", description = "Returns the string message.")
	public ResponseEntity<?> test(){
		return  ResponseEntity.ok("Welcome to the Movie_Controller!,");
	}
	
	@PostMapping("/add")
    @Operation(summary = "Add new movie", description = "Add a new movie to the system.")
    public ResponseEntity<Object> addDepartment(@RequestBody Movie request) {
        return ResponseEntity.ok(movieService.addMovie(request));
    }
	
}