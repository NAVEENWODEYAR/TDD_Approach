package com.tdd.tdd_appraoch_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdd.tdd_appraoch_demo.dto.Post;
import com.tdd.tdd_appraoch_demo.service.PostService;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@RestController
@RequestMapping("/api/tdd")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping
	public ResponseEntity<?> test(){
		return new ResponseEntity<>("Welocme to TDD!,",HttpStatus.OK);
	}
	
	@GetMapping("/listing")
	public List<Post> getPosts() {
		return postService.findAll();
	}
}
