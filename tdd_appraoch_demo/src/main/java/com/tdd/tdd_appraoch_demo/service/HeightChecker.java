package com.tdd.tdd_appraoch_demo.service;

/**
 * @author Naveen K Wodeyar
 * @date 28-Jun-2025
 */

public class HeightChecker {

    /**
     * Returns a height category based on the given height in cm.
     * @param heightInCm user's height in centimeters
     * @return a string category: "Invalid", "Short", "Average", "Tall"
     */
    public static String getHeightCategory(double heightInCm) {
        if (heightInCm <= 0) {
            return "Invalid";
        } else if (heightInCm < 150) {
            return "Short";
        } else if (heightInCm <= 180) {
            return "Average";
        } else {
            return "Tall";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        String category = getHeightCategory(height);
        System.out.println("You are: " + category);

        scanner.close();
    }
}
