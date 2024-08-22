package com.tdd.tdd_appraoch_demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
@Entity
public class Post {

	@Id
	private int pId;
	private int userId;
	private String pTitle;
	private String pBody;
}
