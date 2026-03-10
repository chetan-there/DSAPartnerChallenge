package day2;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is large number");
        } else {
            System.out.println(b + " is the large number");
        }
    }
}
