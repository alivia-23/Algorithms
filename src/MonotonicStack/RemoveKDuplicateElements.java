package MonotonicStack;

import java.util.Stack;

/**
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and
 * removing them, causing the left and the right side of the deleted substring to concatenate together.
 * We repeatedly make k duplicate removals on s until we no longer can.
 * Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 * Example 1:
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Example 2:
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 */
public class RemoveKDuplicateElements {
    public static String removeKDuplicateElements(String s, int k) {
        StringBuilder result = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < result.length(); i++) {
            if (i == 0 || result.charAt(i) != result.charAt(i - 1)) {
                stack.push(1);
            } else {
                int count = stack.pop() + 1;
                if (count == k) {
                    result.delete(i - k + 1, i + 1);
                    i = i - k; // point i just before the start index of deleted elements
                } else {
                    stack.push(count);
                }
            }
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
        String s1 = "abcd";
        int k1 = 2;
        String s2 = "deeedbbcccbdaa";
        int k2 = 3;
        String result = removeKDuplicateElements(s2, k2);
        printAll(result);
    }
}
