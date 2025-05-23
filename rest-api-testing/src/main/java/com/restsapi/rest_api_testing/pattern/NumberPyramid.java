package com.restsapi.rest_api_testing.pattern;

/**
 * @author NaveenWodeyar
 * @date 23-Mar-2025
 * @time 8:04:10 pm
 * @location 
 */

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
