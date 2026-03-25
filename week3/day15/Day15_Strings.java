package week3.day15;
/*
===========================================================
Day 15 — Strings & StringBuilder
DSA Partner Challenge | Week 3
===========================================================

🧠 CONCEPT:
Strings are one of the most important topics in DSA.

-----------------------------------------------------------
🔑 KEY FACTS:
-----------------------------------------------------------
✔ String is an OBJECT (not primitive)
✔ Strings are IMMUTABLE (cannot change after creation)
✔ Use .equals() for comparison (NOT ==)
✔ Stored in String Pool for memory optimization

-----------------------------------------------------------
🧠 MEMORY TRICK:
"String = fixed, StringBuilder = flexible"
===========================================================
*/

public class Day15_Strings {

    /*
     * ===========================================================
     * 🔵 PART 1 — STRING BASICS
     * ===========================================================
     */
    public static void stringMethods() {

        String s = "hello world";

        System.out.println("Length: " + s.length());
        System.out.println("CharAt: " + s.charAt(0));
        System.out.println("Substring: " + s.substring(6, 11));
        System.out.println("IndexOf: " + s.indexOf("world"));
        System.out.println("Contains: " + s.contains("hello"));
        System.out.println("Replace: " + s.replace("hello", "hi"));
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Trim: " + s.trim());
        System.out.println("Equals: " + s.equals("hello world"));
    }

    /*
     * ===========================================================
     * 🔴 PART 2 — STRING IMMUTABILITY
     * ===========================================================
     */
    public static void immutabilityDemo() {

        String s = "hello";
        s.concat(" world"); // does NOT change original string

        System.out.println("Original String: " + s); // still "hello"
    }

    /*
     * ===========================================================
     * 🟢 PART 3 — STRINGBUILDER (FAST)
     * ===========================================================
     */
    public static void stringBuilderDemo() {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" World");

        System.out.println("Append: " + sb);

        sb.insert(5, "!");
        System.out.println("Insert: " + sb);

        sb.delete(5, 6);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("CharAt: " + sb.charAt(0));
        System.out.println("Length: " + sb.length());
    }

    /*
     * ===========================================================
     * 🔵 PART 4 — STRING VS STRINGBUILDER
     * ===========================================================
     */
    public static void performanceTest() {

        // ❌ BAD — O(n²)
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += i;
        }
        System.out.println("Using String: " + result);

        // ✅ GOOD — O(n)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println("Using StringBuilder: " + sb.toString());
    }

    /*
     * ===========================================================
     * 🔴 PART 5 — REVERSE STRING
     * ===========================================================
     */
    public static void reverseString() {

        String s = "hello";

        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println("Reversed: " + reversed);
    }

    /*
     * ===========================================================
     * 🔵 PART 6 — ASCII LOWERCASE CONVERSION
     * ===========================================================
     */
    public static void toLowerCaseManual() {

        String s = "HELLO";
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }

        System.out.println("Manual Lowercase: " + sb.toString());
    }

    /*
     * ===========================================================
     * 🔥 PART 7 — PRACTICE PROBLEMS (IMPORTANT)
     * ===========================================================
     */

    // Q1: Defanging IP Address
    public static String defangIP(String address) {
        return address.replace(".", "[.]");
    }

    // Q2: Shuffle String
    public static String shuffleString(String s, int[] indices) {

        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }

        return new String(res);
    }

    // Q3: Goal Parser
    public static String goalParser(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    /*
     * ===========================================================
     * 🚀 MAIN METHOD
     * ===========================================================
     */
    public static void main(String[] args) {

        System.out.println("---- STRING METHODS ----");
        stringMethods();

        System.out.println("\n---- IMMUTABILITY ----");
        immutabilityDemo();

        System.out.println("\n---- STRINGBUILDER ----");
        stringBuilderDemo();

        System.out.println("\n---- PERFORMANCE ----");
        performanceTest();

        System.out.println("\n---- REVERSE ----");
        reverseString();

        System.out.println("\n---- ASCII LOWERCASE ----");
        toLowerCaseManual();

        System.out.println("\n---- PRACTICE ----");
        System.out.println(defangIP("192.168.1.1"));

        int[] idx = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(shuffleString("codeleet", idx));

        System.out.println(goalParser("G()(al)"));
    }
}

/*
 * ===========================================================
 * ⚖️ FINAL SUMMARY
 * ===========================================================
 * 
 * String:
 * ✔ Immutable
 * ✔ Safe but slow in loops
 * 
 * StringBuilder:
 * ✔ Mutable
 * ✔ Fast (used in loops)
 * 
 * -----------------------------------------------------------
 * 🧠 MEMORY TRICKS:
 * -----------------------------------------------------------
 * String:
 * 👉 "New object everytime"
 * 
 * StringBuilder:
 * 👉 "Same object modify"
 * 
 * ASCII:
 * 👉 A → 65
 * 👉 a → 97
 * 👉 Difference = 32
 * 
 * -----------------------------------------------------------
 * 🔥 INTERVIEW GOLD:
 * -----------------------------------------------------------
 * ✔ Use .equals() for comparison
 * ✔ Use StringBuilder in loops
 * ✔ Know ASCII conversions
 * 
 * ===========================================================
 */