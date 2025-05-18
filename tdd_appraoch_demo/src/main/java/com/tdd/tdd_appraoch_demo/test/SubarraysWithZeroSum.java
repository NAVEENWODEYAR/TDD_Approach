package com.tdd.tdd_appraoch_demo.test;

/**
 * @author Naveen K Wodeyar
 * @date 17-May-2025
 */

public class SubarraysWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == 0) {
                    System.out.println("Subarray [" + start + "..." + end + "]");
                }
            }
        }
    }
}

