package String;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Given a 0-indexed string s, permute s to get a new string t such that:
 *
 * All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
 * The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels,
 * then t[i] must not have a higher ASCII value than t[j].
 * Return the resulting string.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.
 * Example 1:
 * Input: s = "lEetcOde"
 * Output: "lEOtcede"
 *
 * Example 2:
 * Input: s = "lYmpH"
 * Output: "lYmpH"
 */
public class SortVowelsString {
    public static String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();
        List<Integer> vowelsPosition = new ArrayList<>();
        char[] chs = s.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            if (isVowel(chs[i])) {
                vowels.add(chs[i]);
                vowelsPosition.add(i);
            }
        }
        Collections.sort(vowels);
        for (int i = 0; i < vowelsPosition.size(); i++) {
            chs[vowelsPosition.get(i)] = vowels.get(i);
        }

        return String.valueOf(chs);

    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "lEetcOde";
        String sortedVowelString = sortVowels(s);
        System.out.println(sortedVowelString);

//        String s = "lYmpH";
//        String sortedVowelString = sortVowels(s);
//        System.out.println(sortedVowelString);

    }

}
