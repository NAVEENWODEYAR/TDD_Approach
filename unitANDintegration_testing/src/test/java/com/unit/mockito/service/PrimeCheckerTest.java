package com.unit.mockito.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyaar,
 * @Date 03-Nov-2025
 */

public class PrimeCheckerTest {

    private PrimeChecker primeChecker;

    @BeforeEach
    void setUp() {
        primeChecker = new PrimeChecker();
    }

    @Test
    void testPrimeNumbers() {
        assertTrue(primeChecker.isPrime(2));
        assertTrue(primeChecker.isPrime(3));
        assertTrue(primeChecker.isPrime(5));
        assertTrue(primeChecker.isPrime(7));
        assertTrue(primeChecker.isPrime(11));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(primeChecker.isPrime(1));
        assertFalse(primeChecker.isPrime(4));
        assertFalse(primeChecker.isPrime(9));
        assertFalse(primeChecker.isPrime(15));
        assertFalse(primeChecker.isPrime(100));
    }

    @Test
    void testEdgeCases() {
        assertFalse(primeChecker.isPrime(0));
        assertFalse(primeChecker.isPrime(-7));
    }
}
