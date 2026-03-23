/*
===========================================================
Day 9 — Binary Search
DSA Partner Challenge | Week 2: Searching + Arrays
===========================================================

🧠 MAIN IDEA:
Binary Search is used to find an element in a SORTED array
by repeatedly dividing the search space into half.

-----------------------------------------------------------
📉 BEFORE (Linear Search)
-----------------------------------------------------------
- We check each element one by one
- Worst case: check ALL elements

Example:
Find 23 in [2,5,8,12,16,23,38,56]

Steps:
2 → 5 → 8 → 12 → 16 → 23  (6 steps)

Time Complexity: O(n)

-----------------------------------------------------------
🚀 AFTER (Binary Search)
-----------------------------------------------------------
- We check the MIDDLE element
- Eliminate HALF of the array each step

Example:
Find 23 in [2,5,8,12,16,23,38,56]

Step 1: mid = 12 → 12 < 23 → go RIGHT
Step 2: mid = 38 → 38 > 23 → go LEFT
Step 3: mid = 23 → FOUND

Steps: only 3 😳

Time Complexity: O(log n)

-----------------------------------------------------------
⚡ BENEFIT
-----------------------------------------------------------
n = 1,000,000

Linear Search → ~1,000,000 steps
Binary Search → ~20 steps

🔥 HUGE PERFORMANCE BOOST

-----------------------------------------------------------
⚠️ CONDITIONS (VERY IMPORTANT)
-----------------------------------------------------------
You can use Binary Search ONLY IF:

1. Array must be SORTED (ascending or descending)
2. Random access allowed (array, not linked list)
3. You are SEARCHING for something (not traversing)

-----------------------------------------------------------
❌ DO NOT USE WHEN:
-----------------------------------------------------------
- Array is UNSORTED
- You need to process ALL elements (like Spiral Matrix)
- Structure is Linked List

-----------------------------------------------------------
🧠 CORE LOGIC
-----------------------------------------------------------
We maintain two pointers:

low  → start of array
high → end of array

Each step:
mid = low + (high - low) / 2   // avoids overflow

-----------------------------------------------------------
3 CASES:
-----------------------------------------------------------
1. arr[mid] == target → FOUND
2. arr[mid] < target  → go RIGHT (low = mid + 1)
3. arr[mid] > target  → go LEFT  (high = mid - 1)

-----------------------------------------------------------
IMPORTANT:
Use:
mid = low + (high - low) / 2

NOT:
mid = (low + high) / 2 ❌ (can overflow)

===========================================================
*/
package day9;

public class Day9_BinarySearch {

    // 🔥 MAIN FUNCTION (Iterative Binary Search)
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        // loop until search space exists
        while (low <= high) {

            // safe mid calculation
            int mid = low + (high - low) / 2;

            // CASE 1: FOUND
            if (arr[mid] == target) {
                return mid;
            }

            // CASE 2: GO RIGHT
            else if (arr[mid] < target) {
                low = mid + 1;
            }

            // CASE 3: GO LEFT
            else {
                high = mid - 1;
            }
        }

        // element not found
        return -1;
    }

    /*
     * ===========================================================
     * 🧠 WHY THIS WORKS
     * ===========================================================
     * 
     * Each step reduces search space by HALF:
     * 
     * Example:
     * 100 elements → 50 → 25 → 12 → 6 → 3 → 1
     * 
     * That’s why time = log(n)
     * 
     * ===========================================================
     * 🧠 INTERVIEW IMPORTANT VARIATIONS
     * ===========================================================
     * 
     * 1. First Occurrence
     * 2. Last Occurrence
     * 3. Lower Bound / Upper Bound
     * 4. Search in Rotated Sorted Array
     * 5. Binary Search on Answer (VERY IMPORTANT)
     * 
     * ===========================================================
     * 🧪 DRY RUN
     * ===========================================================
     * 
     * arr = [2,5,8,12,16,23,38,56,72,91]
     * target = 23
     * 
     * low=0, high=9
     * 
     * Step 1:
     * mid=4 → arr[4]=16 → 16 < 23 → low=5
     * 
     * Step 2:
     * mid=7 → arr[7]=56 → 56 > 23 → high=6
     * 
     * Step 3:
     * mid=5 → arr[5]=23 → FOUND ✅
     * 
     * ===========================================================
     */

    // 🚀 DRIVER CODE
    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        int target = 23;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

/*
 * ===========================================================
 * 🧠 FINAL MEMORY TRICK
 * ===========================================================
 * 
 * Binary Search = "Divide & Conquer"
 * 
 * 👉 Always ask:
 * "Is array sorted?"
 * YES → Think Binary Search
 * NO → Think Linear / Hashing
 * 
 * ===========================================================
 * 🔥 NEXT STEP FOR YOU
 * ===========================================================
 * 
 * Now you should solve:
 * 
 * 1. LC #69 → Square Root (Binary Search on Answer)
 * 2. LC #34 → First & Last Position
 * 3. LC #374 → Guess Number
 * 
 * ===========================================================
 */