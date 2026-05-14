package GRAPH;

public class island_counter {

    static int rows, cols;

    static void dfs(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= rows || j >= cols
                || grid[i][j] == 0)
            return;

        grid[i][j] = 0;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    static int countIslands(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1,1,0,0,0},
                {1,1,0,0,1},
                {0,0,1,0,1},
                {0,0,0,1,1}
        };

        System.out.println("Number of Islands: "
                + countIslands(grid));
    }
}
