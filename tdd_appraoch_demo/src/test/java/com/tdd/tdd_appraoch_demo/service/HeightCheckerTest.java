package com.tdd.tdd_appraoch_demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 28-Jun-2025
 */

public class HeightCheckerTest {

    @Test
    public void testInvalidHeight() {
        assertEquals("Invalid", HeightChecker.getHeightCategory(0));
        assertEquals("Invalid", HeightChecker.getHeightCategory(-50));
    }

    @Test
    public void testShortHeight() {
        assertEquals("Short", HeightChecker.getHeightCategory(100));
        assertEquals("Short", HeightChecker.getHeightCategory(149.9));
    }

    @Test
    public void testAverageHeight() {
        assertEquals("Average", HeightChecker.getHeightCategory(150));
        assertEquals("Average", HeightChecker.getHeightCategory(165));
        assertEquals("Average", HeightChecker.getHeightCategory(180));
    }

    @Test
    public void testTallHeight() {
        assertEquals("Tall", HeightChecker.getHeightCategory(181));
        assertEquals("Tall", HeightChecker.getHeightCategory(200));
    }
}

