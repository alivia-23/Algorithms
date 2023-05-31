package IslandPattern;

/**
 * Given a 2D array (i.e., a matrix) containing only 1s (land) and 0s (water), find the biggest island in it.
 * Write a function to return the area of the biggest island.
 * An island is a connected set of 1s (land) and is surrounded by either an edge or 0s (water).
 * Each cell is considered connected to other cells horizontally or vertically (not diagonally).
 *
 * Example 1 :
 * Input =   {{ 1, 1, 1, 0, 0 },
 *             { 0, 1, 0, 0, 1 },
 *             { 0, 0, 1, 1, 0 },
 *             { 0, 1, 1, 0, 0 },
 *             { 0, 0, 1, 0, 0 }}
 * Output = 5
 */
public class BiggestIslandArea {

    static int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };
    public static int biggestIsland(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int biggestIslandArea = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    biggestIslandArea = Math.max(biggestIslandArea, dfs(matrix, i, j));
                }
            }
        }
        return biggestIslandArea;
    }

    public static int dfs(int[][] matrix, int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0) {
            return 0;
        }
        int area = 1;
        matrix[i][j] = 0;

        for (int[] dir : directions) {
            int row = i + dir[0];
            int col = j + dir[1];
            area += dfs(matrix, row, col);
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] input = {{ 1, 1, 1, 0, 0 },
                         { 0, 1, 0, 0, 1 },
                         { 0, 0, 1, 1, 0 },
                         { 0, 1, 1, 0, 0 },
                         { 0, 0, 1, 0, 0 }};
        System.out.println(biggestIsland(input));
    }
}
