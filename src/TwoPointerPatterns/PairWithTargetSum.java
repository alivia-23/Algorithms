package TwoPointerPatterns;

/**
 * TwoSum II
 *
 * Given an array of numbers sorted in ascending order and a target sum, find a pair in the array whose sum is equal to the given target.
 *
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
 *
 * Example 1 :-
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 *
 * Example 2 :-
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */
public class PairWithTargetSum {
    public static int[] findPairWithTargetSum(int[] nums, int targetSum) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int curSum = nums[first] + nums[last];
            if (targetSum == curSum) {
                return new int[] {first, last};
            } else if (targetSum > curSum) {
                first++;
            } else if (targetSum < curSum) {
                last--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSum.findPairWithTargetSum(new int[] {1, 2, 3, 4, 6}, 6);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
