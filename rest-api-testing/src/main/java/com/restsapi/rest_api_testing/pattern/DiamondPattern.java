package com.restsapi.rest_api_testing.pattern;

/**
 * @author NaveenWodeyar
 * @date 23-Mar-2025
 * @time 8:03:25 pm
 * @location 
 */

public class DiamondPattern {
	
    public static void main(String[] args) {
        int n = 5; // Number of rows (upper half)
        
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
