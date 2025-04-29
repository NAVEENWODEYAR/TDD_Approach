package com.tdd.tdd_appraoch_demo.service;

public class StringTrick {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = c.intern();

        System.out.println("a == b: " + (a == b));         // true
        System.out.println("a == c: " + (a == c));         // false
        System.out.println("a == d: " + (a == d));         // true
    }
}

