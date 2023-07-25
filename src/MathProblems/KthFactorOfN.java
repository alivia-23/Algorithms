package MathProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
 *
 * Example 1:
 * Input: n = 12, k = 3
 * Output: 3
 * Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
 *
 * Example 2:
 * Input: n = 7, k = 2
 * Output: 7
 * Explanation: Factors list is [1, 7], the 2nd factor is 7.
 *
 * Example 3:
 * Input: n = 4, k = 4
 * Output: -1
 * Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
 */
public class KthFactorOfN {
    /*public int kthFactor(int n, int k) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.size() < k ? -1 : factorsList.get(k - 1);
    }*/

    // Alternate method
    public static int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        System.out.println(kthFactor(n, k));
    }

// Time Complexity : O(N)
// Space Complexity : O(1)


    }
