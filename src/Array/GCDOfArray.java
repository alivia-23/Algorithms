package Array;

/**
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 * Example 1:
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 *
 * Example 2:
 * Input: nums = [7,5,6,8,3]
 * Output: 1
 *
 * Input: nums = [3,3]
 * Output: 3
 */
public class GCDOfArray {
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return gcd(max, min);
    }

    public static int gcd(int n1, int n2) {
        if (n2 > n1) {
            return gcd(n2, n1);
        }
        while (n2 != 0) {
            int quotient = n2;
            n2 = n1 % n2;
            n1 = quotient;
        }
        return n1;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        int result = findGCD(nums);
        System.out.println(result);
    }

}
