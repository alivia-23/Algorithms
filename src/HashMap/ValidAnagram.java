package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Note :- An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *         typically using all the original letters exactly once.
 *
 * Input: s = "listen", t = "silent"
 * Output: true
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public static boolean isValidAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                if (count == 0) {
                    map.remove(c);
                } else {
                    map.put(c, map.getOrDefault(c, 0) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        String s1 = "rat";
        String t1 = "car";
        System.out.println(isValidAnagram(s, t));
        System.out.println(isValidAnagram(s1, t1));
    }
}
