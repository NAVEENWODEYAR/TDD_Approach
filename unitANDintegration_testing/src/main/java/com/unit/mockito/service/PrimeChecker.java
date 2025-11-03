/**
 * @author Naveen K Wodeyaar,
 * @Date 03-Nov-2025
 */
package com.unit.mockito.service;

public class PrimeChecker {

    /**
     * Checks if a number is prime.
     * @param number the number to check
     * @return true if number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
