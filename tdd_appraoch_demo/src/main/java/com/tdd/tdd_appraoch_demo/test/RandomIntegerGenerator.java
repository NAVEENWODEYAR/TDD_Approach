package com.tdd.tdd_appraoch_demo.test;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 18-Apr-2025
 */

public class RandomIntegerGenerator {

    private static final int LIMIT = 50; // Number of random integers to generate
    private static final int MIN = 1;    // Minimum value (inclusive)
    private static final int MAX = 100;  // Maximum value (exclusive)

    public static void main(String[] args) {
        Random random = new Random();

        IntStream.range(0, LIMIT)
                .map(i -> random.nextInt(MAX - MIN) + MIN) // generates between MIN (inclusive) and MAX (exclusive)
                .forEach(i -> System.out.println("Random Integer: " + i));
    }
}
