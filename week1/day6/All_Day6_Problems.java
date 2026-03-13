package day6;

import java.util.*;

public class All_Day6_Problems {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static String getGrade(int marks) {
        if (marks >= 91)
            return "AA";
        else if (marks >= 81)
            return "AB";
        else if (marks >= 71)
            return "BB";
        else if (marks >= 61)
            return "BC";
        else if (marks >= 51)
            return "CD";
        else if (marks >= 41)
            return "DD";
        else
            return "Fail";
    }

    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    static boolean isPalindrome(int n) {
        if (n < 0)
            return false;
        int original = n, reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    static double simpleInterest(double p, double t, double r) {
        return (p * t * r) / 100;
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    static boolean isPythagorean(int a, int b, int c) {
        int[] nums = { a, b, c };
        Arrays.sort(nums);
        return nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2];
    }

    static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static long sumNaturals(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(getGrade(85));
        System.out.println(factorial(5));
        System.out.println(isPalindrome(121));
        System.out.println(isEven(10));
        System.out.println(isLeapYear(2024));
        System.out.println(areaOfCircle(5));
        System.out.println(simpleInterest(1000, 2, 5));
        System.out.println(fibonacci(7));
        System.out.println(isPythagorean(3, 4, 5));
        printPrimes(10, 30);
        System.out.println(sumNaturals(10));
    }
}