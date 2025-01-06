package com.tdd.tdd_appraoch_demo.controller;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tdd.tdd_appraoch_demo.dto.Post;
import com.tdd.tdd_appraoch_demo.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@Tag(name = "Post_Controller",description = "Controller for CRUD for PostEntity,")
@RestController
@RequestMapping("/api/tdd")
public class PostController {
	
	private static final Logger log = LoggerFactory.getLogger(PostController.class);

	@Autowired
	private PostService postService;
	
	 @Operation(
		        summary = "Test()",
		        description = "EndPoint to test the controller,",
		        parameters = {
		            @Parameter(name = "Authorization", description = "Bearer token", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER),
		            @Parameter(name = "Custom-Header", description = "Custom header value", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER)
		        }
		    )
		    @ApiResponses(value = {
		        @ApiResponse(responseCode = "200", description = "SUCCESS",
		                     content = @Content(mediaType = "application/json",
		                     schema = @Schema(implementation = Post.class))),
		        @ApiResponse(responseCode = "401", description = "Unauthorized"),
		        @ApiResponse(responseCode = "403", description = "Forbidden"),
		        @ApiResponse(responseCode = "404", description = "Not Found")
		    })
	@GetMapping
	public ResponseEntity<?> test(){
		 log.info("Inside the test endPoint");
		return new ResponseEntity<>("Welocme to TDD!,",HttpStatus.OK);
	}
	
	 @Operation(
		        summary = "Get Posts",
		        description = "Fetches all the available post lists,",
		        parameters = {
		            @Parameter(name = "Authorization", description = "Bearer token", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER),
		            @Parameter(name = "Custom-Header", description = "Custom header value", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER)
		        }
		    )
		    @ApiResponses(value = {
		        @ApiResponse(responseCode = "200", description = "SUCCESS",
		                     content = @Content(mediaType = "application/json",
		                     schema = @Schema(implementation = Post.class))),
		        @ApiResponse(responseCode = "401", description = "Unauthorized"),
		        @ApiResponse(responseCode = "403", description = "Forbidden"),
		        @ApiResponse(responseCode = "404", description = "Not Found")
		    })
	@GetMapping("/listing")
	public List<Post> getPosts() {
		 log.error("Inside the test getPosts()");
		return postService.findAll();
	}
	
	 @Operation(
		        summary = "Get By-Id",
		        description = "Fetches the post using the Id,",
		        parameters = {
		            @Parameter(name = "Authorization", description = "Bearer token", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER),
		            @Parameter(name = "Custom-Header", description = "Custom header value", required = false, in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER)
		        }
		    )
		    @ApiResponses(value = {
		        @ApiResponse(responseCode = "200", description = "SUCCESS",
		                     content = @Content(mediaType = "application/json",
		                     schema = @Schema(implementation = Post.class))),
		        @ApiResponse(responseCode = "401", description = "Unauthorized"),
		        @ApiResponse(responseCode = "403", description = "Forbidden"),
		        @ApiResponse(responseCode = "404", description = "Not Found")
		    })
	@GetMapping("/findById/{id}")
	public Post getById(@PathVariable int id) {
		 log.info("Inside the test getbyId,");
		return postService.findById(id);
	}
}
