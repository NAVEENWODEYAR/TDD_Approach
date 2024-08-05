package com.tdd.tdd_appraoch_demo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import com.tdd.tdd_appraoch_demo.dto.Post;
import com.tdd.tdd_appraoch_demo.service.PostService;

@WebMvcTest
public class PostControllerTest {
	
	List<Post> posts = new ArrayList<>();
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PostService postService;
	
	@BeforeEach
	void setUp() {
		posts = List.of(new Post(1,1,"Post-1","First Post"),new Post(2,2,"Post-2","Second Post"));
	}

	@Test
	public void testAllPosts() throws Exception {
		String jsonRsponse = """
				[
					{
						"pId":1,
						"userId":1,
						"pTitle":"Post-1",
						"pBody":"First Post"
					},
					{
						"pId":2,
						"userId":2,
						"pTitle":"Post-2",
						"pBody":"Second Post"
					}
				]
				""";
		
		when(postService.findAll()).thenReturn(posts);
		
		ResultActions andExpect = mockMvc.perform(get("/api/tdd/listing")).andExpect(status().isOk()).andExpect((ResultMatcher) content().json(jsonRsponse));
				
		JSONAssert.assertEquals(jsonRsponse, andExpect.andReturn().getResponse().getContentAsString(),false);
	}
	
	
	
}
