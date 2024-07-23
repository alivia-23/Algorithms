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
    public static int numWaysClimbStairs(int n) {
        int lastStair = 1; // num ways to land the last one is 1
        int secondLastStair = 1; // num ways to land from the secondlast stair to the last stair is also 1
        for (int i = n - 2; i >= 0; i--) {
            int temp = lastStair;
            lastStair = lastStair + secondLastStair;
            secondLastStair = temp;
        }
        return lastStair;
    }

    public static void main(String[] args) {
        int n = 5;  // 8
        int n1 = 3;  // 3
        System.out.println(numWaysClimbStairs(n));
    }
}
