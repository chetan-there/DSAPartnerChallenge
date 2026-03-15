package day7;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = { 45, 12, 78, 3, 56 };

        int ln = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ln) {
                ln = arr[i];
            }
        }

        System.out.println("larest num : " + ln);
    }
}
