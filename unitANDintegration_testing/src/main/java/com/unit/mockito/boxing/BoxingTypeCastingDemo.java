package com.unit.mockito.boxing;

/**
 * @author Naveen K Wodeyaar,
 * @Date 21-Aug-2026
 */

public class BoxingTypeCastingDemo {

    public static void main(String[] args) {

        // =====================================================
        // 1. BOXING
        // =====================================================
        // Boxing means manually converting a primitive data type
        // into its corresponding wrapper class object.

        int num = 10;

        // Manual boxing: converting int to Integer
        Integer boxedNum = Integer.valueOf(num);

        System.out.println("----- Boxing -----");
        System.out.println("Primitive int: " + num);
        System.out.println("Boxed Integer: " + boxedNum);


        // =====================================================
        // 2. AUTOBOXING
        // =====================================================
        // Autoboxing means Java automatically converts a primitive
        // into its corresponding wrapper class object.

        int age = 20;

        // Java automatically converts int -> Integer
        Integer autoBoxedAge = age;

        System.out.println("\n----- Autoboxing -----");
        System.out.println("Primitive int: " + age);
        System.out.println("Autoboxed Integer: " + autoBoxedAge);


        // Another example of autoboxing
        double price = 99.50;
        Double autoBoxedPrice = price;  // double -> Double

        System.out.println("Primitive double: " + price);
        System.out.println("Autoboxed Double: " + autoBoxedPrice);


        // =====================================================
        // 3. UNBOXING
        // =====================================================
        // Unboxing means converting a wrapper class object
        // back into its corresponding primitive data type.

        Integer marks = 85;

        // Java automatically converts Integer -> int
        int primitiveMarks = marks;

        System.out.println("\n----- Unboxing -----");
        System.out.println("Integer object: " + marks);
        System.out.println("Primitive int: " + primitiveMarks);


        // =====================================================
        // 4. TYPE CASTING
        // =====================================================
        // Type casting means converting one data type into another.

        // -------- Widening Casting --------
        // Smaller data type -> larger data type
        // This is done automatically.

        int number = 100;
        double decimalNumber = number;  // int -> double

        System.out.println("\n----- Widening Type Casting -----");
        System.out.println("int value: " + number);
        System.out.println("double value: " + decimalNumber);


        // -------- Narrowing Casting --------
        // Larger data type -> smaller data type
        // This must be done explicitly.

        double value = 99.99;

        // Explicit casting: double -> int
        int convertedValue = (int) value;

        System.out.println("\n----- Narrowing Type Casting -----");
        System.out.println("double value: " + value);
        System.out.println("int value after casting: " + convertedValue);


        // =====================================================
        // 5. TYPE CASTING WITH CHARACTERS
        // =====================================================

        char character = 'A';

        // char can be converted to int.
        // The ASCII/Unicode value of 'A' is 65.
        int asciiValue = character;

        System.out.println("\n----- Character Type Casting -----");
        System.out.println("Character: " + character);
        System.out.println("Integer value: " + asciiValue);


        // int can be explicitly converted to char
        int code = 66;
        char newCharacter = (char) code;

        System.out.println("Integer value: " + code);
        System.out.println("Character after casting: " + newCharacter);
    }
}