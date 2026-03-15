package day7;

public class SecondLargeSmallNum {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.print("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("secound smallest : " + arr[1]);
        System.out.println("secound largest : " + arr[arr.length - 2]);
    }
}