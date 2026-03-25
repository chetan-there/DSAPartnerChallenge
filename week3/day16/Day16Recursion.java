
/*
========================================================
Day 16 — Recursion
DSA Partner Challenge | Week 3
========================================================

📌 Recursion = Function calling itself
Two parts:
1. Base Case → stops recursion
2. Recursive Case → reduces problem

Template:
returnType solve(input) {
    if (base case) return value;
    return solve(smallerInput);
}
*/
package week3.day16;

import java.util.*;

public class Day16Recursion {

    // ========================================================
    // 1. Factorial
    // ========================================================
    static int factorial(int n) {
        if (n == 0)
            return 1; // base case
        return n * factorial(n - 1); // recursive case
    }

    // ========================================================
    // 2. Fibonacci
    // ========================================================
    static int fib(int n) {
        if (n <= 1)
            return n; // base case
        return fib(n - 1) + fib(n - 2); // recursive case
    }

    // ========================================================
    // 3. Print 1 to N (Forward)
    // ========================================================
    static void print1ToN(int n) {
        if (n == 0)
            return;
        print1ToN(n - 1); // recurse first
        System.out.print(n + " "); // print while unwinding
    }

    // ========================================================
    // 4. Print N to 1 (Backward)
    // ========================================================
    static void printNTo1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " "); // print first
        printNTo1(n - 1); // recurse later
    }

    // ========================================================
    // 5. First Uppercase Character
    // ========================================================
    static char firstUpper(String s, int i) {
        if (i == s.length())
            return '$'; // base case
        if (Character.isUpperCase(s.charAt(i)))
            return s.charAt(i);
        return firstUpper(s, i + 1);
    }

    // ========================================================
    // 6. Sum Triangle from Array
    // ========================================================
    static void sumTriangle(int[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        int[] next = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            next[i] = arr[i] + arr[i + 1];
        }

        sumTriangle(next); // recursive call

        // print current array
        System.out.println(Arrays.toString(arr));
    }

    // ========================================================
    // 7. Find Maximum in Array
    // ========================================================
    static int findMax(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        return Math.max(arr[i], findMax(arr, i + 1));
    }

    // ========================================================
    // 8. Find Minimum in Array
    // ========================================================
    static int findMin(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        return Math.min(arr[i], findMin(arr, i + 1));
    }

    // ========================================================
    // 9. Binary Search (Recursive)
    // ========================================================
    static int binarySearch(int[] arr, int lo, int hi, int target) {
        if (lo > hi)
            return -1;

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            return binarySearch(arr, mid + 1, hi, target);

        return binarySearch(arr, lo, mid - 1, target);
    }

    // ========================================================
    // 10. Reverse String (Two Pointer Recursion)
    // ========================================================
    static void reverse(char[] s, int lo, int hi) {
        if (lo >= hi)
            return;

        char temp = s[lo];
        s[lo] = s[hi];
        s[hi] = temp;

        reverse(s, lo + 1, hi - 1);
    }

    // ========================================================
    // MAIN METHOD (Test All)
    // ========================================================
    public static void main(String[] args) {

        System.out.println("Factorial of 5: " + factorial(5));

        System.out.println("Fibonacci of 6: " + fib(6));

        System.out.print("1 to N: ");
        print1ToN(5);
        System.out.println();

        System.out.print("N to 1: ");
        printNTo1(5);
        System.out.println();

        System.out.println("First Uppercase: " + firstUpper("helloWorld", 0));

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Sum Triangle:");
        sumTriangle(arr);

        System.out.println("Max: " + findMax(arr, 0));
        System.out.println("Min: " + findMin(arr, 0));

        int[] sorted = { 1, 3, 5, 7, 9 };
        System.out.println("Binary Search (5): " + binarySearch(sorted, 0, sorted.length - 1, 5));

        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        reverse(str, 0, str.length - 1);
        System.out.println("Reversed: " + Arrays.toString(str));
    }
}