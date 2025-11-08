package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 08-Nov-2025
 */

public class ForLoopWithoutForOrIf {

    // Simulate a for loop using recursion and exception handling
    static void simulateForLoop(int start, int end) {
        try {
            // Create an array of size (end - start + 1)
            // If start > end, this will throw NegativeArraySizeException
            int[] arr = new int[end - start + 1];
            
            // Print current value
            System.out.println(start);

            // Recursive call (acts like "i++" in a loop)
            simulateForLoop(start + 1, end);

        } catch (Exception e) {
            // Stop recursion when exception occurs (no condition needed)
        }
    }

    // Test helper function
    static void runTestCase(int caseNo, int start, int end) {
        System.out.println("=== Test Case " + caseNo + " ===");
        System.out.println("Range: " + start + " to " + end);
        System.out.println("Output:");
        simulateForLoop(start, end);
        System.out.println(); // separator
    }

    public static void main(String[] args) {
        runTestCase(1, 1, 5);

        runTestCase(2, -3, 2);

        runTestCase(3, 7, 7);

        runTestCase(4, 10, 5);
    }
}
