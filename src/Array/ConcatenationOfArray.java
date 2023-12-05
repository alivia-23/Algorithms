package Array;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 *
 * Example 1:
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Example 2:
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 */
public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] answer = new int[2 * nums.length];

        for (int i = 0; i < answer.length; i++) {
            if (i < nums.length) {
                answer[i] = nums[i];
            } else {
                answer[i] = answer[i - nums.length];
            }
        }
        return answer;
    }

    public static void printAll(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 1};
        int[] nums = {1,3,2,1};
        int[] answer = getConcatenation(nums);
        printAll(answer);
    }

}
