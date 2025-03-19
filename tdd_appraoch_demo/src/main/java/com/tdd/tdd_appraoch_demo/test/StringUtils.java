package com.tdd.tdd_appraoch_demo.test;

/**
 * @author Naveen K Wodeyar
 * @date 19-Mar-2025
 */

public class StringUtils {

    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public int countVowels(String str) {
        int count = 0;
        if (str != null) {
            for (char c : str.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    count++;
                }
            }
        }
        return count;
    }
}
