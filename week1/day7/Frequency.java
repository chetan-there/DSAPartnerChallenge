package day7;

import java.util.HashMap;

public class Frequency {

    public static void main(String[] args) {

        int[] arr = { 45, 12, 78, 3, 56, 12, 78, 3, 56, 78, 3, 56, 3, 56 };

        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (nums.containsKey(arr[i])) {
                nums.put(arr[i], nums.get(arr[i]) + 1);
            } else {
                nums.put(arr[i], 1);
            }
        }

        System.out.println("Element Frequency:");

        for (Integer key : nums.keySet()) {
            System.out.println(key + " -> " + nums.get(key));
        }
    }
}