package MonotonicStack;

import java.util.Stack;

/**
 * Given a string S, remove all adjacent duplicate characters recursively to generate the resultant string.
 * Examples
 * Input: s = "abccba"
 * Output: ""
 *
 * Input: s = "foobar"
 * Output: "fbar"
 *
 * Input: s = "abcd"
 * Output: "abcd"
 * Explanation: No adjacent duplicates so no changes.
 */

public class RemoveAdjacentDuplicates {
    public static String removeAdjacentDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : chs) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            char c = stack.peek();
            stack.pop();
            result.insert(0, c);
        }
        return result.toString();
    }

    public static void printAll(String s) {
        if (s.length() == 0) {
            System.out.println("Empty String");
        }
        for (char c : s.toCharArray()) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        String s1 = "abccba";
        String s2 = "foobar";
        String s3 = "abcd";
        String result = removeAdjacentDuplicates(s3);
        printAll(result);
    }
}
