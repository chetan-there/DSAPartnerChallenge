package day7;

public class SmallestNum {
    public static void main(String[] args) {
        int[] arr = { 45, 12, 78, 3, 56 };

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(arr.length);
        System.out.println("Smallest number: " + smallest);
    }
}