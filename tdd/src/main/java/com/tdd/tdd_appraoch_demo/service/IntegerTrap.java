package com.tdd.tdd_appraoch_demo.service;

public class IntegerTrap {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println("a == b: " + (a == b));  // true
        System.out.println("c == d: " + (c == d));  // false
    }
}
