package com.tdd.tdd_appraoch_demo.service;

public class OverloadNull {
    public static void print(String s) {
        System.out.println("String version");
    }

    public static void print(Object o) {
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        print(null);  // String version
    }
}

