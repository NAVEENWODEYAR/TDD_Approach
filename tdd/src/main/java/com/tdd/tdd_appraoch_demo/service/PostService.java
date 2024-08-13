package com.tdd.tdd_appraoch_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tdd.tdd_appraoch_demo.dto.Post;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@Service
public class PostService {
	
	public List<Post> findAll(){
		return  List.of(new Post(1,1,"Post-1","First Post"),new Post(1,1,"Post-2","Second Post"));
	}

}
