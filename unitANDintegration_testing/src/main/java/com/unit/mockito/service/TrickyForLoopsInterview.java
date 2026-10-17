/**
 * @author Naveen K Wodeyaar,
 * @Date 17-Oct-2026
 */
package com.unit.mockito.service;

public class TrickyForLoopsInterview {

    public static void main(String[] args) {
        System.out.println("=== 1. Running Semicolon Trap ===");
        semicolonTrap();
        
        // NOTE: Methods 2, 3, and 4 result in infinite loops. 
        // Uncomment them one at a time to test them individually!
        
        // System.out.println("\n=== 2. Running Byte Overflow Trap ===");
        // byteOverflowTrap();
        
        // System.out.println("\n=== 3. Running Floating-Point Precision Trap ===");
        // floatingPointTrap();
        
        // System.out.println("\n=== 4. Running Wrong Direction Trap ===");
        // wrongDirectionTrap();
    }

    /**
     * 1. The Semicolon Trap (The Empty Loop Body)
     * Output: Hello 5
     */
    public static void semicolonTrap() {
        int i = 0;
        
        // TRAP: The semicolon (;) right after the parentheses terminates 
        // the for loop instantly. The loop runs entirely on its own until i = 5.
        for (i = 0; i < 5; i++); 
        
        // This code block is NOT part of the loop. 
        // It is an independent block that executes only ONCE after the loop finishes.
        {
            System.out.println("Hello " + i); 
        }
    }

    /**
     * 2. The Byte Overflow Infinite Loop
     * Result: Infinite Loop
     */
    public static void byteOverflowTrap() {
        // TRAP: A byte in Java ranges from -128 to 127. 
        // When b reaches 127, b++ causes an arithmetic overflow, 
        // wrapping the value around straight to -128.
        for (byte b = 0; b < 128; b++) {
            System.out.println(b);
        }
    }

    /**
     * 3. The Floating-Point Precision Trap
     * Result: Infinite Loop
     */
    public static void floatingPointTrap() {
        // TRAP: Due to IEEE 754 floating-point standards, decimals like 0.1 
        // cannot be represented with exact precision in binary format.
        // Accumulated rounding errors mean 'd' will never equal 1.0 precisely.
        for (double d = 0.0; d != 1.0; d += 0.1) {
            System.out.println(d);
        }
    }

    /**
     * 4. The Infinite "Wrong Direction" Loop
     * Result: Infinite Loop (Counts down into negative integers)
     */
    public static void wrongDirectionTrap() {
        // TRAP: The loop condition expects i to move toward 10 (checking if i < 10),
        // but the update statement decrements i (i--), moving it into negative numbers.
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }
}
