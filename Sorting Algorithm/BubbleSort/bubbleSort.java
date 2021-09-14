
import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = { 6, 3, 0, 1, 2, 9, -3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int max_index = -1;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    max_index = j;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
}