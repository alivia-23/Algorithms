package Array;

/**
 * You are given a 0-indexed integer array nums.
 * Swaps of adjacent elements are able to be performed on nums.
 * A valid array meets the following conditions:
 * The largest element (any of the largest elements if there are multiple) is at the rightmost position in the array.
 * The smallest element (any of the smallest elements if there are multiple) is at the leftmost position in the array.
 * Return the minimum swaps required to make nums a valid array.
 *
 * Example 1:
 * Input: nums = [3,4,5,5,3,1]
 * Output: 6
 * Explanation: Perform the following swaps:
 * - Swap 1: Swap the 3rd and 4th elements, nums is then [3,4,5,3,5,1].
 * - Swap 2: Swap the 4th and 5th elements, nums is then [3,4,5,3,1,5].
 * - Swap 3: Swap the 3rd and 4th elements, nums is then [3,4,5,1,3,5].
 * - Swap 4: Swap the 2nd and 3rd elements, nums is then [3,4,1,5,3,5].
 * - Swap 5: Swap the 1st and 2nd elements, nums is then [3,1,4,5,3,5].
 * - Swap 6: Swap the 0th and 1st elements, nums is then [1,3,4,5,3,5].
 * It can be shown that 6 swaps is the minimum swaps required to make a valid array.
 *
 * Example 2:
 * Input: nums = [9]
 * Output: 0
 * Explanation: The array is already valid, so we return 0.
 */
public class MinAdjacentSwaps {
    public static int minSwaps(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        // Loop through the array to find the minIndex and maxIndex
        for (int k = 0; k < nums.length; k++) {
            // find minIndex
            if (nums[k] < nums[minIndex] || nums[k] == nums[minIndex] && k < minIndex) {
                minIndex = k;
            }
            // find maxIndex
            if (nums[k] > nums[maxIndex] || nums[k] == nums[maxIndex] &&
                    k > maxIndex) {
                maxIndex = k;
            }
        }
        // if there's only 1 element in the array then it's already valid array no swaps needed
        if (minIndex == maxIndex) {
            return 0;
        }
        // Calculate the steps
        int steps = 0;

        //calculate number of swaps required to move max element to the right
        // last index of the array subtract by the current maxIndex
        steps += (nums.length - 1) - maxIndex;

        //calculate number of swaps required to move the minIndex to left
        steps += minIndex;

        // since we have swapped already 1 step for swapping max
        // element with min element
        if (minIndex > maxIndex) {
            steps -= 1;
        }

        return steps;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,5,3,1};
        System.out.println(minSwaps(nums));
    }

}
