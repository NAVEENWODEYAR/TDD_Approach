package com.unit.mockito.service;

import java.util.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 20-May-2026
 */

public class TrickyJavaPrograms {

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("========== TRICKY JAVA PROGRAMS ==========\n");

        swapWithoutThirdVariable();
        stringImmutability();
        finallyBlockBehavior();
        integerCaching();
        recursiveFactorial(5);
        fibonacciWithoutLoop(6);
        reverseStringWithoutBuiltin();
        checkPalindrome("madam");
        armstrongNumber(153);
        deadlockExampleInfo();
    }

    // ==========================================================
    // 1. SWAP TWO NUMBERS WITHOUT THIRD VARIABLE
    // ==========================================================
    static void swapWithoutThirdVariable() {

        int a = 10;
        int b = 20;

        System.out.println("1. Swap Without Third Variable");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Logic using arithmetic operators
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
        System.out.println();
    }

    // ==========================================================
    // 2. STRING IMMUTABILITY
    // ==========================================================
    static void stringImmutability() {

        System.out.println("2. String Immutability");

        String s1 = "Java";

        // concat() creates new object
        s1.concat(" Programming");

        // Original string unchanged
        System.out.println("String after concat: " + s1);

        // Correct way
        s1 = s1.concat(" Programming");

        System.out.println("Updated String: " + s1);
        System.out.println();
    }

    // ==========================================================
    // 3. FINALLY BLOCK BEHAVIOR
    // ==========================================================
    static void finallyBlockBehavior() {

        System.out.println("3. Finally Block Behavior");

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        }
        finally {
            // finally block always executes
            System.out.println("Finally Block Executed");
        }

        System.out.println();
    }

    // ==========================================================
    // 4. INTEGER CACHING TRICK
    // ==========================================================
    static void integerCaching() {

        System.out.println("4. Integer Caching");

        Integer a = 127;
        Integer b = 127;

        // JVM caches values between -128 to 127
        System.out.println("127 == 127 : " + (a == b));

        Integer x = 128;
        Integer y = 128;

        // Different objects outside cache range
        System.out.println("128 == 128 : " + (x == y));

        System.out.println();
    }

    // ==========================================================
    // 5. RECURSIVE FACTORIAL
    // ==========================================================
    static int recursiveFactorial(int n) {

        if (n == 5)
            System.out.println("5. Recursive Factorial");

        // Base condition
        if (n == 1)
            return 1;

        int result = n * recursiveFactorial(n - 1);

        if (n == 5)
            System.out.println("Factorial of 5 = " + result + "\n");

        return result;
    }

    // ==========================================================
    // 6. FIBONACCI WITHOUT LOOP
    // ==========================================================
    static int fibonacciWithoutLoop(int n) {

        if (n == 6)
            System.out.println("6. Fibonacci Without Loop");

        // Base conditions
        if (n <= 1)
            return n;

        int result = fibonacciWithoutLoop(n - 1)
                   + fibonacciWithoutLoop(n - 2);

        if (n == 6)
            System.out.println("Fibonacci(6) = " + result + "\n");

        return result;
    }

    // ==========================================================
    // 7. REVERSE STRING WITHOUT BUILT-IN FUNCTION
    // ==========================================================
    static void reverseStringWithoutBuiltin() {

        System.out.println("7. Reverse String");

        String str = "Java";
        String reverse = "";

        // Traverse from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse);
        System.out.println();
    }

    // ==========================================================
    // 8. PALINDROME CHECK
    // ==========================================================
    static void checkPalindrome(String str) {

        System.out.println("8. Palindrome Check");

        String reversed = "";

        // Reverse string manually
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Compare original and reversed
        if (str.equals(reversed)) {
            System.out.println(str + " is Palindrome");
        }
        else {
            System.out.println(str + " is NOT Palindrome");
        }

        System.out.println();
    }

    // ==========================================================
    // 9. ARMSTRONG NUMBER
    // ==========================================================
    static void armstrongNumber(int number) {

        System.out.println("9. Armstrong Number");

        int original = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            // Cube of each digit
            sum += digit * digit * digit;

            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is Armstrong Number");
        }
        else {
            System.out.println(original + " is NOT Armstrong Number");
        }

        System.out.println();
    }

    // ==========================================================
    // 10. DEADLOCK CONCEPT
    // ==========================================================
    static void deadlockExampleInfo() {

        System.out.println("10. Deadlock Concept");

        System.out.println("Deadlock happens when:");
        System.out.println("Thread-1 waits for Thread-2 resource");
        System.out.println("Thread-2 waits for Thread-1 resource");

        System.out.println("\nCommon Interview Question:");
        System.out.println("How to avoid deadlock?");
        System.out.println("- Lock ordering");
        System.out.println("- TryLock()");
        System.out.println("- Timeout handling");

        System.out.println("\n========== END ==========");
    }
}
