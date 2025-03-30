/**
 * @author NaveenWodeyar
 * @date 30-Mar-2025
 * @time 9:56:04 pm
 * @location 
 */
package com.restsapi.rest_api_testing.pattern;

/**
 * 
 */
import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Upper half of the half diamond
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the half diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

