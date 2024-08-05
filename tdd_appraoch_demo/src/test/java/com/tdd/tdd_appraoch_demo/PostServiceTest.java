package com.tdd.tdd_appraoch_demo;
/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.tdd.tdd_appraoch_demo.controller.repo.PostRepository;
import com.tdd.tdd_appraoch_demo.dto.Post;
import com.tdd.tdd_appraoch_demo.service.PostService;

public class PostServiceTest {

	List<Post> posts = new ArrayList<>();
	
	@InjectMocks
	private PostService postService;
	
	@Mock
	private PostRepository postRepository;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		posts = List.of(new Post(1,1,"Post-1","First Post"),new Post(2,2,"Post-2","Second Post"));
	}
	
	@Test
	public void createPostTest() {
		when(postRepository.findAll()).thenReturn(posts);
		
		List<Post> findAll = postService.findAll();
		assertNotNull(findAll);
		assertEquals(findAll.size(), 2);
	}
}

