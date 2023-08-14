package String;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 *
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 *
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 */
public class MergeAlternately {
    public static String mergeStringAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < n) {
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        //String word1 = "abc";
        //String word2 = "pqr";
        String word1 = "ab";
        String word2 = "pqrs";
        String result = mergeStringAlternately(word1, word2);
        System.out.println(result);
    }
}
