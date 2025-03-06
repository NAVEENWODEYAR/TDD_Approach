package com.unit.mockito.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.unit.mockito.entity.Movie;
import com.unit.mockito.service.MovieService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 06-Mar-2025
 */

class MovieServiceControllerTest2 {

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
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	} 
	
	@Mock
    private MovieService movieService;

    @InjectMocks
    private MovieServiceController movieServiceController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(movieServiceController).build();
    }

    @Test
    void testTestEndpoint() throws Exception {
        MvcResult result = mockMvc.perform(get("/api/v1/test")
                        .param("message", "Hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome to the Movie_Controller!,"))
                .andReturn();
    }

    @Test
    void testAddMovie() throws Exception {
        Movie movie = new Movie();
        movie.setmId(1L);
        movie.setmName("Test Movie");
        movie.setMgenre("Action");

        when(movieService.addMovie(Mockito.any(Movie.class))).thenReturn(movie);

        mockMvc.perform(post("/api/v1/add")
                        .contentType("application/json")
                        .content("{\"title\":\"Test Movie\",\"genre\":\"Action\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Test Movie"))
                .andExpect(jsonPath("$.genre").value("Action"));
    }

    @Test
    void testGetMovieById() throws Exception {
        Movie movie = new Movie();
        movie.setmId(1L);
        movie.setmName("Test Movie");
        movie.setMgenre("Action");

        when(movieService.getByMovieId(1L)).thenReturn(movie);

        mockMvc.perform(get("/api/v1/getById/1"))
                .andExpect(status().isFound())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Test Movie"))
                .andExpect(jsonPath("$.genre").value("Action"));
    }

    @Test
    void testGetMovies() throws Exception {
        Movie movie = new Movie();
        movie.setmId(1L);
        movie.setmName("Test Movie");
        movie.setMgenre("Action");

        when(movieService.movieList()).thenReturn(java.util.List.of(movie));

        mockMvc.perform(get("/api/v1/list"))
                .andExpect(status().isFound())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].title").value("Test Movie"))
                .andExpect(jsonPath("$[0].genre").value("Action"));
    }

    @Test
    void testUpdateMovie() throws Exception {
        Movie movie = new Movie();
        movie.setmId(1L);
        movie.setmName("Updated Movie");
        movie.setMgenre("Drama");

        when(movieService.updateMovie(Mockito.any(Movie.class), Mockito.eq(1L))).thenReturn(movie);

        mockMvc.perform(put("/api/v1/update/1")
                        .contentType("application/json")
                        .content("{\"title\":\"Updated Movie\",\"genre\":\"Drama\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Updated Movie"))
                .andExpect(jsonPath("$.genre").value("Drama"));
    }

    @Test
    void testDeleteMovie() throws Exception {
        Long movieId = 1L;

        Mockito.doNothing().when(movieService).deleteMovie(movieId);

        mockMvc.perform(delete("/api/v1/delete/1"))
                .andExpect(status().isNoContent());
    }

}
