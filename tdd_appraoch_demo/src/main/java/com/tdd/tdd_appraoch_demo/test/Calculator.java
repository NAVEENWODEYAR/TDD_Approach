package com.tdd.tdd_appraoch_demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Naveen K Wodeyar
 * @date 05-Aug-2024
 */
@Service
public class Calculator {
	
	private static final Logger log = LoggerFactory.getLogger(Calculator.class);
	
	public static int sum(int a, int b) {
		log.warn("Addition");
		return a+b;
	}
	
	public static Integer diff(int a, int b) {
		log.warn("Substraction");
		return a-b;
	}
	
	public static int product(int a, int b) {
		log.warn("Multiplication");
		return a+b;
	}

}
