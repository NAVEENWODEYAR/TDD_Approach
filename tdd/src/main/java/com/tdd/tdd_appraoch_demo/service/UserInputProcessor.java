package com.tdd.tdd_appraoch_demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputProcessor {

    // Logic method to greet a user based on name and age
    public String greetUser(String name, int age) {
        return "Hello, " + name + "! You are " + age + " years old.";
    }

    // Logic method to calculate square of a number
    public int squareNumber(int number) {
        return number * number;
    }

    // Use Scanner to read name and age
    public void readWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(greetUser(name, age));
    }

    // Use BufferedReader to read a number and print square
    public void readWithBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Square is: " + squareNumber(num));
    }

    // Main method to run both inputs
    public static void main(String[] args) throws IOException {
        UserInputProcessor processor = new UserInputProcessor();
        processor.readWithScanner();
        processor.readWithBufferedReader();
    }
}
