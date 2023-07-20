package SlidingWindowPatternProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other
 * uppercase English character. You can perform this operation at most k times.
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 */
public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int maxLength = 0;
        int maxCharFrequency = 0; // holds the max frequency of a character's
        Map<Character, Integer> charFrequency = new HashMap<>();
        int start = 0;

        for  (int end = 0; end < s.length(); end++) {
            char letter = s.charAt(end);
            charFrequency.put(letter, charFrequency.getOrDefault(letter, 0) + 1);

            // holds the max frequency of a character
            maxCharFrequency = Math.max(maxCharFrequency, charFrequency.get(letter));

            // if in the current window we have more than k non repeating characters to perform
            // operation on we should shrink the window by moving start forward and remove
            // characters from map
            if ((end - start + 1) - maxCharFrequency > k) {
                char leftChar = s.charAt(start);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, end- start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        String s1 = "AABABBA";
        int k = 2;
        int k1 = 1;
        System.out.println("Example 1 output: " +characterReplacement(s, k));
        System.out.println("Example 1 output: " +characterReplacement(s1, k1));
    }
}
