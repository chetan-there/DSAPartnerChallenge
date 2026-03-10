package day1;

import java.util.Scanner;

public class HCF_LCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        while (y != 0) {
            int temp = y;
            y = y % x;
            x = temp;
        }

        System.out.println("GCD = " + x);
    }

}