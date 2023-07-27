package TwoPointerPatterns;

import java.util.Map;

/**
 * You are given two strings s and t consisting of only lowercase English letters.
 * Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the
 * order of the remaining characters.
 *
 * Example 1:
 * Input: s = "coaching", t = "coding"
 * Output: 4
 * Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
 * Now, t is a subsequence of s ("coachingding").
 * It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
 *
 * Example 2:
 * Input: s = "abcde", t = "a"
 * Output: 0
 * Explanation: t is already a subsequence of s ("abcde").
 *
 * Example 3:
 * Input: s = "z", t = "abcde"
 * Output: 5
 * Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
 * Now, t is a subsequence of s ("zabcde").
 * It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
 */
public class AppendCharacters {
    public static int appendCharacters(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int charCount = 0;

        int i = 0;
        int j = 0;
        while (i < sLength && j < tLength) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        charCount = tLength - j;
        return charCount;
    }

    public static void main(String[] args) {
//        String s = "coaching";
//        String t = "coding";
//        String s = "abcde";
//        String t = "a";
        String s = "z";
        String t = "abcde";
        System.out.println(appendCharacters(s, t));
    }
}
