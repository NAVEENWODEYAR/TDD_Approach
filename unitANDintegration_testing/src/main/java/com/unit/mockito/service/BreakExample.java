package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Mar-2026
 */

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                break; // stops the loop when i = 3
            }

            System.out.println(i);
        }

        // Program continues after loop
        System.out.println("Loop ended using break.");
    }
}
