package com.unit.mockito.boxing;

import java.util.ArrayList;

/**
 * @author Naveen K Wodeyaar,
 * @Date 08-Feb-2026
 */

public class BoxingWithCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing
        list.add(10);
        list.add(20);
        list.add(30);

        // Auto-unboxing
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}

