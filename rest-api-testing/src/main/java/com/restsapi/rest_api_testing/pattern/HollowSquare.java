package com.restsapi.rest_api_testing.pattern;

/**
 * @author NaveenWodeyar
 * @date 23-Mar-2025
 * @time 8:04:34 pm
 * @location 
 */

public class HollowSquare {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print border or space inside
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

