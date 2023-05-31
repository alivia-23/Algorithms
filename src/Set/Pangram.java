package Set;

import java.util.Set;
import java.util.HashSet;

/**
 * Given a string sentence containing English letters (lower- or upper-case), return true if sentence is a Pangram, or false otherwise.
 *
 * * NOTE:- A Pangram is a sentence where every letter of the English alphabet appears at least once.
 */
public class Pangram {
    public static boolean isPangram(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                seen.add(c);
            }
        }
        return seen.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "TheQuickBrownFoxJumpsOverTheLazyDog";
        String sentence2 = "This is not a pangram";
        String sentence3 = "This 10";
        String sentence4 = "";

        System.out.println(isPangram(sentence));
        System.out.println(isPangram(sentence2));
        System.out.println(isPangram(sentence3));
        System.out.println(isPangram(sentence4));
    }
}
