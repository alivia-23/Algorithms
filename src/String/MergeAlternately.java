package String;

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
            }
            if (j < n) {
                result.append(word2.charAt(j));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String result = mergeStringAlternately(word1, word2);
    }
}
