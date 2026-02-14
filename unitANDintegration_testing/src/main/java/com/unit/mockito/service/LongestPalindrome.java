package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 13-Feb-2026
 */

public class LongestPalindrome {
    
    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && 
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String str = "babad";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String odd = expand(str, i, i);
            String even = expand(str, i, i + 1);

            if (odd.length() > longest.length())
                longest = odd;

            if (even.length() > longest.length())
                longest = even;
        }

        System.out.println("Longest Palindrome: " + longest);
    }
    
}
