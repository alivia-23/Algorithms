package Sorting;

import java.util.Arrays;

/**
 * Counting sort is a non-comparison based algorithm that works well when there is limited range of input values.
 * It is efficient when the range of input values is small compared to the number of elements to be sorted.
 * The basic idea is to count the frequency of each distinct element in the input array and use that information to
 * place the elements in their correct sorted positions
 */
public class CountingSort {
    public static int[] countingSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int[] bucket = new int[max - min + 1];
        for (int num : nums) {
            bucket[num - min]++; // increment the value of the specified number's index's value by 1
        }
        //change the bucket values so that it holds the actual sorted index value
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] += bucket[i - 1];
        }
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            result[bucket[nums[i] - min] - 1] = nums[i];
            bucket[nums[i] - min]--;
        }
        return result;
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] result = countingSort(nums);
        print(result);
    }
}
