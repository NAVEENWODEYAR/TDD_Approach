package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Mar-2026
 */

public class ReturnExample {
	
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                return; // exits the main method completely
            }

            System.out.println(i);
        }

        // This line will never execute
        System.out.println("This will not print.");
    }
}