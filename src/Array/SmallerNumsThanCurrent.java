package Array;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 * Example 1:
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Example 2:
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * Example 3:
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 */
public class SmallerNumsThanCurrent {
    public static int[] smallerNumsThanCurrent(int[] nums) {
        // O(n * n) solution approach
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && curNum > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
