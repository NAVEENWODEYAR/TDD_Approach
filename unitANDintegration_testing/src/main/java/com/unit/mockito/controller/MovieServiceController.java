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
import jakarta.websocket.server.PathParam;
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
    public ResponseEntity<Object> addMovie(@RequestBody Movie request) {
        return ResponseEntity.ok(movieService.addMovie(request));
    }
	
	@GetMapping("/getById/{id}")
    @Operation(summary = "Find by movie-Id", description = "Fetches the movie by the provided movie-id,")
    public ResponseEntity<Object> getMovieById(@PathParam("id") Long id) {
        return ResponseEntity.ok(movieService.getByMovieId(id));
    }
	
	@GetMapping("/list")
    @Operation(summary = "Find movies list", description = "Fetches the available movies list,")
    public ResponseEntity<Object> getMovies(@PathParam("id") Long id) {
        return ResponseEntity.ok(movieService.getByMovieId(id));
    }
	
	@PutMapping("/update/{id}")
    @Operation(summary = "Update movie", description = "Updates the movie by its id,")
    public ResponseEntity<Object> updateMovie(@PathParam("id") Long id,@RequestBody Movie request) {
        return ResponseEntity.ok(movieService.updateMovie(request, id));
    }
	
	@DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete movie", description = "Removes the provided movie from the db,")
    public ResponseEntity<Object> delteMovie(@PathParam("id") Long id) {
        return ResponseEntity.ok(movieService.deleteMovie(id));
    }
	
}