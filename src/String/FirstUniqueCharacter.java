package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacter {
    public static int firstUniqueCharacter(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = map.get(c);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "loveleetcode";
        String s2 = "aabb";
        String s3 = null;
        String s4 = "";

        System.out.println(firstUniqueCharacter(s4));
    }

}
