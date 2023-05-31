package IslandPattern;

/**
 * Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s
 * and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
 *
 * Return the number of closed islands.
 *
 * Example 1 :
 *  Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
 *  Output: 2
 *
 * Example 2 :
 *  Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
 * Output: 1
 */
public class NumberOfClosedIsland {
    static int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };

    static boolean[][] visited;
    public static int countClosedIsland(int[][] grid) {
        int countClosedIsland = 0;
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    if (findClosedIsland(grid, i, j, visited)) {
                        countClosedIsland++;
                    }
                }
            }
        }
        
        return countClosedIsland;
    }
    
    public static boolean findClosedIsland(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        boolean isClosed = true;
        for (int[] dir : directions) {
            int r = i + dir[0];
            int c = j + dir[1];
            if (!findClosedIsland(grid, r, c, visited)) {
                isClosed = false;
            }
        }
        return isClosed;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}
        };
        System.out.println(countClosedIsland(grid));
    }
}
