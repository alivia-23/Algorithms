package BinarySearchProblems;

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.
 * Example 1:
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10
 */
public class SingleElementInSortedArray {

    //Brute Force
    public static int findSingleElement1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i=i+2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }

    // optimized approach - O(logn)
    // Binary search
    public static int findSingleElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // check if mid index is odd then make it even
            if (mid % 2 != 0) {
                mid = mid - 1;
            }
            // if mid index is even then check value at mid is equal to value at mid + 1 or not?
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }

        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = findSingleElement1(nums);  // brute force approach
        int result1 = findSingleElement(nums);  // binary search approach (optimized)
        System.out.println(result);
        System.out.println(result1);
    }

}
