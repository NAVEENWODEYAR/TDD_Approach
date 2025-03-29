/**
 * @author NaveenWodeyar
 * @date 29-Mar-2025
 * @time 9:38:33 pm
 * @location 
 */
package com.restsapi.rest_api_testing.pattern;

/**
 * 
 */
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop through rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

