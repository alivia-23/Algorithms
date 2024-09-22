package Array;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class SearchRange {

    // Brute Force approach, time complexity - O(n), space complexity - O(1)
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int start = findFirst(nums, target);
        int end = findLast(nums, target);
        result[0] = start;
        result[1] = end;
        return result;
    }

    private static int findFirst(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    private static int findLast(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Optimized approach, time complexity - O(logn), space complexity - O(1)
    public static int[] searchRange1(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }
        int start = findLeft(nums, target);
        int end = findRight(nums, target);
        return new int[] {start, end};
    }

    private static int findLeft(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    private static int findRight(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void print(int[] result) {
        System.out.print("[");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 6;

        int[] result = new int[2];
        result = searchRange1(nums, target);
        //result = searchRange1(nums1, target1);
        print(result);
    }
}
