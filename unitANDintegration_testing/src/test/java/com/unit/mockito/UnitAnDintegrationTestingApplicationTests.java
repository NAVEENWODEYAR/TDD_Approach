package com.unit.mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.unit.mockito.entity.Movie;
import com.unit.mockito.repo.MovieRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UnitAnDintegrationTestingApplicationTests {

	@LocalServerPort
	private int port;
	
	private String baseUrl = "http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private MovieRepository movieRepository;
	
	private Movie movie;
	
	private Movie movie1;
	
	@BeforeAll
	public static void initialize() {
		restTemplate = new RestTemplate();
	}
	
	@BeforeEach
	public void beforeSetp() {
		baseUrl = baseUrl+":"+port+"/api/v1";
		
		Movie movie = new Movie();
			movie.setMName("VIP");
			movie.setMgenre("Sentiment");
			movie.setMReleaseDate(LocalDate.of(2020, 05, 06));
		
		Movie movie1 = new Movie();
			movie1.setMName("VIP2");
			movie1.setMgenre("COMEDY");
			movie1.setMReleaseDate(LocalDate.of(2022, 05, 06));
			
			movie = movieRepository.save(movie);
			movie1 = movieRepository.save(movie1);
	}
	
	@AfterEach
	public void afterSetUp() {
		movieRepository.deleteAll();
	}
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	@DisplayName("Create Movie Test")
	void shouldCreateMovieTest() {
		Movie movie = new Movie();
			movie.setMName("VIP");
			movie.setMgenre("Sentiment");
			movie.setMReleaseDate(LocalDate.of(2020, 05, 06));
			
		System.out.println(baseUrl);
		log.info(baseUrl);
		Movie newMovie = restTemplate.postForObject(baseUrl+"/add", movie, Movie.class);
		
		assertNotNull(newMovie);
		
		assertThat(newMovie.getMId()).isNotNull();
	}
	
	@Test
	@DisplayName("Get Movies Test")
	void shouldGetMovieListTest() {
		
		List newMovie = restTemplate.getForObject(baseUrl+"/list", List.class);
		
		assertNotNull(newMovie);
		
		assertThat(newMovie.size()).isEqualTo(2);
	}
	
	@Test
	@DisplayName("Get Movie Test")
	void shouldGetMovieTest() {

		Movie movie = new Movie();

		Movie existinMovie = restTemplate.getForObject(baseUrl+"/getById/"+movie.getMId(), Movie.class);
	
		assertNotNull(existinMovie);
		
		assertEquals("VIP", existinMovie.getMName());
	}
	
	@Test
	@DisplayName("Delete Movie Test")
	void shouldDeleteMovieTest() {

		Movie movie = new Movie();

		restTemplate.delete(baseUrl+"/delete/"+1L);
		
		int size = movieRepository.findAll().size();
		
		assertEquals(1, size);
	}
	
	
	@Test
	@DisplayName("Update Movie Test")
	void shouldUpdateMovieTest() {
		Movie movie = new Movie();
		
			movie.setMgenre("DRAMEDY");
			
		restTemplate.put(baseUrl+"/update/"+movie.getMId(), movie);
		
		Movie existingMovie = restTemplate.getForObject(baseUrl+"/getById/"+movie.getMId(), Movie.class);
		
		assertNotNull(existingMovie);
		
		assertEquals("DRAMEDY", existingMovie.getMgenre());
	}


}
