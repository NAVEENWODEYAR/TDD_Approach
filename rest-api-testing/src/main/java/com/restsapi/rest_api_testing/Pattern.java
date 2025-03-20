package com.restsapi.rest_api_testing;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed
        
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print '*' with a space
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

