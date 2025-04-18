package com.tdd.tdd_appraoch_demo.test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 18-Apr-2025
 */

public class Java8RandomString {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int STRING_LENGTH = 10; // You can change this length
    private static final int LIMIT = 50; // Number of random strings

    public static void main(String[] args) {
        Random random = new Random();

        IntStream.range(0, LIMIT).forEach(i -> {
            String randomString = random.ints(STRING_LENGTH, 0, CHARACTERS.length())
                    .mapToObj(CHARACTERS::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            System.out.println("Random String " + (i + 1) + ": " + randomString);
        });
    }
}

