package day7;

public class RearrangeAscDesc {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int mid = arr.length / 2;

        // pointers
        int left = mid;
        int right = arr.length - 1;

        // use while loop when you dont know how many time this will iterate
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
