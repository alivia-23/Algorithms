package Array;

/**
 * Find the smallest element in an array
 */
public class SmallestElement {
    public static int findSmallest(int[] nums) {
        int smallNum = Integer.MAX_VALUE;

        for (int num : nums) {
            smallNum = Math.min(smallNum, num);
        }
        return smallNum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 1, 2, 4, 1, 2, 9, 34, 56};
        int result = findSmallest(nums);
        System.out.println(result);
    }
}
