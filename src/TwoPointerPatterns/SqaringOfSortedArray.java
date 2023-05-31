package TwoPointerPatterns;

/**
 * Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
 *
 * Example 1:
 * Input: [-2, -1, 0, 2, 3]
 * Output: [0, 1, 4, 4, 9]
 *
 * Example 2:
 * Input: [-3, -1, 0, 1, 2]
 * Output: [0, 1, 1, 4, 9]
 */
public class SqaringOfSortedArray {
    public static int[] squaresOfSortedArray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] squares = new int[n];
        int sqrsIdx = n - 1;

        while (left <= right) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];
            if (leftSqr > rightSqr) {
                squares[sqrsIdx] = leftSqr;
                left++;
                sqrsIdx--;
            } else {
                squares[sqrsIdx] = rightSqr;
                right--;
                sqrsIdx--;
            }
        }
        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1, 0, 2, 3};
        int[] result = squaresOfSortedArray(nums);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
