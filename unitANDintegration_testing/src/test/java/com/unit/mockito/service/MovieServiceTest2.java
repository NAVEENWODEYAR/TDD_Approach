package com.unit.mockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.unit.mockito.entity.Movie;
import com.unit.mockito.repo.MovieRepository;

/**
 * @author Naveen K Wodeyaar,
 * @Date 04-Apr-2025
 */

@SpringBootTest
public class MovieServiceTest2 {

    @Mock
	private MovieRepository movieRepository;
	
	@InjectMocks
	private MovieService movieService;

    Movie movie = new Movie();

    @BeforeEach
    public void setUp() {
        movie = new Movie();
        movie.setmName("Original Movie");
        movie.setMgenre("Action");
        movieRepository.save(movie);
    }

    @Test
    @Transactional
    public void testUpdateMovieTransactionalSuccess() {
        // Arrange: Prepare movie details to be updated
        Movie updatedMovie = new Movie();
        updatedMovie.setmName("Updated Movie");
        updatedMovie.setMgenre("Drama");

        // Act: Perform the update operation
        Movie updatedMovieResult = movieService.updateMovie(updatedMovie, movie.getmId());

        // Assert: Check that the movie has been updated successfully
        assertEquals("Updated Movie", updatedMovieResult.getmName());
        assertEquals("Drama", updatedMovieResult.getMgenre());
    }

    @Test
    @Transactional
    public void testUpdateMovieTransactionalRollback() {
        // Arrange: Prepare movie details to be updated
        Movie updatedMovie = new Movie();
        updatedMovie.setmName("Updated Movie");
        updatedMovie.setMgenre("Drama");

        // Act: Simulate a failure that will trigger rollback by throwing an exception
        try {
            movieService.updateMovie(updatedMovie, movie.getmId());
            // Forcing an exception to test rollback
            throw new RuntimeException("Force rollback");
        } catch (RuntimeException ex) {
            // Assert: Check that the rollback has occurred by verifying the movie name is still "Original Movie"
            Movie movieAfterRollback = movieRepository.findById(movie.getmId()).get();
            assertEquals("Original Movie", movieAfterRollback.getmName());
            assertEquals("Action", movieAfterRollback.getMgenre());
        }
    }
}