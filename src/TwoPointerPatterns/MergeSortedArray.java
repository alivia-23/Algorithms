package TwoPointerPatterns;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (q < 0) break;
            if (p >= 0 && nums1[p] > nums2[q]) {
                nums1[i] = nums1[p];
                p--;
            } else {
                nums1[i] = nums2[q];
                q--;
            }
        }
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
        print(nums1);
    }
}