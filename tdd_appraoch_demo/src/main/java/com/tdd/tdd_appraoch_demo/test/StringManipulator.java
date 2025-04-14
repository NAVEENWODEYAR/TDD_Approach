package com.tdd.tdd_appraoch_demo.test;

/**
 * @author Naveen K Wodeyar
 * @date 14-Apr-2025
 */

public class StringManipulator {

    // Method to reverse a string
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverse(input); // Reuse the reverse method
        return input.equals(reversed);
    }

    // Method to count the occurrences of a character in a string
    public int countCharOccurrences(String input, char ch) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

