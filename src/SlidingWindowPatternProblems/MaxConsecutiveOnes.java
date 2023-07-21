package SlidingWindowPatternProblems;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * Example 1:
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Example 2:
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int maxOnesCount = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
                maxOnesCount++;
            }
            if ((end - start + 1) - maxOnesCount > k) {
                if (nums[start] == 1) {
                    maxOnesCount--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        //int k = 2;
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
}
