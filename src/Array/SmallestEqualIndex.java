package Array;

/**
 * Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
 * x mod y denotes the remainder when x is divided by y.
 * Example 1:
 * Input: nums = [0,1,2]
 * Output: 0
 * Example 2:
 * Input: nums = [4,3,2,1]
 * Output: 2
 */
public class SmallestEqualIndex {
    public static int smallestEqualIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {0,1,2};
        int[] nums = {4,3,2,1};
        int answer = smallestEqualIndex(nums);
        System.out.println(answer);
    }

}
