package SlidingWindowPatternProblems;
import java.util.Map;
import java.util.HashMap;
public class LengthOfLongestSubstringKDistinct {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLength = 0;

        // map will hold the frequency of the characters
        Map<Character, Integer> charMap = new HashMap<>();

        // to track the start index fo the sliding window
        int start = 0;

        // loop through all the characters in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // add characters in the map based on their frequency
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);

            // when the size of character map is greater than k,
            // we will slide the window from start index and subtract one element from start
            // increment start index until we reach size of map equal to k
            while (charMap.size() > k) {
                char leftChar = s.charAt(start);
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                start++;
            }

            // track maxlength everytime we add an element in the map
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
        System.out.println(lengthOfLongestSubstringKDistinct("aa", 1));
    }
}
