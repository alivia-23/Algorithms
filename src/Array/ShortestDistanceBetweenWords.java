package Array;

/**
 * Given an array of strings words and two different strings that already exist in the array word1 and word2,
 * return the shortest distance between these two words in the list.
 *
 * Example 1:-
 * Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
 * Output: 5
 * Explanation: The distance between "fox" and "dog" is 5 words.
 *
 * Example 2:-
 * Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
 * Output: 1
 * Explanation: The shortest distance between "a" and "b" is 1 word. Please note that "a" appeared twice.
 *
 */

public class ShortestDistanceBetweenWords {
    public static int findShortestDistance(String[] words, String word1, String word2) {
        int shortestDistance = Integer.MAX_VALUE;
        int position1 = -1;
        int position2 = -1;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                position1 = i;
            } else if (word.equals(word2)) {
                position2 = i;
            }
        }
        shortestDistance = Math.min(shortestDistance, Math.abs(position1 - position2));
        return shortestDistance;
    }

    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word1 = "fox", word2 = "dog";

        System.out.println(findShortestDistance(words, word1, word2));
    }
}
