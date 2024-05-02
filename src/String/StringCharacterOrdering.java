package String;

/**
 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string.
 * Otherwise, return false.
 *
 * Example 1:
 * Input: s = "aaabbb"
 * Output: true
 * Example 2:
 * Input: s = "abab"
 * Output: false
 */
public class StringCharacterOrdering {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}

/**
 * Note :-
 *
 *  Loop through the string and compare in every loop the first and second character
 *  if the first character is 'b' AND the second character is 'a' then found a match for our condition so we simply return false
 *  and after completing the loop if could not find the match for the condition we return true
 */
