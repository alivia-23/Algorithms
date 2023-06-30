package SlidingWindowPatternProblems;

/**
 * Find the smallest subarray length that is greater than or equal to k
 * Example input:
 * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
 */

public class MinimumSizeSubarraySum {
    public static int findMinSizeSubarraySum(int[] nums, int k) {
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
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }

    public static void main(String[] args) {
        System.out.println(findMinSizeSubarraySum(new int[] {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 8));
        System.out.println(findMinSizeSubarraySum(new int[] {2,3,1,2,4,3}, 7));
        System.out.println(findMinSizeSubarraySum(new int[] {1,4,4}, 4));
        System.out.println(findMinSizeSubarraySum(new int[] {1,1,1,1,1,1,1,1}, 11));
    }
}
