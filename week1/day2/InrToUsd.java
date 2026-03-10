
package day2;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        double exchangeRate = 0.012; // 1 INR ≈ 0.012 USD

        double usd = inr * exchangeRate;

        System.out.println("Amount in USD = " + usd);
    }
}