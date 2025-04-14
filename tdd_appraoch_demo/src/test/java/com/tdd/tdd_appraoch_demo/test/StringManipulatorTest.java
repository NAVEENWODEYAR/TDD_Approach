package com.tdd.tdd_appraoch_demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 14-Apr-2025
 */

class StringManipulatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	 private StringManipulator stringManipulator;

	    // Set up the StringManipulator instance before each test
	    @BeforeEach
	    public void setUp() {
	        stringManipulator = new StringManipulator();
	    }

	    // Test case for the reverse method
	    @Test
	    public void testReverse() {
	        assertEquals("edcba", stringManipulator.reverse("abcde"), "\"abcde\" should reverse to \"edcba\"");
	        assertEquals("hello", stringManipulator.reverse("olleh"), "\"olleh\" should reverse to \"hello\"");
	    }

	    // Test case for the isPalindrome method
	    @Test
	    public void testIsPalindrome() {
	        assertTrue(stringManipulator.isPalindrome("madam"), "\"madam\" should be a palindrome");
	        assertFalse(stringManipulator.isPalindrome("hello"), "\"hello\" should not be a palindrome");
	    }

	    // Test case for the countCharOccurrences method
	    @Test
	    public void testCountCharOccurrences() {
	        assertEquals(3, stringManipulator.countCharOccurrences("hello world", 'o'), "'o' appears 3 times in \"hello world\"");
	        assertEquals(0, stringManipulator.countCharOccurrences("hello", 'z'), "'z' does not appear in \"hello\"");
	    }

}
