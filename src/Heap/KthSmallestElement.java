package Heap;

import java.util.PriorityQueue;

/**
 * Given an unsorted array of numbers, find Kth smallest number in it.
 *
 * Example 1:
 * Input: [1, 5, 12, 2, 11, 5], K = 3
 * Output: 5
 *
 * Example 2:
 * Input: [1, 5, 12, 2, 11, 5], K = 4
 * Output: 5
 */
public class KthSmallestElement {
    public static int findKthSmallestNumber(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 12, 2, 11, 5};
        int k = 3;
        int result = findKthSmallestNumber(nums, k);
        System.out.println(result);
    }

}
