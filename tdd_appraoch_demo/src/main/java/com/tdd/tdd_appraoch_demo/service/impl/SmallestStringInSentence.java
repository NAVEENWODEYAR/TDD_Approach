package com.tdd.tdd_appraoch_demo.service.impl;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 17-May-2026
 */

public class SmallestStringInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Assume first word is the smallest
        String smallest = words[0];

        // Find smallest word
        for (String word : words) {

            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }

        // Output result
        System.out.println("Smallest word: " + smallest);
        System.out.println("Length: " + smallest.length());

        sc.close();
    }
}