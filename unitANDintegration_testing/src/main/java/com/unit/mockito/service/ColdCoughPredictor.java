package com.unit.mockito.service;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyaar,
 * @Date 19-Nov-2025
 */

public class ColdCoughPredictor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cold & Cough Symptom Predictor ===");

        System.out.print("Do you have sneezing? (yes/no): ");
        String sneezing = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you have a runny nose? (yes/no): ");
        String runnyNose = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you have a sore throat? (yes/no): ");
        String soreThroat = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you have a cough? (yes/no): ");
        String cough = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you have a fever? (yes/no): ");
        String fever = scanner.nextLine().trim().toLowerCase();

        System.out.println("\n--- Prediction Result ---");

        if (fever.equals("yes") && cough.equals("yes")) {
            System.out.println("Possible viral infection (flu or strong cold). Consider resting and monitoring symptoms.");
        }
        else if (sneezing.equals("yes") || runnyNose.equals("yes")) {
            System.out.println("You may have a common cold.");
        }
        else if (cough.equals("yes") && soreThroat.equals("yes")) {
            System.out.println("You may have a throat irritation or mild infection.");
        }
        else {
            System.out.println("Symptoms do not strongly indicate cold or cough.");
        }

        System.out.println("\n(Note: This is a simple program and not a medical diagnosis.)");

        scanner.close();
    }
}
