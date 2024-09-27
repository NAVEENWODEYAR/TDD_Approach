package com.unit.mockito.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unit.mockito.entity.Movie;
import com.unit.mockito.service.MovieService;
/**
 * @author Naveen K Wodeyaar,
 * @Date 16-Aug-2024
 */
@SpringBootTest
@AutoConfigureMockMvc
class MovieServiceControllerTest{

	@MockBean
	private MovieService movieService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#test()}.
	 * @throws Exception 
	 */
//	@Test
//	@DisplayName("Test endPoint API")
//	void testTest() throws Exception {
////		fail("Not yet implemented");
//		this.mockMvc.perform(get("/api/v1/moviecontroller/test"))
//							.andExpect(status().isOk());
//	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#addMovie(com.unit.mockito.entity.Movie)}.
	 * @throws Exception 
	 * @throws JsonProcessingException 
	 */
	@Test
	@DisplayName("Add movie API test,")
	void testAddMovie() throws JsonProcessingException, Exception {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
			
		when(movieService.addMovie(any(Movie.class))).thenReturn(movie);
		
		String jsonResponse = this.mockMvc.perform(post("/api/v1/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(movie)))
                .andReturn()
                .getResponse()
                .getContentAsString();
		System.out.println("Response: " + jsonResponse);
		
		this.mockMvc.perform(post("/api/v1/add")
								.contentType(MediaType.APPLICATION_JSON)
								.content(mapper.writeValueAsString(movie)))
								.andExpect(status().isOk())
								.andExpect(jsonPath("$.mname", is(movie.getmName())))
								.andExpectAll(jsonPath("$.mgenre", is(movie.getMgenre())));
	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#getMovieById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	void testGetMovieById() throws Exception {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmId(1L);
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
	
		when(movieService.getByMovieId(anyLong())).thenReturn((movie));
		
		this.mockMvc.perform(get("/api/v1/getById/{id}",1L))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.mname", is(movie.getmName())));
			
	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#getMovies(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	@DisplayName("Display movies list")
	void testGetMovies() throws Exception {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		Movie movie1 = new Movie();
			movie1.setmName("VIP2");
			movie1.setMgenre("COMEDY");
			movie1.setmReleaseDate(LocalDate.of(2022, 05, 06));
			
		List<Movie> movieList = new ArrayList<>();
					movieList.add(movie);	
					movieList.add(movie1);	
					
		when(movieService.movieList()).thenReturn(movieList);
		
		this.mockMvc.perform(get("/api/v1/list"))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.size()", is(movieList.size())));

	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#updateMovie(java.lang.Long, com.unit.mockito.entity.Movie)}.
	 * @throws Exception 
	 * @throws JsonProcessingException 
	 */
	@Test
	@DisplayName("Update Movie")
	void testUpdateMovie() throws JsonProcessingException, Exception {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmId(1L);
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
			
		when(movieService.updateMovie(any(Movie.class), anyLong())).thenReturn(movie);
		
		this.mockMvc.perform(put("/api/v1/update/{id}",1L)
					.contentType(MediaType.APPLICATION_JSON)
					.content(mapper.writeValueAsString(movie)))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.mname", is(movie.getmName())));
					
		
	}

	/**
	 * Test method for {@link com.unit.mockito.controller.MovieServiceController#delteMovie(java.lang.Long)}.
	 * @throws Exception 
	 */	
	@Test
	@DisplayName("Delete Movie")
	void testDelteMovie() throws Exception {
	    Movie movie = new Movie();
	    movie.setmName("VIP");
	    movie.setMgenre("Sentiment");
	    movie.setmId(1L);
	    movie.setmReleaseDate(LocalDate.of(2020, 5, 6));

	    // Stubbing deleteMovie() to do nothing
//	    doNothing().when(movieService).deleteMovie(anyLong());
	    when(movieService.deleteMovie(anyLong())).thenReturn("Movie,+"+movie.getmId()+"deleted successfully");
	    
	    // Perform the delete request and expect status NO_CONTENT
	    this.mockMvc.perform(delete("/api/v1/delete/{id}", 1L))
	                .andExpect(status().isNoContent());
	}

}
