package MonotonicStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given two integer arrays nums1 and nums2, return an array answer such that answer[i] is the next greater number for every nums1[i] in nums2.
 * The next greater element for an element x is the first element to the right of x that is greater than x. If there is no greater number, output -1 for that number.
 * The numbers in nums1 are all present in nums2 and nums2 is a permutation of nums1.
 *
 * Examples
 * Input: nums1 = [4,2,6], nums2 = [6,2,4,5,3,7]
 * Output: [5,4,7]
 * Explanation: The next greater number for 4 is 5, for 2 is 4, and for 6 is 7 in nums2.
 * Input: nums1 = [9,7,1], nums2 = [1,7,9,5,4,3]
 * Output: [-1,9,7]
 * Explanation: The next greater number for 9 does not exist, for 7 is 9, and for 1 is 7 in nums2.
 */

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Create a Map to keep track of next greater element for the current element
        // Create a stack to find the next greater element
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // process throght the nums2 array to find the next greater element
        for (int num : nums2) {
            // if the top element of stack is less than current element then
            // num is the next greater element of the top of stack element
            // so pop out the element from the stack and put in the map as key and
            // current num as its value(next greater element for this top stack element)
            while (!stack.isEmpty() && stack.peek() < num) {
                int key = stack.pop();
                map.put(key, num);
            }
            stack.push(num);
        }

        // we'll just modify the nums1 array to show the output array
        //first for every element in nums1 array we look at the map if it exists as key in
        // the map and get the next greater element value for that key
        // then replace that key in the nums1 array with its value from the map
        // also for last element in the array we just replace with -1 as
        // we cannot find any next greater element to the last element
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;

    }

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {4,2,6};
//        int[] nums2 = {6,2,4,5,3,7};
        int[] nums1 = {9,7,1};
        int[] nums2 = {1,7,9,5,4,3};
        int[] result = nextGreaterElement(nums1, nums2);
        print(result);
    }
}
