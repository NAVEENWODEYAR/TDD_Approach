package com.tdd.tdd_appraoch_demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrickySwapTest {

    @Test
    public void testSwapDoesNotChangeOriginalObjects() {
        TrickySwap.NumberWrapper num1 = new TrickySwap.NumberWrapper(10);
        TrickySwap.NumberWrapper num2 = new TrickySwap.NumberWrapper(20);

        TrickySwap.swap(num1, num2);

        // Assert that the original values are unchanged
        assertEquals(10, num1.value);
        assertEquals(20, num2.value);
    }
}

