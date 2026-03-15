package day7;

import java.util.Arrays;

public class MedianArray {

    public static void main(String[] args) {

        int[] arr = { 7, 2, 5 };

        Arrays.sort(arr);

        int n = arr.length;

        double median;

        if (n % 2 == 1) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}

/*
 * Visual Summary
 * Odd length
 * [2,5,7]
 * ↑
 * Median = arr[n/2]
 * 
 * Even length
 * [1,3,4,8]
 * ↑ ↑
 * Median = (arr[n/2-1] + arr[n/2]) / 2
 * 
 */