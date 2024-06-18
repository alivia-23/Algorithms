package String;

/**
 * You are given a string s, which contains stars *.
 * In one operation, you can:
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * Note:
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 * Example 1:
 * Input: s = "leet**cod*e"
 * Output: "lecoe"
 * Example 2:
 * Input: s = "erase*****"
 * Output: ""
 */
public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        String s1 = "erase*****";
        String result = removeStars(s);
        String result1 = removeStars(s1);
        System.out.println("result = " +result);
        System.out.println("result = " +result1);
    }
}
