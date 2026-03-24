
/*
===========================================================
Day 13 — Cycle Sort
===========================================================

🧠 CONCEPT:
Cycle Sort is based on placing each element at its correct index.

👉 Each number from range [1, n] should be placed at index (value - 1)

-----------------------------------------------------------
🔑 KEY IDEA:
-----------------------------------------------------------
correctIndex = arr[i] - 1

If element is not at correct index → swap it
Else → move ahead

-----------------------------------------------------------
⚙️ TIME & SPACE:
-----------------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1) (in-place)
Stable: ❌ No

-----------------------------------------------------------
📌 WHEN TO USE:
-----------------------------------------------------------
✔ Array contains numbers from 1 to n
✔ Need to find missing / duplicate numbers
✔ Space optimization required

-----------------------------------------------------------
🔥 APPLICATIONS:
-----------------------------------------------------------
1. Sorting numbers in range [1, n]
2. Finding Missing Number
3. Finding Duplicate Number

-----------------------------------------------------------
🧠 MEMORY TRICK:
-----------------------------------------------------------
"Number ko uski correct seat pe bithao"
*/

package day13;

public class Day13_CycleSort {

    // 🔥 Cycle Sort
    public static void cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }
    }

    // 🔵 MISSING NUMBER (0 TO N)
    public static int missingNumber(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j)
                return j;
        }

        return nums.length;
    }

    // 🔴 FIND DUPLICATE
    public static int findDuplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            if (nums[i] != i + 1) {

                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {

                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;

                } else {
                    return nums[i];
                }

            } else {
                i++;
            }
        }

        return -1;
    }

    // 🚀 MAIN
    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 1, 4 };

        System.out.println("Cycle Sort:");
        cycleSort(arr);
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();

        int[] nums1 = { 3, 0, 1 };
        System.out.println("Missing Number: " + missingNumber(nums1));

        int[] nums2 = { 1, 3, 4, 2, 2 };
        System.out.println("Duplicate Number: " + findDuplicate(nums2));
    }
}