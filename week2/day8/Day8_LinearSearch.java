/*
===========================================================
Day 8 — Linear Search
DSA Partner Challenge | Week 2: Searching + Arrays
===========================================================

🧠 MAIN IDEA:
Linear Search means checking each element ONE BY ONE
from left to right until we find the target.

-----------------------------------------------------------
📉 BEFORE (No algorithm / guessing)
-----------------------------------------------------------
- You randomly check elements
- No structure, no guarantee
- Inefficient and messy

-----------------------------------------------------------
🚀 AFTER (Using Linear Search)
-----------------------------------------------------------
- You systematically check each element
- Start from index 0 → go till end
- Stop when target is found

-----------------------------------------------------------
⚡ BENEFITS
-----------------------------------------------------------
1. Works on UNSORTED arrays ✅
2. Very easy to implement ✅
3. Can find ALL occurrences ✅
4. Works on ANY data structure (array, linked list) ✅

-----------------------------------------------------------
❌ LIMITATIONS
-----------------------------------------------------------
- Slow for large data (O(n))
- Not efficient for big inputs

Example:
n = 1,000,000 → worst case = 1,000,000 steps 😓

-----------------------------------------------------------
🧠 WHEN TO USE
-----------------------------------------------------------
✔ Array is UNSORTED
✔ Data size is SMALL
✔ Need ALL occurrences
✔ Working with Linked List

-----------------------------------------------------------
❌ WHEN NOT TO USE
-----------------------------------------------------------
✖ Array is SORTED → use Binary Search instead
✖ Need faster search for large data

-----------------------------------------------------------
🧠 CORE LOGIC
-----------------------------------------------------------
Loop through array:
Compare each element with target

IF match found → return index
ELSE continue

If not found → return -1

===========================================================
*/
package day8;

import java.util.ArrayList;

public class Day8_LinearSearch {

    // 🔥 1. FIND FIRST OCCURRENCE
    public static int linearSearch(int[] arr, int target) {

        // Traverse each element
        for (int i = 0; i < arr.length; i++) {

            // Check if current element == target
            if (arr[i] == target) {
                return i; // return index immediately
            }
        }

        // If not found
        return -1;
    }

    /*
     * ===========================================================
     * 🧠 WHY THIS WORKS
     * ===========================================================
     * 
     * We check EVERY element.
     * Guaranteed to find target if it exists.
     * 
     * Worst case:
     * Target is at last position OR not present
     * 
     * ===========================================================
     */

    // 🔥 2. FIND ALL OCCURRENCES
    public static ArrayList<Integer> searchAll(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                result.add(i); // store index
            }
        }

        return result;
    }

    /*
     * ===========================================================
     * 🧠 USE CASE
     * ===========================================================
     * 
     * Input: [1,2,3,2,4,2]
     * Target: 2
     * 
     * Output: [1,3,5]
     * 
     * ===========================================================
     */

    // 🔥 3. SEARCH IN 2D ARRAY (MATRIX)
    public static int[] search2D(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {
                    return new int[] { i, j }; // return row, col
                }
            }
        }

        return new int[] { -1, -1 }; // not found
    }

    /*
     * ===========================================================
     * 🧠 DRY RUN (IMPORTANT)
     * ===========================================================
     * 
     * arr = [10,20,30,40]
     * target = 30
     * 
     * Step 1: i=0 → 10 != 30
     * Step 2: i=1 → 20 != 30
     * Step 3: i=2 → 30 == 30 → FOUND ✅
     * 
     * Return index = 2
     * 
     * ===========================================================
     */

    // 🚀 DRIVER CODE
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 30 };

        int target = 30;

        // First occurrence
        int index = linearSearch(arr, target);
        System.out.println("First occurrence index: " + index);

        // All occurrences
        ArrayList<Integer> allIndices = searchAll(arr, target);
        System.out.println("All occurrences: " + allIndices);

        // 2D search
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[] pos = search2D(matrix, 5);
        System.out.println("Position in matrix: [" + pos[0] + ", " + pos[1] + "]");
    }
}

/*
 * ===========================================================
 * ⚖️ LINEAR vs BINARY SEARCH
 * ===========================================================
 * 
 * Linear Search:
 * - Works on unsorted data
 * - Checks one by one
 * - Time: O(n)
 * 
 * Binary Search:
 * - Requires sorted data
 * - Divides into half
 * - Time: O(log n)
 * 
 * ===========================================================
 * 🧠 FINAL MEMORY TRICK
 * ===========================================================
 * 
 * Linear Search = "Check everything"
 * 
 * Binary Search = "Divide and conquer"
 * 
 * ===========================================================
 * 🔥 NEXT STEP
 * ===========================================================
 * 
 * Now you should:
 * 
 * 1. Practice 2D array search problems
 * 2. Compare Linear vs Binary deeply
 * 3. Move to Binary Search (Day 9)
 * 
 * ===========================================================
 */