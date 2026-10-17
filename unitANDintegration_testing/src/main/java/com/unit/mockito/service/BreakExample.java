package com.unit.mockito.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Naveen K Wodeyaar
 * @Date 12-Mar-2026
 */
public class BreakExample {

    /**
     * LeetCode-style Solution Method:
     * Simulates a loop up to a given limit and breaks when it hits the break value.
     * 
     * @param limit      The upper bound of the loop
     * @param breakValue The value at which the loop should break
     * @return A list of integers processed before the break
     */
    public static List<Integer> getNumbersBeforeBreak(int limit, int breakValue) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            if (i == breakValue) {
                break; // stops the loop when i equals breakValue
            }
            result.add(i);
        }

        return result;
    }

    // --- LeetCode-Style Test Runner (main method) ---
    public static void main(String[] args) {
        // Define your test cases (Inputs vs Expected Outputs)
        TestCase[] testCases = {
            new TestCase(5, 3, List.of(1, 2)),          // Example 1: Standard break
            new TestCase(5, 1, List.of()),              // Example 2: Immediate break
            new TestCase(3, 10, List.of(1, 2, 3)),      // Example 3: No break occurs
            new TestCase(1, 1, List.of()),              // Edge Case: Limit 1, break 1
            new TestCase(4, 5, List.of(1, 2, 3, 4)),    // Edge Case: Break out of bounds
            new TestCase(6, 4, List.of(1, 2, 3))        // Standard mid-range break
        };

        int passedCount = 0;
        System.out.println("========================================");
        System.out.println("   RUNNING LEETCODE-STYLE TEST SUITE    ");
        System.out.println("========================================\n");

        for (int i = 0; i < testCases.length; i++) {
            TestCase tc = testCases[i];
            
            // Execute the solution method
            List<Integer> actual = getNumbersBeforeBreak(tc.limit, tc.breakValue);
            
            // Compare results
            boolean passed = Objects.equals(actual, tc.expected);
            if (passed) {
                passedCount++;
                System.out.println("Test Case " + (i + 1) + ": [PASSED]");
            } else {
                System.out.println("Test Case " + (i + 1) + ": [FAILED]");
            }
            
            System.out.println("  Input    : limit = " + tc.limit + ", breakValue = " + tc.breakValue);
            System.out.println("  Expected : " + tc.expected);
            System.out.println("  Actual   : " + actual);
            System.out.println("----------------------------------------");
        }

        System.out.println("\nResults Summary: " + passedCount + " / " + testCases.length + " test cases passed.");
    }

    /**
     * Helper structure to mimic LeetCode's test case inputs and expected outputs.
     */
    static class TestCase {
        int limit;
        int breakValue;
        List<Integer> expected;

        public TestCase(int limit, int breakValue, List<Integer> expected) {
            this.limit = limit;
            this.breakValue = breakValue;
            this.expected = expected;
        }
    }
    
    
}