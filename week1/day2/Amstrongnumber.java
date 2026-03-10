package day2;

import java.util.Scanner;

public class Amstrongnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}