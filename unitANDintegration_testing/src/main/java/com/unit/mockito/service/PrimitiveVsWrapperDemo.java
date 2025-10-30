package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 30-Oct-2025
 */

public class PrimitiveVsWrapperDemo {

    // Method to demonstrate auto-boxing and unboxing
    public static int addIntegers(int a, Integer b) {
        // b will be auto-unboxed here
        return a + b;
    }

    // Method to check equality between boolean and Boolean
    public static boolean areBooleansEqual(boolean primitiveBool, Boolean wrapperBool) {
        // wrapperBool will be auto-unboxed here
        return primitiveBool == wrapperBool;
    }

    // Method to safely unbox, handling null
    public static int safeUnbox(Integer value, int defaultValue) {
        return (value != null) ? value : defaultValue;
    }

    // Method to demonstrate wrapper caching
    public static boolean isIntegerCached(Integer a, Integer b) {
        return a == b; // true only for cached values (-128 to 127)
    }

    // Method to demonstrate primitive vs wrapper null behavior
    public static boolean isWrapperNull(Integer value) {
        return value == null;
    }
}
