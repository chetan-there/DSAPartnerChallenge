package day2;

import java.util.Scanner;

public class OperatorAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        int a = 10, b = 20;
        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else {
            System.out.println(a / b);
        }
    }

}
