package SlidingWindowPatternProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int findLongestSubstringWithoutRepeatingCharacter(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                end++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLongestSubstringWithoutRepeatingCharacter(s));
    }
}
