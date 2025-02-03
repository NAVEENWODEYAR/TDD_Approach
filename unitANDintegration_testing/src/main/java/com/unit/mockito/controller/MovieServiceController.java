package com.unit.mockito.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.unit.mockito.entity.Movie;
import com.unit.mockito.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Naveen K Wodeyaar,
 * @Date 15-Aug-2024
 */

@Tag(name = "Movie_Service_Controller", description = "Operations related to movie,")
@RestController
@RequestMapping("/api/v1")
public class MovieServiceController {
	
	private static final Logger log = LoggerFactory.getLogger(MovieServiceController.class);

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/test")
	@ResponseStatus(code = HttpStatus.OK)
	@Operation(
		        summary = "Test endpoint",
		        description = "Returns a string message based on the provided parameters.",
		        parameters = {
		            @Parameter(name = "message", description = "The message to be returned", required = true, example = "Hello")
		        }
		    )
		    @ApiResponses(value = {
		        @ApiResponse(responseCode = "200", description = "Successfully retrieved message"),
		        @ApiResponse(responseCode = "400", description = "Invalid input supplied"),
		        @ApiResponse(responseCode = "404", description = "Message not found")
		    })
	public ResponseEntity<?> test(){
		log.info("Logging Levels");
		log.trace("\nTRACE");
		log.debug("\nDEBUG,");
		log.info("\nINFO,");
		log.warn("\nWARN,");
		log.error("\nERROR,");
		return  ResponseEntity.ok("Welcome to the Movie_Controller!,");
	}
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Add new movie", description = "Adds a new movie to the system.")
    public ResponseEntity<Object> addMovie(@RequestBody Movie request) {
        return ResponseEntity.ok(movieService.addMovie(request));
    }
	
	@GetMapping("/getById/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
    @Operation(summary = "Find by movie-Id", description = "Fetches the movie by the provided movie-id,")
    public ResponseEntity<Object> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getByMovieId(id));
    }
	
	@GetMapping("/list")
	@ResponseStatus(code = HttpStatus.FOUND)
    @Operation(summary = "Find movies list", description = "Fetches the available movies list,")
    public ResponseEntity<Object> getMovies() {
        return ResponseEntity.ok(movieService.movieList());
    }
	
	@PutMapping("/update/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Update movie", description = "Updates the movie by the provided id,")
    public ResponseEntity<Object> updateMovie(@PathVariable Long id,@RequestBody Movie request) {
        return ResponseEntity.ok(movieService.updateMovie(request, id));
    }
	
	/*
	 * @DeleteMapping("/delete/{id}")
	 * 
	 * @ResponseStatus(code = HttpStatus.NO_CONTENT)
	 * 
	 * @Operation(summary = "Delete movie", description =
	 * "Removes the provided movie from the db,") public ResponseEntity<Object>
	 * delteMovie(@PathVariable("id") Long id) { return
	 * ResponseEntity.ok(movieService.deleteMovie(id)); }
	 */
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@Operation(summary = "Delete movie", description = "Removes particular movie from the db,")
	public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
	    movieService.deleteMovie(id);  
	    return ResponseEntity.noContent().build();  
	}
}