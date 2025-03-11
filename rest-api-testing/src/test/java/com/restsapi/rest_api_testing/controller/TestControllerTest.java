package com.restsapi.rest_api_testing.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestControllerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		// Given the current date and time, we generate the expected format
		String expected = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm ddMMMMyyyy"));

		// When calling the test method
		String actual = new TestController().test();

		// Then the actual output should match the expected output
		assertEquals(expected, actual);
	}

}
