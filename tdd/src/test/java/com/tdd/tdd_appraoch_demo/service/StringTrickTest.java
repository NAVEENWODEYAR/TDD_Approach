package com.tdd.tdd_appraoch_demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTrickTest {

    @Test
    public void testStringIdentityAndInterning() {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = c.intern();

        // Identity tests
        assertTrue(a == b, "a and b should point to the same interned string");
        assertFalse(a == c, "a and c should not be the same object");
        assertTrue(a == d, "a and d should point to the same interned string");

        // Content tests
        assertEquals(a, c, "a and c should have the same content");
        assertEquals(a, d, "a and d should have the same content");
    }
}

