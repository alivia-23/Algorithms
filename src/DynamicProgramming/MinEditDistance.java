package DynamicProgramming;

/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * You have the following three operations permitted on a word:
 * Insert a character
 * Delete a character
 * Replace a character
 * Example 1:
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Example 2:
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 */
public class MinEditDistance {
    public int minEditDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // word1 is empty and word2 has a non-empty string
        if (m == 0) {
            return n;
        }
        // word2 is empty and word1 has a non-empty string
        if (n == 0) {
            return m;
        }
        int[][] costDp = new int[m + 1][n + 1];
        // i loops through the word1
        for (int i = 1; i <= m; i++) {
            costDp[i][0] = i;
        }
        // j loops through word2
        for (int j = 1; j <= n; j++) {
            costDp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word2.charAt(j - 1) == word1.charAt(i - 1)) {
                    costDp[i][j] = costDp[i - 1][j - 1];
                } else {
                    int topLeft = costDp[i - 1][j - 1];
                    int top = costDp[i - 1][j];
                    int left = costDp[i][j - 1];
                    costDp[i][j] = Math.min(top, Math.min(left, topLeft)) + 1;
                }
            }
        }
        return costDp[m][n];
    }
}
