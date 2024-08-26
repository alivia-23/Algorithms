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
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (char key : map1.keySet()) {
            int sValue = map1.get(key);
            if (!map2.containsKey(key)) {
                return false;
            }
            int tValue = map2.get(key);
            if (sValue != tValue) {
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
        String s2 = "bbcc";
        String t2 = "ccbc";
        System.out.println(isValidAnagram(s, t));
        System.out.println(isValidAnagram(s2, t2));
    }
}
