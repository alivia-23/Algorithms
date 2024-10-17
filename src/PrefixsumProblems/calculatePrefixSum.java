package PrefixsumProblems;
/**
 * Note :- Prefix sum is the cumulitive sum of elements in an array up to a certain index
 * Calculate the prefix sum of the following array
 * input = {1,2,3,4};
 * output = {1,3,6,10};
 */
public class calculatePrefixSum {
    public static int[] calculatePrefixSum(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = nums[0];
        int prefixSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum += nums[i];
            result[i] = prefixSum;
        }
        return result;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = calculatePrefixSum(nums);
        printArray(result);
    }
}
