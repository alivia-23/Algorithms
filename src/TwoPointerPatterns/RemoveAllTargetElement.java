package TwoPointerPatterns;

/**
 * Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.
 *
 * Example 1:
 * Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
 * Output: 4
 */
public class RemoveAllTargetElement {
    public static int removeTargetElement(int[] nums, int key) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != key) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 6, 3, 10, 9, 3};
        int key = 3;
        System.out.println(removeTargetElement(nums, key));
    }
}
