package com.unit.mockito.boxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyaar,
 * @Date 08-Feb-2026
 */

public class BoxingDemo {

    // Manual Boxing
    public static Integer manualBoxing(int value) {
        return Integer.valueOf(value);
    }

    // Manual Unboxing
    public static int manualUnboxing(Integer value) {
        return value.intValue();
    }

    // Autoboxing with Collection
    public static List<Integer> addValues(int a, int b) {
        List<Integer> list = new ArrayList<>();
        list.add(a); // autoboxing
        list.add(b); // autoboxing
        return list;
    }

    // Auto-unboxing sum
    public static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i; // auto-unboxing
        }
        return sum;
    }
}
