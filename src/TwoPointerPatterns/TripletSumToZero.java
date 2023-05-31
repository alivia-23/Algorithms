package TwoPointerPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum problem from leetcode
 *
 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 * Input: [-3, 0, 1, 2, -1, 1, -2]
 * Output: [[-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]]
 *
 * Example 2:
 * Input: [-5, 2, -1, -2, 3]
 * Output: [[-5, 2, 3], [-2, -1, 3]]
 */
public class TripletSumToZero {
    public static List<List<Integer>> findTripletsToZero(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i-1] != nums[i]) {
                findTriplets(nums, i, result);
            }
        }
        return result;
    }

    public static void findTriplets(int[] nums, int i, List<List<Integer>> result) {
        int low = i + 1;
        int high = nums.length - 1;

        while (low < high) {
            int sum = nums[i] + nums[low] + nums[high];

            if (sum < 0) {
                low++;
            } else if (sum > 0) {
                high--;
            } else {
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1]) {
                   low++;
                }
            }
        }
    }
}
