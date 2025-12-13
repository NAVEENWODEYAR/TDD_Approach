package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar
 * @Date 14-Dec-2025
 */

public class TypeCastingUtil {

    // Widening (Implicit)
    public static short byteToShort(byte b) {
        return b;
    }

    public static int shortToInt(short s) {
        return s;
    }

    public static long intToLong(int i) {
        return i;
    }

    public static float longToFloat(long l) {
        return l;
    }

    public static double floatToDouble(float f) {
        return f;
    }

    public static int charToInt(char c) {
        return c;
    }

    // Narrowing (Explicit)
    public static byte intToByte(int i) {
        return (byte) i;
    }

    public static short intToShort(int i) {
        return (short) i;
    }

    public static int doubleToInt(double d) {
        return (int) d;
    }

    public static float doubleToFloat(double d) {
        return (float) d;
    }

    public static char intToChar(int i) {
        return (char) i;
    }

    // ---------------- INTERVIEW STYLE TEST CASES ----------------
    public static void main(String[] args) {

        System.out.println("=== WIDENING TYPE CASTING ===");

        byte b = 10;
        System.out.println("byte -> short : " + byteToShort(b));

        short s = 200;
        System.out.println("short -> int  : " + shortToInt(s));

        int i = 1000;
        System.out.println("int -> long   : " + intToLong(i));

        long l = 50L;
        System.out.println("long -> float : " + longToFloat(l));

        float f = 12.5f;
        System.out.println("float -> double : " + floatToDouble(f));

        char c = 'A';
        System.out.println("char -> int   : " + charToInt(c));

        System.out.println("\n=== NARROWING TYPE CASTING ===");

        int intVal = 130; // overflow example
        System.out.println("int -> byte   : " + intToByte(intVal));

        int largeInt = 32768; // overflow example
        System.out.println("int -> short  : " + intToShort(largeInt));

        double d = 99.99;
        System.out.println("double -> int : " + doubleToInt(d));

        double d2 = 45.67;
        System.out.println("double -> float : " + doubleToFloat(d2));

        int charValue = 66;
        System.out.println("int -> char   : " + intToChar(charValue));
    }
}
