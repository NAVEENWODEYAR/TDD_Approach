package com.tdd.tdd_appraoch_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdd.tdd_appraoch_demo.dto.Post;
import com.tdd.tdd_appraoch_demo.service.PostService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest2 {

    @Autowired
    private MockMvc mockMvc;
    
    List<Post> posts = new ArrayList<>();

    @MockBean
    private PostService postService;
  
	@BeforeEach
	void setUp() {
		posts = List.of(new Post(1,1,"Post-1","First Post"),new Post(2,2,"Post-2","Second Post"));
	}

	
    @Test
    public void testAllPosts() throws Exception {
        // Mock the service to return the posts
        when(postService.findAll()).thenReturn(posts);

        // Convert the expected list of posts to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = objectMapper.writeValueAsString(posts);

        // Perform the GET request and verify the response
        ResultActions resultActions = mockMvc.perform(get("/api/tdd/listing"))
                                             .andExpect(status().isOk())
                                             .andExpect(content().json(jsonResponse));
        
		JSONAssert.assertEquals(jsonResponse, resultActions.andReturn().getResponse().getContentAsString(),false);

    }
    
    @Test
	public void getByIdTest() {
		String jsonRsponse = """
					{
						"pId":1,
						"userId":1,
						"pTitle":"Post-1",
						"pBody":"First Post",
						"pBody":"Second Post"
					}
				""";
		when(postService.findById(1)).thenReturn(new Post(1,1,"Post-1","First Post"));
		
		try {
			ResultActions resultActions = mockMvc.perform(get("/api/tdd/findById/1")).andExpect(status().isOk()).andExpect(content().json(jsonRsponse));
			assertEquals(jsonRsponse,resultActions.andReturn().getResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

