package day7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 45, 12, 78, 3, 56 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
