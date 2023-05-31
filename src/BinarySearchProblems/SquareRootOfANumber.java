package BinarySearchProblems;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.8284, and since we need to return the floor of the square root (integer), hence we returned 2
 */
public class SquareRootOfANumber {
    public static int findSquareRoot(int n) {
        int left = 1;
        int right = n / 2;
        long result;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            result = (long) mid * mid;
            if (result > n) {
                right = mid - 1;
            } else if (result < n) {
                left = mid + 1;
            } else return mid;
        }
        return right;
    }

    public static void main(String[] args) {
        int num = 8;
        int num1 = 4;
        int num2 = 9;
        System.out.println(findSquareRoot(num));
        System.out.println(findSquareRoot(num1));
        System.out.println(findSquareRoot(num2));
    }
}
