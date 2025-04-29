package com.tdd.tdd_appraoch_demo.service;

public class TrickySwap {

    static class NumberWrapper {
        int value;
        NumberWrapper(int value) {
            this.value = value;
        }
    }

    public static void swap(NumberWrapper a, NumberWrapper b) {
        NumberWrapper temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        NumberWrapper num1 = new NumberWrapper(10);
        NumberWrapper num2 = new NumberWrapper(20);

        System.out.println("Before swap: num1 = " + num1.value + ", num2 = " + num2.value);
        swap(num1, num2);
        System.out.println("After swap: num1 = " + num1.value + ", num2 = " + num2.value);
    }
}
