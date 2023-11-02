package MonotonicStack;

import java.util.Stack;

/**
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 *
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * Example 3:
 *
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 */
public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        // stack is used to keep track of the next greater temperature by storing and calculating the index values of temperatures
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevGreaterTempIdx = stack.pop();
                int numDaysToWait = i - prevGreaterTempIdx;
                result[prevGreaterTempIdx] = numDaysToWait;
            }
            stack.push(i);
        }
        return result;
    }

    public static void printAll(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        //int[] temperatures = {73,74,75,71,69,72,76,73};
        //int[] temperatures = {30,40,50,60};
        int[] temperatures = {30,60,90};
        int[] result = dailyTemperatures(temperatures);
        printAll(result);
    }
}
