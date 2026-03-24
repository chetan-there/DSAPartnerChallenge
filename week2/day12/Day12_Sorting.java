/*
===========================================================
Day 12 — Selection Sort + Insertion Sort
DSA Partner Challenge | Week 2
===========================================================

🧠 TODAY GOALS:
1. Learn Selection Sort
2. Learn Insertion Sort
3. Understand Binary Search on Answer (VERY IMPORTANT)

===========================================================
🟡 PART 1 — SELECTION SORT
===========================================================

📉 BEFORE:
[29, 64, 73, 34, 20]

-----------------------------------------------------------
🚀 AFTER:
[20, 29, 34, 64, 73]

-----------------------------------------------------------
🧠 CORE IDEA:
-----------------------------------------------------------
👉 Find MIN from unsorted part
👉 Swap it to correct position

-----------------------------------------------------------
📦 PASS LOGIC:
-----------------------------------------------------------
Pass 1 → min goes to index 0
Pass 2 → min goes to index 1
...

-----------------------------------------------------------
⚠️ KEY POINTS:
-----------------------------------------------------------
✔ Always O(n²)
✔ Exactly (n-1) swaps
❌ NOT stable

===========================================================
*/
package day12;

public class Day12_Sorting {

    // 🔥 Selection Sort
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /*
     * ===========================================================
     * 🔵 PART 2 — INSERTION SORT
     * ===========================================================
     * 
     * 📉 BEFORE:
     * [12, 11, 13, 5, 6]
     * 
     * -----------------------------------------------------------
     * 🚀 AFTER:
     * [5, 6, 11, 12, 13]
     * 
     * -----------------------------------------------------------
     * 🧠 CORE IDEA:
     * -----------------------------------------------------------
     * 👉 Take one element (key)
     * 👉 Insert it into correct position in sorted part
     * 
     * -----------------------------------------------------------
     * 📦 THINK LIKE CARDS:
     * -----------------------------------------------------------
     * Like arranging playing cards in hand
     * 
     * -----------------------------------------------------------
     * ⚡ KEY ADVANTAGE:
     * -----------------------------------------------------------
     * ✔ Fast for nearly sorted arrays
     * ✔ Stable
     * 
     * ===========================================================
     */

    // 🔥 Insertion Sort
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    /*
     * ===========================================================
     * 🔴 PART 3 — BINARY SEARCH ON ANSWER (VERY IMPORTANT)
     * ===========================================================
     * 
     * 🧠 CORE IDEA:
     * -----------------------------------------------------------
     * 👉 We are NOT searching element
     * 👉 We are searching the BEST POSSIBLE ANSWER
     * 
     * -----------------------------------------------------------
     * 💡 WHEN TO USE:
     * -----------------------------------------------------------
     * ✔ "Maximize minimum"
     * ✔ "Minimize maximum"
     * ✔ Answer lies in a range
     * 
     * -----------------------------------------------------------
     * 🧠 TEMPLATE:
     * -----------------------------------------------------------
     * 
     * 1. Define search space (lo, hi)
     * 2. Pick mid
     * 3. Check if mid is POSSIBLE (feasible)
     * 4. Adjust search space
     * 
     * -----------------------------------------------------------
     * 🔥 EXAMPLE: AGGRESSIVE COWS
     * -----------------------------------------------------------
     * Goal:
     * Maximize minimum distance between cows
     * 
     * -----------------------------------------------------------
     */

    // 🔥 Aggressive Cows (Binary Search on Answer)
    public static int aggressiveCows(int[] stalls, int cows) {

        java.util.Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int answer = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlace(stalls, cows, mid)) {
                answer = mid; // possible → try bigger
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    // Feasibility function
    public static boolean canPlace(int[] stalls, int cows, int dist) {

        int count = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
            }

            if (count >= cows)
                return true;
        }

        return false;
    }

    /*
     * ===========================================================
     * 🧠 WHY THIS WORKS
     * ===========================================================
     * 
     * 👉 If distance = 3 works
     * 👉 Then distance = 2 will also work
     * 
     * 👉 MONOTONIC FUNCTION → Binary Search applies
     * 
     * ===========================================================
     */

    // 🚀 DRIVER CODE
    public static void main(String[] args) {

        int[] arr1 = { 29, 64, 73, 34, 20 };
        selectionSort(arr1);

        System.out.println("Selection Sort:");
        for (int x : arr1)
            System.out.print(x + " ");

        System.out.println();

        int[] arr2 = { 12, 11, 13, 5, 6 };
        insertionSort(arr2);

        System.out.println("Insertion Sort:");
        for (int x : arr2)
            System.out.print(x + " ");

        System.out.println();

        int[] stalls = { 1, 2, 4, 8, 9 };
        int cows = 3;

        System.out.println("Aggressive Cows Answer: " +
                aggressiveCows(stalls, cows));
    }
}

/*
 * ===========================================================
 * ⚖️ FINAL COMPARISON
 * ===========================================================
 * 
 * Selection Sort:
 * Time: O(n²)
 * Stable: ❌
 * 
 * Insertion Sort:
 * Best: O(n)
 * Worst: O(n²)
 * Stable: ✅
 * 
 * ===========================================================
 * 🧠 MEMORY TRICKS
 * ===========================================================
 * 
 * Selection:
 * 👉 "Min dhundo, swap karo"
 * 
 * Insertion:
 * 👉 "Card jaisa insert karo"
 * 
 * Binary Search on Answer:
 * 👉 "Answer guess karo, check karo"
 * 
 * ===========================================================
 * 🔥 INTERVIEW GOLD
 * ===========================================================
 * 
 * If interviewer says:
 * ✔ "Maximize minimum"
 * ✔ "Minimize maximum"
 * 
 * 💥 THINK: Binary Search on Answer
 * 
 */