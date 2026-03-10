package day1;

import java.util.Scanner;

public class sumuntilx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }
            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}