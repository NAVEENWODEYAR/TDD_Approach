package com.unit.mockito.boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates Autoboxing and Unboxing in Java.
 *
 * <p>
 * Autoboxing:  Automatic conversion from primitive type to wrapper class.
 * Unboxing:    Automatic conversion from wrapper class to primitive type.
 * </p>
 *
 * @author Naveen K Wodeyaar,
 * @Date 26-Aug-2026
 */

public class AutoboxingUnboxingExample {

    /**
     * Main method to demonstrate autoboxing and unboxing.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // ------------------------------------------------------------
        // 1. Autoboxing
        // ------------------------------------------------------------

        // 'num' is a primitive int.
        int num = 10;

        // Autoboxing: int -> Integer
        // Java automatically converts the primitive int
        // into an Integer wrapper object.
        Integer boxedNum = num;


        // ------------------------------------------------------------
        // 2. Unboxing
        // ------------------------------------------------------------

        // Unboxing: Integer -> int
        // Java automatically converts the Integer object
        // back into a primitive int.
        int unboxedNum = boxedNum;


        // ------------------------------------------------------------
        // 3. Autoboxing with Collection
        // ------------------------------------------------------------

        // Java Collections store objects, not primitive types.
        List<Integer> numbers = new ArrayList<>();

        // Autoboxing happens automatically:
        // int 20 -> Integer 20
        numbers.add(20);


        // ------------------------------------------------------------
        // 4. Unboxing with Collection
        // ------------------------------------------------------------

        // numbers.get(0) returns an Integer object.
        // Java automatically unboxes it:
        // Integer 20 -> int 20
        int value = numbers.get(0);


        // ------------------------------------------------------------
        // Display the results
        // ------------------------------------------------------------

        System.out.println("Original int value : " + num);
        System.out.println("After autoboxing   : " + boxedNum);
        System.out.println("After unboxing     : " + unboxedNum);
        System.out.println("Value from List    : " + value);
    }
}
