package TwoPointerPatterns;

import java.util.Arrays;

/**
 * Given an array of n integers nums and an integer target, find the number of index triplets i, j, k with
 * 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

 * Example 1:
 * Input: nums = [-2,0,1,3], target = 2
 * Output: 2
 *
 * Example 2:
 * Input: nums = [], target = 0
 * Output: 0
 *
 * Example 3:
 * Input: nums = [0], target = 0
 * Output: 0
 */
public class ThreeSumSmaller {
    public static int findThreeSumSmaller(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,0,1,3};
        int target1 = 2;
        System.out.println(findThreeSumSmaller(nums1, target1));
        System.out.println(findThreeSumSmaller(new int[] {3,1,0,-2}, 4));
    }

}
