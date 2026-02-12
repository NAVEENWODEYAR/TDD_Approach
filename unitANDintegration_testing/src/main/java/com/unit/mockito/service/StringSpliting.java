package com.unit.mockito.service;
import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Feb-2026
 */

public class StringSpliting {

	    // LeetCode-style solution method
	    public static List<String> splitString(String s, char delimiter) {
	        List<String> result = new ArrayList<>();
	        StringBuilder current = new StringBuilder();

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (ch == delimiter) {
	                if (current.length() > 0) {
	                    result.add(current.toString());
	                    current.setLength(0); // reset builder
	                }
	            } else {
	                current.append(ch);
	            }
	        }

	        // Add last token if exists
	        if (current.length() > 0) {
	            result.add(current.toString());
	        }

	        return result;
	    }

	    // Main method with test cases
	    public static void main(String[] args) {

	        System.out.println("Test Case 1:");
	        System.out.println(splitString("hello,world", ','));
	        // Expected: [hello, world]

	        System.out.println("\nTest Case 2:");
	        System.out.println(splitString("a,,b,c", ','));
	        // Expected: [a, b, c]

	        System.out.println("\nTest Case 3:");
	        System.out.println(splitString(",,abc,,", ','));
	        // Expected: [abc]

	        System.out.println("\nTest Case 4:");
	        System.out.println(splitString("", ','));
	        // Expected: []

	        System.out.println("\nTest Case 5:");
	        System.out.println(splitString(",,,,", ','));
	        // Expected: []
	    }
	

}
