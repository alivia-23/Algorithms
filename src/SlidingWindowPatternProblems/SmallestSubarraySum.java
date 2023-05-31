package SlidingWindowPatternProblems;

/**
 * Find the smallest subarray length that is greater than or equal to k
 * Example input:
 * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
 */

public class SmallestSubarraySum {
    public static int findSmallestSubarraySum(int[] nums, int k) {
        int minLength = Integer.MAX_VALUE;
        int curSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            curSum += nums[end];
            while (curSum >= k) {
                minLength = Math.min(minLength, end - start + 1);
                curSum -= nums[start];
                start++;
            }

        }

        return minLength;

    }

    public static void main(String[] args) {
        System.out.println(findSmallestSubarraySum(new int[] {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 8));
    }
}
