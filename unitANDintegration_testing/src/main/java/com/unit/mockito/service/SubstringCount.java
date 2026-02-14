package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 13-Feb-2026
 */

public class SubstringCount {
    public static void main(String[] args) {
        String str = "abababa";
        String sub = "aba";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
