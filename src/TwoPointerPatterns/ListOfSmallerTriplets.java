package TwoPointerPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given an array of n integers nums and an integer target, return the list of triplets i, j, k with
 *  0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
 *
 */
public class ListOfSmallerTriplets {
    public static List<List<Integer>> findListOfTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    int count = right - left;
                    for (int j = right; j > left; j--) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[j]));
                        count--;
                    }
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findListOfTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(findListOfTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));


    }
}
