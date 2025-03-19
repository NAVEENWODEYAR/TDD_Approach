/**
 * @author Naveen K Wodeyar
 * @date 19-Mar-2025
 */
package com.tdd.tdd_appraoch_demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class StringUtilsTest {

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
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	private final StringUtils stringUtils = new StringUtils();

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertFalse(stringUtils.isPalindrome("java"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(3, stringUtils.countVowels("hello"));
        assertEquals(2, stringUtils.countVowels("java"));
        assertEquals(5, stringUtils.countVowels("aeiou"));
        assertEquals(0, stringUtils.countVowels("bcdf"));
    }

}
