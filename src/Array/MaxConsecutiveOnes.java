package Array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        // holds maximum consecutive ones
        int maxConsecutiveOnes = 0;
        // holds current ones count before getting a zero
        int currentOnesCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentOnesCount++;
            } else { // if we get a zero
                // update maxConsecutiveOnes until now
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentOnesCount);
                // reset currentOnesCount to zero
                currentOnesCount = 0;
            }
        }
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentOnesCount);

        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,0,1,1,1};
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
