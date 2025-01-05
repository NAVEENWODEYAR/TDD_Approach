package com.tdd.tdd_appraoch_demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class Post {

	private int pId;
	private int userId;
	private String pTitle;
	private String pBody;
	
	
}
