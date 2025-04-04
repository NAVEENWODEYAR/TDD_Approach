package com.unit.mockito.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unit.mockito.entity.Movie;
import com.unit.mockito.repo.MovieRepository;

import jakarta.transaction.Transactional;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Aug-2024
 */

@Service
public class MovieService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);

	@Autowired
	private MovieRepository movieRepository;
	@Transactional
	public Movie addMovie(Movie movie) {
		LOGGER.info("inside addMovie()");
		return movieRepository.save(movie);
	}
	@Transactional
	public List<Movie> movieList(){
		return movieRepository.findAll();
	}
	
	@Transactional
	public Movie getByMovieId(Long movieId) {
		//return movieRepository.findById(movieId).get();
		return movieRepository.findById(movieId).orElseThrow(()->new RuntimeException("Movie with the given id not found,"));
	}
	
	@Transactional
	public Movie updateMovie(Movie movie,Long movieId) {
		Movie movie2 = movieRepository.findById(movieId).get();
				movie2.setmName(movie.getmName());
				movie2.setMgenre(movie.getMgenre());
				return movieRepository.save(movie2);
	}
	
	@Transactional
	public String deleteMovie(Long movieId) {
		if(movieRepository.existsById(movieId)) {
			movieRepository.deleteById(movieId);
			return "Movie,"+movieId+"deleted successfully";
		}else {
			throw new RuntimeException("Movie with id"+movieId+" not found,,");
		}
	}
	
}
