package day7;

public class AvgOfAllElements {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // widening
        double avg = (double) sum / arr.length;

        System.out.println("the avrage of all elements is : " + avg);
    }
}
