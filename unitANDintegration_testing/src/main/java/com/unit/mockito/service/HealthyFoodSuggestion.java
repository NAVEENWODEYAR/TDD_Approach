package com.unit.mockito.service;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyaar,
 * @Date 11-Feb-2026
 */

public class HealthyFoodSuggestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Healthy Food Suggestion System =====");
        System.out.println("Select your health goal:");
        System.out.println("1. Weight Loss");
        System.out.println("2. Muscle Gain");
        System.out.println("3. Improve Immunity");
        System.out.println("4. Heart Health");
        System.out.println("5. General Good Health");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();

        System.out.println("\nRecommended Foods:");

        switch (choice) {
            case 1:
                System.out.println("- Oats");
                System.out.println("- Brown Rice");
                System.out.println("- Boiled Eggs");
                System.out.println("- Green Vegetables (Spinach, Broccoli)");
                System.out.println("- Fruits (Apple, Papaya)");
                break;

            case 2:
                System.out.println("- Chicken Breast");
                System.out.println("- Eggs");
                System.out.println("- Paneer / Tofu");
                System.out.println("- Peanut Butter");
                System.out.println("- Bananas");
                break;

            case 3:
                System.out.println("- Citrus Fruits (Orange, Lemon)");
                System.out.println("- Garlic");
                System.out.println("- Ginger");
                System.out.println("- Yogurt");
                System.out.println("- Almonds");
                break;

            case 4:
                System.out.println("- Oats");
                System.out.println("- Fatty Fish (Salmon)");
                System.out.println("- Walnuts");
                System.out.println("- Olive Oil");
                System.out.println("- Leafy Greens");
                break;

            case 5:
                System.out.println("- Fresh Fruits");
                System.out.println("- Green Vegetables");
                System.out.println("- Whole Grains");
                System.out.println("- Nuts and Seeds");
                System.out.println("- Plenty of Water");
                break;

            default:
                System.out.println("Invalid choice. Please restart and select between 1-5.");
        }

        scanner.close();
    }
}
