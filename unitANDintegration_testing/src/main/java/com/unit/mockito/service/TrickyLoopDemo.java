package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Mar-2026
 */

public class TrickyLoopDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            // Skip number 2
            if (i == 2) {
                System.out.println("Continue executed at i = " + i);
                continue; // skips the rest of this iteration
            }

            // Break the loop when i = 5
            if (i == 5) {
                System.out.println("Break executed at i = " + i);
                break; // terminates the loop
            }

            // Return when i = 8 (this will never run because break happens first)
            if (i == 8) {
                System.out.println("Return executed at i = " + i);
                return; // exits the method completely
            }

            // Normal execution
            System.out.println("Current value: " + i);
        }

        // This line runs after break but would not run if return executed
        System.out.println("Program continues after the loop.");
    }
}