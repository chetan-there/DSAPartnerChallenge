package day5;

import java.util.*;

public class All_day_5Problems {

    // 1. Palindrome Number
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    // 2. HCF (GCD)
    static int findHCF(int a, int b) {
        int hcf = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    // LCM
    static int findLCM(int a, int b) {
        int hcf = findHCF(a, b);
        return (a * b) / hcf;
    }

    // 3. Vowel or Consonant
    static void checkVowel(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    // 4. Perfect Number
    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        return sum == n;
    }

    // 5. Leap Year
    static boolean isLeapYear(int year) {

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }

    // 6. Sum of Digits
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // 7. Even Days in August
    static int evenDaysInAugust() {
        int count = 0;

        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0)
                count++;
        }

        return count;
    }

    // 8. Sum of negative, positive even, positive odd
    static void numberSums(int[] arr) {

        int neg = 0;
        int posEven = 0;
        int posOdd = 0;

        for (int num : arr) {

            if (num < 0)
                neg += num;

            else if (num % 2 == 0)
                posEven += num;

            else
                posOdd += num;
        }

        System.out.println("Negative Sum = " + neg);
        System.out.println("Positive Even Sum = " + posEven);
        System.out.println("Positive Odd Sum = " + posOdd);
    }

    // 9. Max and Min of 3 numbers
    static void maxMin(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    // 10. Even or Odd
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 11. Voting Eligibility
    static boolean canVote(int age) {
        return age >= 18;
    }

    // 12. Sum of Two Numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // 13. Sum of N numbers until user enters 0
    static void sumUntilZero() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {

            int num = sc.nextInt();

            if (num == 0)
                break;

            sum += num;
        }

        System.out.println("Total Sum = " + sum);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("Palindrome: " + isPalindrome(121));

        int hcf = findHCF(12, 18);
        int lcm = findLCM(12, 18);
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        checkVowel('a');

        System.out.println("Perfect Number: " + isPerfect(6));

        System.out.println("Leap Year: " + isLeapYear(2024));

        System.out.println("Sum of digits: " + sumOfDigits(1234));

        System.out.println("Even days in August: " + evenDaysInAugust());

        int arr[] = { 5, -3, 8, 7, -2, 10 };
        numberSums(arr);

        maxMin(10, 25, 5);

        System.out.println("Is Even: " + isEven(8));

        System.out.println("Can Vote: " + canVote(20));

        System.out.println("Sum = " + sum(10, 20));

        // sumUntilZero(); // uncomment to run
    }
}