package com.unit.mockito.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 30-Oct-2025
 */

public class PrimitiveVsWrapperDemoTest {

    @Test
    void testAddIntegers_AutoBoxingAndUnboxing() {
        int result = PrimitiveVsWrapperDemo.addIntegers(5, Integer.valueOf(10));
        assertEquals(15, result, "Should correctly add int and Integer");
    }

    @Test
    void testAreBooleansEqual_AutoUnboxing() {
        assertTrue(PrimitiveVsWrapperDemo.areBooleansEqual(true, Boolean.TRUE));
        assertFalse(PrimitiveVsWrapperDemo.areBooleansEqual(false, Boolean.TRUE));
    }

    @Test
    void testSafeUnbox_NullHandling() {
        assertEquals(100, PrimitiveVsWrapperDemo.safeUnbox(null, 100),
                "Should return default value when wrapper is null");
        assertEquals(5, PrimitiveVsWrapperDemo.safeUnbox(Integer.valueOf(5), 100),
                "Should return unboxed value when not null");
    }

    @Test
    void testIntegerCaching() {
        Integer a = 100;
        Integer b = 100;
        Integer x = 200;
        Integer y = 200;

        assertTrue(PrimitiveVsWrapperDemo.isIntegerCached(a, b),
                "Integers between -128 and 127 should be cached");
        assertFalse(PrimitiveVsWrapperDemo.isIntegerCached(x, y),
                "Integers outside the cache range should not be cached");
    }

    @Test
    void testWrapperNullability() {
        assertTrue(PrimitiveVsWrapperDemo.isWrapperNull(null),
                "Wrapper can be null");
        assertFalse(PrimitiveVsWrapperDemo.isWrapperNull(10),
                "Wrapper with value should not be null");
    }
}

