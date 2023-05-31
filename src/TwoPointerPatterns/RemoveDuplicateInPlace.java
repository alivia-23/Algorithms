package TwoPointerPatterns;

import java.util.Map;

/**
 * Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once.
 * The relative order of the elements should be kept the same and you should not use any extra space so that the solution has a space
 * complexity of O(1).
 * Move all the unique elements at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.
 *
 * Example 1:
 * Input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 *
 * Example 2:
 * Input: [2, 2, 2, 11]
 * Output: 2
 */
public class RemoveDuplicateInPlace {
    public static int removeDuplicates(int[] nums) {
        int left = 1;

        for (int right = 1; right < nums.length; right++) {
            if (nums[left - 1] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 11};
        System.out.println(removeDuplicates(nums));

        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicates(nums1));
    }
}
