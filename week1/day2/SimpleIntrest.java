package day2;

import java.util.Scanner;

public class SimpleIntrest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, t, r = 0;
        System.out.print("Enter principal");
        p = sc.nextInt();
        System.out.print("Enter time");
        t = sc.nextInt();
        System.out.print("Enter rate");
        r = sc.nextInt();
        int SI = (p * t * r) / 100;
        System.out.println(SI);
    }
}