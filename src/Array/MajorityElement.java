package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > n /2) {
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] nums1 = {2,2,1,1,1,2,2};
        int result = majorityElement(nums1);
        System.out.println(result);
    }
}
