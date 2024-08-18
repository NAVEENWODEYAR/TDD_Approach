package com.unit.mockito.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyaar,
 * @Date 18-Aug-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

	private String type;

	private String query;

	private String language;

	private String unit;
}
