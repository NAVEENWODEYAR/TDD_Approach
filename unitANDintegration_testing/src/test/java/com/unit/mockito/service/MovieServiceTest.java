package com.unit.mockito.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.unit.mockito.entity.Movie;
import com.unit.mockito.repo.MovieRepository;
/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Aug-2024
 */
@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
class MovieServiceTest {
	
	@Mock
	private MovieRepository movieRepository;
	
	@InjectMocks
	private MovieService movieService;
	
	private Movie movie;
	private Movie movie1;
	private Movie movie2;
	private Movie movie3;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("\nBefore Class,");
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
//	@BeforeEach
	void setUp() throws Exception {
		movie = new Movie();
		movie.setmName("VIP");
		movie.setMgenre("Sentiment");
		movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		movie1 = new Movie();
		movie1.setmName("VIP2");
		movie1.setMgenre("Dramedy");
		movie1.setmReleaseDate(LocalDate.of(202, 05, 06));
		
		movie2 = new Movie();
		movie2.setmName("VIP3");
		movie2.setMgenre("Action");
		movie2.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		movie3 = new Movie();
		movie3.setmName("VIP4");
		movie3.setMgenre("Dramedy");
		movie3.setmReleaseDate(LocalDate.of(202, 05, 06));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
	// actual methods,
	@Test
	public void addMovie() {
		Movie movie = new Movie();
		movie.setmName("VIP");
		movie.setMgenre("Sentiment");
		movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		when(movieService.addMovie(movie)).thenReturn(movie);
		when(movieRepository.save(any(Movie.class))).thenReturn(movie);
		Movie addMovie = movieService.addMovie(movie);
		
		assertNotNull(addMovie);
		assertThat(addMovie.getmName()).isEqualTo("VIP");
	}
	
	@Test
	@DisplayName("Movies list,")
	public void movieList(){
		List<Movie> movieList = new ArrayList();
			movieList.add(movie);
			movieList.add(movie1);
		
		when(movieRepository.findAll()).thenReturn(movieList);
		List<Movie> movieList2 = movieService.movieList();
		assertEquals(2, movieList2.size());
		
	}
	
	@Test
	@DisplayName("/findByName")
	public void getByMovieId() {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		when(movieRepository.findById(anyLong())).thenReturn(Optional.of(movie));
		
		Movie byMovieId = movieService.getByMovieId(1L);
		assertThat(byMovieId.getmName()).isEqualTo("VIP");

	}
	
	@Test
	@DisplayName("/findByIdWithException,")
	public void getMoviebyIdException() {
		Movie movie = new Movie();
			movie.setmId(1L);
			movie.setmName("VIP");
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
			
		when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));
		
		assertThrows(RuntimeException.class, ()->{
			movieService.getByMovieId(2L);
		});
			
	}
	
	@Test
	@DisplayName("/Update method,")
	public void updateMovie() {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setmId(2L);
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
		
		when(movieRepository.findById(2L)).thenReturn(Optional.of(movie));
		when(movieRepository.save(any(Movie.class))).thenReturn(movie);
			movie.setMgenre("Dramedy");
			movie.setmName("VIP2");
			
			Movie updateMovie = movieService.updateMovie(movie, 2L);
		assertNotNull(updateMovie);
		assertEquals("Dramedy", updateMovie.getMgenre());
		assertEquals(updateMovie.getmName(),"VIP2");
	}
	
	@Test
	@DisplayName("delteById")
	public void deleteMovie() {
		Movie movie = new Movie();
			movie.setmName("VIP");
			movie.setmId(2L);
			movie.setMgenre("Sentiment");
			movie.setmReleaseDate(LocalDate.of(2020, 05, 06));
			
		when(movieRepository.findById(anyLong())).thenReturn(Optional.of(movie));
		System.out.println(movie.getmId()+"\n"+movie.getmName());
		doNothing().when(movieRepository).delete(any(Movie.class));
		
		movieService.deleteMovie(2L);
		verify(movieRepository,times(1)).delete(movie);;
	}

}
