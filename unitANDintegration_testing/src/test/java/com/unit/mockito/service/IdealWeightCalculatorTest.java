/**
 * @author Naveen K Wodeyaar,
 * @Date 28-Oct-2025
 */
package com.unit.mockito.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class IdealWeightCalculatorTest {

	    @Test
	    void testFeetToMeters() {
	        assertEquals(1.524, IdealWeightCalculator.feetToMeters(5.0), 0.001);
	        assertEquals(1.646, IdealWeightCalculator.feetToMeters(5.4), 0.001);
	    }

	    @Test
	    void testCmToMeters() {
	        assertEquals(1.80, IdealWeightCalculator.cmToMeters(180), 0.001);
	        assertEquals(1.65, IdealWeightCalculator.cmToMeters(165), 0.001);
	    }

	    @Test
	    void testIdealWeightRange() {
	        double[] range = IdealWeightCalculator.getIdealWeightRange(1.65);
	        assertEquals(50.3, range[0], 0.5);  // Min
	        assertEquals(68.0, range[1], 0.5);  // Max
	    }

	    @Test
	    void testIdealWeightRangeForTallPerson() {
	        double[] range = IdealWeightCalculator.getIdealWeightRange(1.80);
	        assertEquals(59.9, range[0], 0.5);
	        assertEquals(80.7, range[1], 0.5);
	    }
	}



