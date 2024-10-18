package PrefixsumProblems;

/**
 * Given an integer array nums, return the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 * A middleIndex is an index where the sum of the numbers to the left of this index is equal to the sum of the numbers to the right of this index.
 * You can consider the left sum 0 for middleIndex == 0, and right sum 0 for middleIndex == nums.length - 1.
 * If no middleIndex exists in nums, return -1.
 *
 * Example 1:
 * Input: nums = [1, 7, 3, 6, 5, 6]
 * Expected Output: 3
 *
 * Example 2:
 * Input: nums = [2, 1, -1]
 * Expected Output: 0
 *
 * Example 3:
 * Input: nums = [2, 3, 5, 5, 3, 2]
 * Expected Output: -1
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * -1000 <= nums[i] <= 1000
 *
 */
public class FindMiddleIndex {
    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - nums[i] - leftSum;
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums1 = {2, 1, -1};
        int[] nums2 = {2, 3, 5, 5, 3, 2};
        System.out.println(findMiddleIndex(nums));
        System.out.println(findMiddleIndex(nums1));
        System.out.println(findMiddleIndex(nums2));
    }
}
