package SlidingWindowPatternProblems;

import java.util.Map;
import java.util.HashMap;


/**
 * Find the longest substring length with k distinct character
 */
public class LongestSubstringKDistinct {
    public static int findLongestSubstringKDistinct(char[] chs, int k) {
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < chs.length; end++) {
            char c = chs[end];
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = chs[start];
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(findLongestSubstringKDistinct(new char[] {'a', 'a', 'a', 'h', 'h', 'i', 'j', 'j'}, 2));
    }
}

