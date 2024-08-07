package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * You have an array of integers, nums of length n spanning 0 to n with one missing. Write a function missing_number
 * that returns the missing number in the array.
 * Note: Complexity of \(O(n)\) required.
 *
 * Example:
 * Input:
 * nums = [0,1,2,4,5]
 * missing_number(nums) -> 3
 */
public class FindMissingNumber {
    public static int findMissingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5};
        System.out.println(findMissingNumber(nums));
    }
}
