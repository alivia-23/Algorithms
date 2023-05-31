package SlidingWindowPatternProblems;

/**
 * Find the max sum subarray of a fixed size k
 * Example input:
 * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
 */
public class MaxSumSubArray {
    public static int findMaxSumSubarray(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, curSum);
                curSum -= nums[start];
                start++;
            }
        }

        return maxSum;

    }
    public static void main(String[] args) {
        System.out.println(findMaxSumSubarray(new int[] {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));

    }
}