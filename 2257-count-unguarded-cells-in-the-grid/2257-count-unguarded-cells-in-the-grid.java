class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] w : walls) grid[w[0]][w[1]] = -1;
        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        int[] d = {0, 1, 0, -1, 0};
        for(int[] g : guards){
            int x = g[0], y = g[1];
            for(int k = 0; k < 4; k++){
                int i = x + d[k], j = y + d[k + 1];
                while (i >= 0 && i < m && j >= 0 && j < n) {
                    int cell = grid[i][j];
                    if (cell == -1 || cell == 1) break;
                    if (cell == 0) grid[i][j] = 2;
                    i += d[k];
                    j += d[k + 1];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            int[] row = grid[i];
            for (int j = 0; j < n; j++)
                if (row[j] == 0) count++;
        }

        return count;
    }
}
