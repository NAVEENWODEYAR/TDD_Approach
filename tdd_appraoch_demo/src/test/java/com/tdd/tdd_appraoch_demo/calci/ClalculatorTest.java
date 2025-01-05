package com.tdd.tdd_appraoch_demo.calci;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tdd.tdd_appraoch_demo.test.Calculator;

/**
 * @author Naveen K Wodeyar
 * @date 05-Aug-2024
 */

public class ClalculatorTest {
	
	private static final Logger log = LoggerFactory.getLogger(ClalculatorTest.class);
	
	@BeforeAll
	public static void init() {
		log.trace("@BeforeAll");
		System.out.println("\nBefore all the test cases,");
	}
	
	@AfterAll
	public static void end() {
		log.error("@AfterAll");
		System.out.println("\nAfter all the test cases,");
	}

	
	@BeforeEach
	public void beforeEachTestCase() {
		log.debug("@BeforeEach");
		System.out.println("\nBefore each test cases,");
	}
	
	@AfterEach
	public void afterEachTestCase() {
		log.warn("@AfterEach");
		System.out.println("\nAfter each test cases,");
	}
	
	@Test
	@DisplayName("Addition Test")
	public void sumTest() {
		int actualValue = Calculator.sum(2, 2);
		int expectedValue = 4;
		
		System.out.println("\nTest case->1");
		Assertions.assertEquals(actualValue, expectedValue,"Test failed,");
	}
	
	@Test
	@Disabled
	public void diffTest() {
		int actualValue = Calculator.diff(2, 1);
		
		System.out.println("\nTest case->2");
		Assertions.assertEquals(actualValue, 1,"Test failed,");

	}
}
