package DynamicProgramming;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {

    /* Bottom up approach
    * Base cases(0 and 1 steps) are initialized to 1 since there is only one step to reach them
    * Then it iterates from 2 to n filling in each table by the sum of the values of the previous two steps
    * Finally it returns the value of the last cell of the dp table as it holds the total
    * number of ways to reach to that point
     */

    public static int numWaysClimbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * Optimized way of DP
     * In this approach we eleminate the use of an array to store the result of each summation value
     * We will use two variables to store the value of base case and then we keep adding previous with current
     * and update current and return current as the result which will hold the total number of ways to reach
     * to that point
     *  Run Time - O(n)
     *  Space Time - O(1)
     * @param n
     * @return
     */
//    public static int numWaysClimbStairs(int n) {
//        int lastStair = 1; // num ways to land the last one is 1
//        int secondLastStair = 1; // num ways to land from the secondlast stair to the last stair is also 1
//        for (int i = n - 2; i >= 0; i--) {
//            int temp = lastStair;
//            lastStair = lastStair + secondLastStair;
//            secondLastStair = temp;
//        }
//        return lastStair;
//    }

    public static void main(String[] args) {
        int n = 5;  // 8
        int n1 = 3;  // 3
        System.out.println(numWaysClimbStairs(n));
    }
}
