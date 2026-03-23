/*
===========================================================
Day 11 — Binary Search Revision + Bubble Sort
DSA Partner Challenge | Week 2
===========================================================

🧠 TODAY GOAL:
1. Revise Binary Search patterns
2. Learn Bubble Sort (implementation + intuition)

===========================================================
🫧 PART 1 — BUBBLE SORT (MAIN IMPLEMENTATION)
===========================================================

📉 BEFORE:
Array is UNSORTED
Example: [64, 34, 25, 12, 22]

No order → difficult to search efficiently

-----------------------------------------------------------
🚀 AFTER:
Array becomes SORTED
Example: [12, 22, 25, 34, 64]

Now Binary Search can be applied ⚡

-----------------------------------------------------------
🧠 CORE IDEA:
-----------------------------------------------------------
👉 Compare adjacent elements
👉 Swap if left > right
👉 Largest element moves to end each pass

-----------------------------------------------------------
📦 HOW IT WORKS (PASS CONCEPT):
-----------------------------------------------------------
Pass 1 → largest element goes to last
Pass 2 → 2nd largest goes to 2nd last
...
Pass n-1 → array sorted

-----------------------------------------------------------
⚡ OPTIMIZATION:
-----------------------------------------------------------
If in a full pass NO swap happens
👉 Array is already sorted → STOP early

-----------------------------------------------------------
✅ BENEFITS:
-----------------------------------------------------------
✔ Easy to understand
✔ Stable sorting (order preserved)
✔ No extra space needed

-----------------------------------------------------------
❌ LIMITATIONS:
-----------------------------------------------------------
✖ Very slow → O(n²)
✖ Not used in real large systems

-----------------------------------------------------------
🧠 WHEN TO USE:
-----------------------------------------------------------
✔ Small arrays
✔ Learning sorting basics
✔ Stability required

-----------------------------------------------------------
❌ WHEN NOT TO USE:
-----------------------------------------------------------
✖ Large datasets
✖ Performance critical applications

===========================================================
*/
package day11;

public class Day11_Final {

    // 🔥 Optimized Bubble Sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // optimization flag

            // Inner loop → compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped)
                break;
        }
    }

    /*
     * ===========================================================
     * 🧪 DRY RUN
     * ===========================================================
     * 
     * Input: [64, 34, 25, 12, 22]
     * 
     * Pass 1 → [34, 25, 12, 22, 64]
     * Pass 2 → [25, 12, 22, 34, 64]
     * Pass 3 → [12, 22, 25, 34, 64]
     * Pass 4 → no swap → STOP
     * 
     * ===========================================================
     */

    /*
     * ===========================================================
     * 🔁 PART 2 — BINARY SEARCH REVISION (IMPORTANT PATTERNS)
     * ===========================================================
     * 
     * 🔍 BASIC RULE:
     * 👉 Array MUST be SORTED
     * 
     * -----------------------------------------------------------
     * 🧠 PATTERN 1: FIRST & LAST OCCURRENCE
     * -----------------------------------------------------------
     * - When found → DON'T STOP
     * - Move LEFT (first occurrence)
     * - Move RIGHT (last occurrence)
     * 
     * -----------------------------------------------------------
     * 🧠 PATTERN 2: SINGLE ELEMENT (PAIRS)
     * -----------------------------------------------------------
     * - Elements appear twice except one
     * - Make mid EVEN
     * - Compare with mid+1
     * 
     * Logic:
     * if equal → go right
     * else → go left
     * 
     * -----------------------------------------------------------
     * 🧠 PATTERN 3: ROTATED SORTED ARRAY
     * -----------------------------------------------------------
     * - One half is ALWAYS sorted
     * 
     * Check:
     * if (left half sorted)
     * check if target lies inside
     * else
     * check right half
     * 
     * -----------------------------------------------------------
     * 🧠 PATTERN 4: ROTATED ARRAY WITH DUPLICATES
     * -----------------------------------------------------------
     * Problem:
     * arr[lo] == arr[mid] == arr[hi]
     * 
     * Solution:
     * lo++
     * hi--
     * 
     * (reduce search space manually)
     * 
     * -----------------------------------------------------------
     * 🧠 PATTERN 5: FIND MINIMUM (PIVOT)
     * -----------------------------------------------------------
     * Compare mid with HIGH:
     * 
     * if arr[mid] > arr[high]
     * → min in RIGHT
     * else
     * → min in LEFT (or mid)
     * 
     * ⚠️ NEVER compare with low
     * 
     * -----------------------------------------------------------
     * ⚡ CORE THINKING:
     * -----------------------------------------------------------
     * Binary Search = "ELIMINATE HALF"
     * 
     * Every step → reduce problem size
     * 
     * ===========================================================
     */

    // 🚀 DRIVER CODE
    public static void main(String[] args) {

        int[] arr = { 64, 34, 25, 12, 22 };

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * ===========================================================
 * ⚖️ COMPLEXITY
 * ===========================================================
 * 
 * Bubble Sort:
 * 
 * Best Case: O(n) (already sorted)
 * Average Case: O(n²)
 * Worst Case: O(n²)
 * 
 * Space: O(1)
 * 
 * Stable: YES ✅
 * 
 * ===========================================================
 * 🧠 FINAL MEMORY TRICKS
 * ===========================================================
 * 
 * Bubble Sort:
 * 👉 "Har pass me bada element end me bhejo"
 * 
 * Binary Search:
 * 👉 "Har step me aadha hatao"
 * 
 * ===========================================================
 * 🔥 INTERVIEW CONNECTION
 * ===========================================================
 * 
 * 1. Sorting → Bubble, Selection, Merge, Quick
 * 2. Searching → Linear vs Binary
 * 3. Combined → Sort + Binary Search
 * 
 * ===========================================================
 * 🚀 NEXT STEP
 * ===========================================================
 * 
 * Day 12:
 * 👉 Selection Sort
 * 👉 Insertion Sort
 * 
 * ===========================================================
 */