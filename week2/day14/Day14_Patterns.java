/*
===========================================================
Day 14 — Pattern Printing
===========================================================

🧠 CONCEPT:
Pattern problems are based on nested loops.

👉 Outer Loop → Controls ROWS
👉 Inner Loop → Controls COLUMNS

-----------------------------------------------------------
🔑 BASIC RULE:
-----------------------------------------------------------
for (rows)
    for (columns)
        print()

-----------------------------------------------------------
📌 PRINT FUNCTIONS:
-----------------------------------------------------------
print()   → same line
println() → next line

-----------------------------------------------------------
🧠 THINKING APPROACH:
-----------------------------------------------------------
1. Number of rows?
2. Number of columns?
3. Spaces needed?
4. What to print? (* / number / space)

-----------------------------------------------------------
🔥 PATTERN TYPES:
-----------------------------------------------------------
✔ Square → rows = columns
✔ Triangle → columns depend on row
✔ Pyramid → spaces + stars
✔ Hollow → boundary condition
✔ Number pattern → value logic

-----------------------------------------------------------
⚙️ COMPLEXITY:
-----------------------------------------------------------
Time Complexity: O(n²)
Space Complexity: O(1)

-----------------------------------------------------------
🧠 MEMORY TRICKS:
-----------------------------------------------------------
Square:
👉 rows = columns

Triangle:
👉 columns = row number

Pyramid:
👉 spaces = n - i
👉 stars = 2*i - 1

0-1 Pattern:
👉 flip using → start = 1 - start
*/

package day14;

public class Day14_Patterns {

    // 🔵 PATTERN 1 — SQUARE
    public static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 🔵 PATTERN 2 — RIGHT TRIANGLE
    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 🔵 PATTERN 3 — INVERTED TRIANGLE
    public static void pattern3() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 🔵 PATTERN 4 — NUMBER TRIANGLE
    public static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // 🔵 PATTERN 5 — DIAMOND (HALF)
    public static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // 🔵 PATTERN 6 — RIGHT ALIGNED TRIANGLE
    public static void pattern6() {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    // 🔵 PATTERN 7 — PYRAMID
    public static void pattern7() {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    // 🔵 PATTERN 8 — BUTTERFLY
    public static void pattern8() {
        int n = 5;

        // top
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // bottom
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    // 🔵 PATTERN 9 — HOLLOW RECTANGLE
    public static void pattern9() {
        int r = 4, c = 4;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {

                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 🔵 PATTERN 10 — NUMBER STAIRCASE
    public static void pattern10() {
        int n = 5, num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    // 🔵 PATTERN 11 — ROW NUMBER TRIANGLE
    public static void pattern11() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    // 🔵 PATTERN 12 — 0-1 TRIANGLE
    public static void pattern12() {
        for (int i = 1; i <= 5; i++) {

            int start = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();
        }
    }

    // 🚀 MAIN METHOD
    public static void main(String[] args) {

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
    }
}