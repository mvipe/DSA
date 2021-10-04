

import java.util.Arrays;

public  class cyclicSort {
    public static void main(String args[]) {
        int[] arr = { 4, 1, 2, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        // cyclic sort code
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}