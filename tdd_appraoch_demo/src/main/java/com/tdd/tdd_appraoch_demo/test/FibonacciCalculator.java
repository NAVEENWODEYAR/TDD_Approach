package com.tdd.tdd_appraoch_demo.test;

/**
 * @author Naveen K Wodeyar
 * @date 19-Mar-2025
 */

public class FibonacciCalculator {

    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public int calculateFibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
