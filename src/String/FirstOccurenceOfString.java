package String;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurenceOfString {
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        for (int start = 0; start <= l1 - l2; start++) {
            for (int i = 0; i < l2; i++) {
                if (haystack.charAt(start + i) != needle.charAt(i)) {
                    break;
                }
                if (i == l2 - 1) {
                    return start;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = "ll";

        System.out.println(strStr(s, s1));
    }

}
