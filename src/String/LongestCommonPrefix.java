package String;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 */
public class LongestCommonPrefix {

    // Brute Force approach ,
    // Time Complexity - O(M.N) where M stands for the length of the base string and N stands for the length of the string array.
    // Space Complexity - O (1)
    public static String longestPrefix(String[] str) {
        String baseString = str[0];
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < baseString.length(); i++) {
            for (int j = 1; j < str.length; j++) {
                String curString = str[j];
                if (i >= curString.length() || baseString.charAt(i) != curString.charAt(i)) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(baseString.charAt(i));
        }
        return commonPrefix.toString();
    }

    // Optimized approach by sorting
    // Time complexity - O(m.k.logn)
    // Space Complexity - O(1)

    // "clap", "claw", "clan", "clean" --Sort--> "clan", "clap", "clap", "clean"
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                return commonPrefix.toString();
            }
            commonPrefix.append(first[i]);
        }
        return commonPrefix.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestPrefix(str)); // Brute Force approach
        System.out.println(longestCommonPrefix(str)); // optimized approach
    }
}
