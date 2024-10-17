package PrefixsumProblems;

/**
 * Given an array nums and a range query (i, j), find the sum of elements between indices i and j.
 * Example
 * Input: arr = [1, 2, 3, 4], i = 1, j = 3
 * Output: 9
 * Justification: The sum of 2, 3 and 4 is 9.
 */
public class FindRangeSum {
    public static int rangeSum(int[] nums, int i, int j) {
        int rangeSum = nums[i];

        for (int p = i + 1; p <= j; p++) {
            rangeSum += nums[p];
        }

        return rangeSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int i = 1, j = 3;
        int result = rangeSum(nums, i, j);
        System.out.println(result);
    }
}
