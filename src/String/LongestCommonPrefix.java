package String;

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

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestPrefix(str));
    }
}
