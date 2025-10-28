package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 28-Oct-2025
 */

public class IdealWeightCalculator {

    /**
     * Converts height in feet to meters.
     */
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    /**
     * Converts height in centimeters to meters.
     */
    public static double cmToMeters(double cm) {
        return cm / 100.0;
    }

    /**
     * Returns an array containing [minWeight, maxWeight] based on height (in meters).
     * Uses BMI range 18.5–24.9.
     */
    public static double[] getIdealWeightRange(double heightMeters) {
        double min = 18.5 * Math.pow(heightMeters, 2);
        double max = 24.9 * Math.pow(heightMeters, 2);
        return new double[]{min, max};
    }

    /**
     * Prints weight range based on height and unit.
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Choose input type:");
        System.out.println("1. Height in centimeters");
        System.out.println("2. Height in feet");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        double heightMeters = 0;

        if (choice == 1) {
            System.out.print("Enter your height in centimeters: ");
            double heightCm = sc.nextDouble();
            heightMeters = cmToMeters(heightCm);
        } else if (choice == 2) {
            System.out.print("Enter your height in feet: ");
            double heightFeet = sc.nextDouble();
            heightMeters = feetToMeters(heightFeet);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        double[] range = getIdealWeightRange(heightMeters);

        System.out.printf("\nBased on your height of %.2f meters:%n", heightMeters);
        System.out.printf("Your ideal weight range is between %.1f kg and %.1f kg.%n", range[0], range[1]);

        sc.close();
    }
}
