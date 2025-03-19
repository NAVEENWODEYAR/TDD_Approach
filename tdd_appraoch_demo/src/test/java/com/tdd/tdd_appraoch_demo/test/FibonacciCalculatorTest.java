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
class FibonacciCalculatorTest {

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
	
    private final FibonacciCalculator calculator = new FibonacciCalculator();
	
	@Test
    public void testCalculateFibonacci() {
        assertEquals(0, calculator.calculateFibonacci(0));
        assertEquals(1, calculator.calculateFibonacci(1));
        assertEquals(2, calculator.calculateFibonacci(3));
        assertEquals(5, calculator.calculateFibonacci(5));
        assertEquals(21, calculator.calculateFibonacci(8));
    }

    @Test
    public void testCalculateFibonacciIterative() {
        assertEquals(0, calculator.calculateFibonacciIterative(0));
        assertEquals(1, calculator.calculateFibonacciIterative(1));
        assertEquals(2, calculator.calculateFibonacciIterative(3));
        assertEquals(5, calculator.calculateFibonacciIterative(5));
        assertEquals(21, calculator.calculateFibonacciIterative(8));
    }

}
