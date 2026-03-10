package day1;

import java.util.Scanner;

public class leapyear {

    public boolean isleapyear(int year) {
        // Correct leap year logic:
        // Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check whether it is a leap year or not");
        int year = sc.nextInt();
        leapyear l = new leapyear();
        System.out.println(l.isleapyear(year));
        sc.close(); // It's good practice to close the scanner
    }
}
