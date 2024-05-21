package HashMap;

import java.util.HashMap;

/**
 * Given a string s, return true if a permutation of the string could form a
 * palindrome
 *  and false otherwise.
 *
 * Example 1:
 * Input: s = "code"
 * Output: false
 *
 * Example 2:
 * Input: s = "aab"
 * Output: true
 *
 * Example 3:
 * Input: s = "carerac"
 * Output: true
 */
public class PalindromePermutation {
    public static boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (char c : map.keySet()) {
            count += map.get(c) % 2;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        //String s = "code";
        String s = "aab";
        System.out.println(canPermutePalindrome(s));
    }
}
