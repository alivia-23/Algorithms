package String;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 * The test cases are generated so that the length of the output will never exceed 105.

 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 *
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 *
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 */
public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (Character.isLetter(c)) {
                word.append(c);
            } else if (c == '[') {
                countStack.push(number);
                wordStack.push(word.toString());
                number = 0;
                word = new StringBuilder();
            } else {
                int count = countStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());
                for (int j = 1; j <= count; j++) {
                    duplicateWord.append(word);
                }
                word = duplicateWord;
            }
        }
        return word.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String s1 = "3[a2[c]]";
        String s2 = "2[abc]3[cd]ef";

        String result = decodeString(s2);
        System.out.println(result);

    }
}
