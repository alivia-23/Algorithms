package SlidingWindowPatternProblems;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 *
 * Example 1:
 * Input: nums = [1,0,1,1,0]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1] and we have 3 consecutive ones.
 * The max number of consecutive ones is 4.
 *
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0,1] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1,1] and we have 4 consecutive ones.
 * The max number of consecutive ones is 4.
 */
public class MaxConsecutiveOnesII {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int maxOneCount = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
                maxOneCount++;
            }
            if ((end - start + 1) - maxOneCount > 1) {
                if (nums[start] == 1) {
                    maxOneCount--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        //int[] nums = {1,0,1,1,0};
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
