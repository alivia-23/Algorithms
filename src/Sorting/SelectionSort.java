package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] vals) {
        /* O(n^2) solution*/
        for (int i = 0; i < vals.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vals.length; j++) {
                if (vals[j] < vals[minIndex]) {
                    minIndex = j;
                }
            }
            swap(vals, minIndex, i);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
