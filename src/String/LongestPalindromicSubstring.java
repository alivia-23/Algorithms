package String;

/**
 * Given a string s, return the longest palindromic substring in s.
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"

 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    private static int first = 0;
    private static int maxLength = 0;
    public static String longestPalindromicSubstring(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i); // odd no. of chars
            expand(s, i, i + 1); // even no.chars
        }
        return s.substring(first, first + maxLength);
    }

    private static void expand(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        start++;
        end--;
        if (end - start + 1 > maxLength) {
            maxLength = Math.max(maxLength, end - start + 1);
            first = start;
        }
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindromicSubstring(s));
    }

}
