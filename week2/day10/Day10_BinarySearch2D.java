
/*
===========================================================
Day 10 — Binary Search on 2D Arrays
DSA Partner Challenge | Week 2: Searching + Arrays
===========================================================

🧠 MAIN IDEA:
A sorted 2D matrix can be treated like a 1D sorted array.

👉 We DON'T actually convert it.
👉 We just "IMAGINE" it as 1D.

-----------------------------------------------------------
📉 BEFORE (Normal Matrix Search)
-----------------------------------------------------------
- We check each element (Linear Search)
- Time: O(m × n)

Example:
Matrix = 3x3 → 9 elements → worst case check all 9

-----------------------------------------------------------
🚀 AFTER (Binary Search on Matrix)
-----------------------------------------------------------
- Treat matrix like a flat sorted array
- Apply Binary Search

Time: O(log(m × n)) 😳

-----------------------------------------------------------
⚡ BENEFITS
-----------------------------------------------------------
1. Very fast search
2. Works like normal binary search
3. No extra space needed

-----------------------------------------------------------
⚠️ CONDITIONS (VERY IMPORTANT)
-----------------------------------------------------------
You can use this ONLY IF:

✔ Each row is sorted
✔ First element of next row > last of previous row

Example VALID matrix:
1  3  5
7  9 11
13 15 17

(fully sorted if flattened)

-----------------------------------------------------------
❌ DO NOT USE WHEN:
-----------------------------------------------------------
✖ Rows are sorted but overlapping
✖ Only row-wise sorted (then use staircase search)

-----------------------------------------------------------
🧠 CORE TRICK (MOST IMPORTANT PART)
-----------------------------------------------------------

We imagine matrix like:

Index:  0  1  2  3  4  5  6  7  8
Values: 1  3  5  7  9 11 13 15 17

But actual matrix is 2D.

So we convert:

row = mid / number_of_columns
col = mid % number_of_columns

👉 This is THE KEY FORMULA

-----------------------------------------------------------
🧠 WHY THIS WORKS
-----------------------------------------------------------

Because:
- Each row has same number of columns
- So indexing becomes predictable

Example:
mid = 5
cols = 3

row = 5 / 3 = 1
col = 5 % 3 = 2

matrix[1][2] → correct position

===========================================================
*/
package day10;

public class Day10_BinarySearch2D {

    // 🔥 MAIN FUNCTION (Type 1: Fully Sorted Matrix)
    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {

            // mid index in imaginary 1D array
            int mid = low + (high - low) / 2;

            // 🔥 CONVERT 1D INDEX → 2D INDEX
            int row = mid / n;
            int col = mid % n;

            int value = matrix[row][col];

            // CASE 1: FOUND
            if (value == target) {
                return true;
            }

            // CASE 2: GO RIGHT
            else if (value < target) {
                low = mid + 1;
            }

            // CASE 3: GO LEFT
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    /*
     * ===========================================================
     * 🧪 DRY RUN (VERY IMPORTANT)
     * ===========================================================
     * 
     * matrix = {
     * {1,3,5},
     * {7,9,11},
     * {13,15,17}
     * }
     * 
     * target = 9
     * 
     * m=3, n=3 → total = 9 elements
     * 
     * low=0, high=8
     * 
     * Step 1:
     * mid=4 → row=4/3=1, col=4%3=1 → matrix[1][1]=9 → FOUND ✅
     * 
     * ===========================================================
     */

    // 🚀 DRIVER CODE
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };

        int target = 9;

        boolean result = searchMatrix(matrix, target);

        if (result) {
            System.out.println("Element Found ✅");
        } else {
            System.out.println("Element Not Found ❌");
        }
    }
}

/*
 * ===========================================================
 * ⚖️ COMPARISON
 * ===========================================================
 * 
 * Linear Search (2D):
 * Time: O(m × n)
 * 
 * Binary Search (2D):
 * Time: O(log(m × n))
 * 
 * ===========================================================
 * 🧠 MEMORY TRICK
 * ===========================================================
 * 
 * 👉 "Matrix ko flat socho"
 * 
 * index → (row, col)
 * 
 * row = mid / cols
 * col = mid % cols
 * 
 * ===========================================================
 * 🔥 INTERVIEW SIGNAL
 * ===========================================================
 * 
 * If interviewer says:
 * 
 * ✔ "Sorted Matrix"
 * ✔ "Find element"
 * ✔ "Log time needed"
 * 
 * 💥 Think: Binary Search on 2D
 * 
 * ===========================================================
 * 🚀 NEXT STEP
 * ===========================================================
 * 
 * Now you should practice:
 * 
 * 1. LC #74 → This exact problem
 * 2. LC #240 → Staircase Search (IMPORTANT)
 * 3. Count negatives in matrix
 * 
 * ===========================================================
 */