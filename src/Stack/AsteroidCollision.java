package Stack;
/**
 * We are given an array asteroids of integers representing asteroids in a row.
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right,
 * negative meaning left). Each asteroid moves at the same speed.
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 * Example 1:
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Example 2:
 * Input: asteroids = [8,-8]
 * Output: []
 */

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0
                        && stack.peek() < -ast) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -ast) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(ast);
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
