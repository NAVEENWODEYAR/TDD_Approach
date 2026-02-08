package com.unit.mockito.boxing;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyaar,
 * @Date 08-Feb-2026
 */

class BoxingDemoTest {

    @Test
    void testManualBoxing() {
        Integer result = BoxingDemo.manualBoxing(10);
        assertEquals(10, result);
    }

    @Test
    void testManualUnboxing() {
        int result = BoxingDemo.manualUnboxing(Integer.valueOf(20));
        assertEquals(20, result);
    }

    @Test
    void testAutoboxingWithCollection() {
        List<Integer> list = BoxingDemo.addValues(5, 15);

        assertEquals(2, list.size());
        assertEquals(5, list.get(0));
        assertEquals(15, list.get(1));
    }

    @Test
    void testAutoUnboxingSum() {
        List<Integer> list = BoxingDemo.addValues(10, 30);
        int sum = BoxingDemo.calculateSum(list);

        assertEquals(40, sum);
    }

    @Test
    void testIntegerComparison() {
        Integer a = 100;
        Integer b = 100;

        Integer x = 200;
        Integer y = 200;

        assertTrue(a == b);          // cached values
        assertFalse(x == y);         // different objects
        assertTrue(x.equals(y));     // correct comparison
    }
}

